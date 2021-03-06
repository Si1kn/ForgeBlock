package alephinfinity1.forgeblock.container;

import java.util.HashMap;
import java.util.Map;

import alephinfinity1.forgeblock.enchantment.IFBEnchantment;
import alephinfinity1.forgeblock.enchantment.UltimateEnchantment;
import alephinfinity1.forgeblock.init.ModEnchantments;
import alephinfinity1.forgeblock.init.ModStatsModifiers;
import alephinfinity1.forgeblock.item.HotPotatoBookItem;
import alephinfinity1.forgeblock.item.RecombobulatorItem;
import alephinfinity1.forgeblock.item.WoodSingularityItem;
import alephinfinity1.forgeblock.misc.capability.stats_modifier.capability.IItemModifiers;
import alephinfinity1.forgeblock.misc.capability.stats_modifier.capability.ItemModifiersProvider;
import alephinfinity1.forgeblock.mixin.AccessorRepairContainer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.RepairContainer;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.text.StringTextComponent;

public class FBRepairContainer extends RepairContainer {

	private static final int MAX_HPB = 10;
	private static final int MAX_FUMING = 5;
	
	private static final int ULTIMATE_ENCHANT_COST_MULTIPLIER = 50;

	public FBRepairContainer(int p_i50101_1_, PlayerInventory p_i50101_2_) {
		super(p_i50101_1_, p_i50101_2_);	
	}

	public FBRepairContainer(int num, PlayerInventory playerInv, IWorldPosCallable wpc) {
		super(num, playerInv, wpc);
	}

	@Override
	public void updateRepairOutput() {
		ItemStack itemstack = this.inputSlots.getStackInSlot(0);
		ItemStack itemstack2 = this.inputSlots.getStackInSlot(1);
		((AccessorRepairContainer) this).getMaximumCost().set(1);
		int i = 0;
		int j = 0;
		int k = 0;
		if (itemstack.isEmpty()) {
			this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
			((AccessorRepairContainer) this).getMaximumCost().set(0);
			return;
		} else if (itemstack2.getItem() instanceof HotPotatoBookItem) { //Hot potato book handling
			ItemStack itemstack1 = itemstack.copy();
			IItemModifiers im = itemstack1.getCapability(ItemModifiersProvider.ITEM_MODIFIERS_CAPABILITY).orElse(null);
			if(im == null) { //If no IItemModifiers is present, the item is confirmed to be unapplicable.
				this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
				((AccessorRepairContainer) this).getMaximumCost().set(0);
				return;
			} else {
				if(ModStatsModifiers.HOT_POTATO_BOOK.get().isApplicable(itemstack1)) { //Only apply if applicable, otherwise reset.
					if(im.getData(ModStatsModifiers.HOT_POTATO_BOOK.get()) != null) {
						CompoundNBT nbt = im.getData(ModStatsModifiers.HOT_POTATO_BOOK.get()).copy();
						if(((HotPotatoBookItem) itemstack2.getItem()).isFuming()) {
							short fuming = nbt.getShort("FumingAmount");
							if(fuming >= MAX_FUMING) { //If already at max amount, fail to apply.
								this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
								((AccessorRepairContainer) this).getMaximumCost().set(0);
								return;
							} else { //Otherwise, increment by 1
								fuming++;
								nbt.putShort("FumingAmount", fuming);
								im.put(ModStatsModifiers.HOT_POTATO_BOOK.get(), nbt);
							}
						} else {
							short amount = nbt.getShort("Amount");
							if(amount >= MAX_HPB) { //If at max amount
								this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
								((AccessorRepairContainer) this).getMaximumCost().set(0);
								return;
							} else { //Otherwise +1
								amount++;
								nbt.putShort("Amount", amount);
								im.put(ModStatsModifiers.HOT_POTATO_BOOK.get(), nbt);
							}
						}
					} else {
						if(((HotPotatoBookItem) itemstack2.getItem()).isFuming()) {
							CompoundNBT nbt = new CompoundNBT();
							nbt.putShort("FumingAmount", (short) 1);
							im.put(ModStatsModifiers.HOT_POTATO_BOOK.get(), nbt);
						} else {
							CompoundNBT nbt = new CompoundNBT();
							nbt.putShort("Amount", (short) 1);
							im.put(ModStatsModifiers.HOT_POTATO_BOOK.get(), nbt);
						}
					}
				} else {
					this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
					((AccessorRepairContainer) this).getMaximumCost().set(0);
					return;
				}
			}
			this.outputSlot.setInventorySlotContents(0, itemstack1);
			this.detectAndSendChanges();
		} else if (itemstack2.getItem() instanceof WoodSingularityItem) { //Wood singularity handling.
			//ForgeBlock.LOGGER.debug("WoodSingularity placed in anvil slot 2!");
			ItemStack itemstack1 = itemstack.copy();
			IItemModifiers im = itemstack1.getCapability(ItemModifiersProvider.ITEM_MODIFIERS_CAPABILITY).orElse(null);
			if(im == null) { //If no IItemModifiers is present, the item is confirmed to be unapplicable.
				//ForgeBlock.LOGGER.debug("IM is null, returning");
				this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
				((AccessorRepairContainer) this).getMaximumCost().set(0);
				return;
			} else {
				if(ModStatsModifiers.WOOD_SINGULARITY.get().isApplicable(itemstack1)) { //Only apply if applicable, otherwise reset.
					CompoundNBT nbt = new CompoundNBT();
					nbt.putBoolean("Applied", true);
					im.put(ModStatsModifiers.WOOD_SINGULARITY.get(), nbt);
					//ForgeBlock.LOGGER.debug("Wood singularity applied successfully");
				} else {
					this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
					((AccessorRepairContainer) this).getMaximumCost().set(0);
					return;
				}
			}
			this.outputSlot.setInventorySlotContents(0, itemstack1);
			this.detectAndSendChanges();
		} else if (itemstack2.getItem() instanceof RecombobulatorItem) { //Wood singularity handling.
			//ForgeBlock.LOGGER.debug("WoodSingularity placed in anvil slot 2!");
			ItemStack itemstack1 = itemstack.copy();
			IItemModifiers im = itemstack1.getCapability(ItemModifiersProvider.ITEM_MODIFIERS_CAPABILITY).orElse(null);
			if(im == null) { //If no IItemModifiers is present, the item is confirmed to be unapplicable.
				//ForgeBlock.LOGGER.debug("IM is null, returning");
				this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
				((AccessorRepairContainer) this).getMaximumCost().set(0);
				return;
			} else {
				if(ModStatsModifiers.RECOMBOBULATOR.get().isApplicable(itemstack1)) { //Only apply if applicable, otherwise reset.
					CompoundNBT nbt = new CompoundNBT();
					nbt.putBoolean("Applied", true);
					im.put(ModStatsModifiers.RECOMBOBULATOR.get(), nbt);
					//ForgeBlock.LOGGER.debug("Wood singularity applied successfully");
				} else {
					this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
					((AccessorRepairContainer) this).getMaximumCost().set(0);
					return;
				}
			}
			this.outputSlot.setInventorySlotContents(0, itemstack1);
			this.detectAndSendChanges();	
		} else { //If not mod-specific action, return to vanilla handling.
			
			/*
			 * itemstack: the left item
			 * itemstack2: the right item
			 * itemstack1: the result item
			 * 
			 * flag: whether itemstack2 is an enchanted book and has enchanteds on it.
			 * flag1: whether the enchantment is applicable to the itemstack.
			 * flag2: there exists at least one enchant that can be applied to the itemstack.
			 * flag3: there exists at least one enchant that cannot be applied to the itemstack.
			 * 
			 * map: the map of enchantments of the resultant item.
			 * map1: the map of enchantments of the right item.
			 * enchantment: an instance of an enchantment in map
			 * enchantment1: an instance of an enchantment in map1
			 * 
			 * i: cost of repair due to enchantments + k.
			 * j: cost of repair due to item durability repair.
			 * k: cost of repair due to item rename.
			 * 
			 * i3: an iterator that iterates through the size of itemstack2 for repair.
			 * l2: the amount of durability to repair for one repair item.
			 * 
			 * k3: enchantment cost multiplier.
			 * 
			 * i2: the level of the enchantment on the left itemstack.
			 * j2: the level of the enchantment on the result itemstack.
			 */
			
			ItemStack itemstack1 = itemstack.copy();

			Map<Enchantment, Integer> map = EnchantmentHelper.getEnchantments(itemstack1);
			j = j + itemstack.getRepairCost() + (itemstack2.isEmpty() ? 0 : itemstack2.getRepairCost());
			this.materialCost = 0;
			boolean flag = false;

			if (!itemstack2.isEmpty()) {
				if (!net.minecraftforge.common.ForgeHooks.onAnvilChange(this, itemstack, itemstack2, outputSlot, repairedItemName, j)) return;
				flag = itemstack2.getItem() == Items.ENCHANTED_BOOK && !EnchantedBookItem.getEnchantments(itemstack2).isEmpty();
				if (itemstack1.isDamageable() && itemstack1.getItem().getIsRepairable(itemstack, itemstack2)) {
					int l2 = Math.min(itemstack1.getDamage(), itemstack1.getMaxDamage() / 4);
					if (l2 <= 0) {
						this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
						((AccessorRepairContainer) this).getMaximumCost().set(0);
						return;
					}

					int i3;
					for(i3 = 0; l2 > 0 && i3 < itemstack2.getCount(); ++i3) {
						int j3 = itemstack1.getDamage() - l2;
						itemstack1.setDamage(j3);
						++i;
						l2 = Math.min(itemstack1.getDamage(), itemstack1.getMaxDamage() / 4);
					}

					this.materialCost = i3;
				} else {
					if (!flag && (itemstack1.getItem() != itemstack2.getItem() || !itemstack1.isDamageable())) {
						this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
						((AccessorRepairContainer) this).getMaximumCost().set(0);
						return;
					}

					if (itemstack1.isDamageable() && !flag) {
						int l = itemstack.getMaxDamage() - itemstack.getDamage();
						int i1 = itemstack2.getMaxDamage() - itemstack2.getDamage();
						int j1 = i1 + itemstack1.getMaxDamage() * 12 / 100;
						int k1 = l + j1;
						int l1 = itemstack1.getMaxDamage() - k1;
						if (l1 < 0) {
							l1 = 0;
						}

						if (l1 < itemstack1.getDamage()) {
							itemstack1.setDamage(l1);
							i += 2;
						}
					}

					Map<Enchantment, Integer> map1 = EnchantmentHelper.getEnchantments(itemstack2);
					boolean flag2 = false;
					boolean flag3 = false;

					for(Enchantment enchantment1 : map1.keySet()) {
						if (enchantment1 != null) {
							int i2 = map.containsKey(enchantment1) ? map.get(enchantment1) : 0;
							int j2 = map1.get(enchantment1);
							j2 = i2 == j2 ? j2 + 1 : Math.max(j2, i2);
							boolean flag1 = enchantment1.canApply(itemstack);
							if (this.player.abilities.isCreativeMode || itemstack.getItem() == Items.ENCHANTED_BOOK) {
								flag1 = true;
							}

							for(Enchantment enchantment : map.keySet()) {
								if (enchantment != enchantment1 && !enchantment1.isCompatibleWith(enchantment)) {
									flag1 = false;
									++i;
								}
							}

							if (!flag1) {
								flag3 = true;
							} else {
								flag2 = true;
								
								// FB edit: max level limit is modified.
								// Ench table max level applies iff left itemstack is a book, to prevent combining Lv6 books.
								if (enchantment1 instanceof IFBEnchantment && itemstack.getItem() instanceof EnchantedBookItem) {
									if (j2 > ((IFBEnchantment) enchantment1).getEnchantingTableMaxLevel()) {
										j2 = ((IFBEnchantment) enchantment1).getEnchantingTableMaxLevel();
									}
								} else if (j2 > enchantment1.getMaxLevel()) {
									j2 = enchantment1.getMaxLevel();
								}

								map.put(enchantment1, j2);
								
								//FB edit: if the enchantment is an instanceof IFBEnchantment, resort to FB handling
								if (enchantment1 instanceof IFBEnchantment) {
									i += ((IFBEnchantment) enchantment1).getRepairCostForLevel(j2);
								} else { //If not, resort to vanilla handling.
									int k3 = 0;
									switch(enchantment1.getRarity()) {
									case COMMON:
										k3 = 1;
										break;
									case UNCOMMON:
										k3 = 2;
										break;
									case RARE:
										k3 = 4;
										break;
									case VERY_RARE:
										k3 = 8;
									}
	
									if (flag) {
										k3 = Math.max(1, k3 / 2);
									}
	
									i += k3 * j2;
									
									//FB edit: if invalid stack count, change to invalid min instead.
									if (itemstack.getCount() > 1) {
										i = Integer.MIN_VALUE;
									}
								}
							}
						}
					}

					if (flag3 && !flag2) {
						this.outputSlot.setInventorySlotContents(0, ItemStack.EMPTY);
						((AccessorRepairContainer) this).getMaximumCost().set(0);
						return;
					}
				}
			}

			if (org.apache.commons.lang3.StringUtils.isBlank(this.repairedItemName)) {
				if (itemstack.hasDisplayName()) {
					k = 1;
					i += k;
					itemstack1.clearCustomName();
				}
			} else if (!this.repairedItemName.equals(itemstack.getDisplayName().getString())) {
				k = 1;
				i += k;
				itemstack1.setDisplayName(new StringTextComponent(this.repairedItemName));
			}
			if (flag && !itemstack1.isBookEnchantable(itemstack2)) itemstack1 = ItemStack.EMPTY;

			((AccessorRepairContainer) this).getMaximumCost().set(j + i);
			if (i <= 0) {
				itemstack1 = ItemStack.EMPTY;
			}

			if (k == i && k > 0 && ((AccessorRepairContainer) this).getMaximumCost().get() >= 40) {
				((AccessorRepairContainer) this).getMaximumCost().set(39);
			}

			/*
         if (this.maximumCost.get() >= 40 && !this.player.abilities.isCreativeMode) {
            itemstack1 = ItemStack.EMPTY;
         }
			 */

			if (!itemstack1.isEmpty()) {
				int k2 = itemstack1.getRepairCost();
				if (!itemstack2.isEmpty() && k2 < itemstack2.getRepairCost()) {
					k2 = itemstack2.getRepairCost();
				}

				if (k != i || k == 0) {
					k2 = getNewRepairCost(k2);
				}

				itemstack1.setRepairCost(k2);
				EnchantmentHelper.setEnchantments(map, itemstack1);
			}
			
			//Sets the cost to 50 * level, if ultimate is present.
			if (FBRepairContainer.getUltimateLevel(itemstack2) != 0) {
				((AccessorRepairContainer) this).getMaximumCost().set(ULTIMATE_ENCHANT_COST_MULTIPLIER * FBRepairContainer.getUltimateLevel(itemstack2));
			}
			
			//Custom One For All handling, removes every other enchantment.
			if (FBRepairContainer.hasOneForAll(itemstack2) || FBRepairContainer.hasOneForAll(itemstack1)) {
				int telekinesisLevel = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.TELEKINESIS.get(), itemstack1);
				Map<Enchantment, Integer> enchData = new HashMap<>();
				if(telekinesisLevel != 0) {
					enchData.put(ModEnchantments.TELEKINESIS.get(), telekinesisLevel);
				}
				enchData.put(ModEnchantments.ONE_FOR_ALL.get(), 1);
				EnchantmentHelper.setEnchantments(enchData, itemstack1);
			}	

			this.outputSlot.setInventorySlotContents(0, itemstack1);
			this.detectAndSendChanges();
		}
	}

	/**
	 * Checks if an EnchantedBookItem ItemStack contains the enchantment One For All.
	 * @param stack The enchanted book
	 * @return Whether 'One For All' is contained in the book.
	 */
	public static boolean hasOneForAll(ItemStack stack) {
		Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(stack);
		for (Enchantment enchantment : enchantments.keySet()) {
			if (enchantment.equals(ModEnchantments.ONE_FOR_ALL.get())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns the level of the ultimate enchantment on the book.<br>
	 * If multiple ultimate enchants are on the book (which should not be
	 * possible without commands), the first level is returned. <br>
	 * If there are no ultimates on the book, return 0.
	 * @param stack The enchanted book
	 * @return The level of the ultimate enchant on the book, or 0 if absent. 
	 */
	public static int getUltimateLevel(ItemStack stack) {
		Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(stack);
		for (Enchantment enchantment : enchantments.keySet()) {
			if (enchantment instanceof UltimateEnchantment) {
				return enchantments.get(enchantment);
			}
		}
		return 0;
	}
	
	/**
	 * Gets the new repair cost of an item.<br>
	 * Formula: {@code 2 * oldRepairCost + 2} <br>
	 * or {@code 3 * (1 << priorReworks) - 2}
	 * @param oldRepairCost The previous repair cost of the itemstack
	 * @return The new repair cost of the itemstack, dependent on the previous.
	 */
	public static int getNewRepairCost(int oldRepairCost) {
		return (oldRepairCost == 0) ? 4 : (oldRepairCost << 1) + 2;
	}

}
