package alephinfinity1.forgeblock.item;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;

import alephinfinity1.forgeblock.attribute.FBAttributes;
import alephinfinity1.forgeblock.attribute.ModifierHelper;
import alephinfinity1.forgeblock.init.ModEnchantments;
import alephinfinity1.forgeblock.misc.DisplayHelper;
import alephinfinity1.forgeblock.misc.FBItemType;
import alephinfinity1.forgeblock.misc.reforge.IReforgeableItem;
import alephinfinity1.forgeblock.misc.reforge.Reforge;
import alephinfinity1.forgeblock.misc.tier.FBTier;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class FBArmorItem extends ArmorItem implements IFBTieredItem, IReforgeableItem {

	private final FBTier tier;
	private final Multimap<String, AttributeModifier> attributes;
	
	protected static final UUID HELMET_DEFENSE_MODIFIER = UUID.fromString("bf36f795-91a0-4020-97bd-d03ddfc8bed2");
	protected static final UUID HELMET_HEALTH_MODIFIER = UUID.fromString("00feeb8f-5673-4416-9307-3490644cd458");
	
	protected static final UUID CHESTPLATE_DEFENSE_MODIFIER = UUID.fromString("3a4787d7-9225-4315-bc66-4c87019a4d30");
	protected static final UUID CHESTPLATE_HEALTH_MODIFIER = UUID.fromString("705d3e0d-a019-45e6-9fe0-b3a8e5fce2c2");
	
	protected static final UUID LEGGINGS_DEFENSE_MODIFIER = UUID.fromString("e240962e-4802-44f3-a8fc-f7f613476e8f");
	protected static final UUID LEGGINGS_HEALTH_MODIFIER = UUID.fromString("191d4d61-eb5b-4036-94fa-f779d65496e3");
	
	protected static final UUID BOOTS_DEFENSE_MODIFIER = UUID.fromString("c2ab9230-c894-4d7e-b65e-4ca25be42bfc");
	protected static final UUID BOOTS_HEALTH_MODIFIER = UUID.fromString("93a736f1-2668-417f-8062-b72b43c08427");
	
	//Super constructor, don't use
	@Deprecated
	public FBArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);
		tier = FBTier.COMMON;
		attributes = Reforge.emptyModifier();
		// TODO Auto-generated constructor stub
	}
	
	public FBArmorItem(EquipmentSlotType slot, String name, Properties props, FBTier tier, double defenseIn, double healthIn) {
		super(new FBArmorMaterial(name), slot, props);
		this.tier = tier;
		Builder<String, AttributeModifier> builder = ImmutableMultimap.builder();
		switch(slot) {
		case HEAD:
			builder.put(FBAttributes.DEFENSE.getName(), new AttributeModifier(HELMET_DEFENSE_MODIFIER, "Defense modifier", defenseIn, Operation.ADDITION));
			builder.put(SharedMonsterAttributes.MAX_HEALTH.getName(), new AttributeModifier(HELMET_HEALTH_MODIFIER, "Health modifier", healthIn, Operation.ADDITION));
			break;
		case CHEST:
			builder.put(FBAttributes.DEFENSE.getName(), new AttributeModifier(CHESTPLATE_DEFENSE_MODIFIER, "Defense modifier", defenseIn, Operation.ADDITION));
			builder.put(SharedMonsterAttributes.MAX_HEALTH.getName(), new AttributeModifier(CHESTPLATE_HEALTH_MODIFIER, "Health modifier", healthIn, Operation.ADDITION));
			break;
		case LEGS:
			builder.put(FBAttributes.DEFENSE.getName(), new AttributeModifier(LEGGINGS_DEFENSE_MODIFIER, "Defense modifier", defenseIn, Operation.ADDITION));
			builder.put(SharedMonsterAttributes.MAX_HEALTH.getName(), new AttributeModifier(LEGGINGS_HEALTH_MODIFIER, "Health modifier", healthIn, Operation.ADDITION));
			break;
		case FEET:
			builder.put(FBAttributes.DEFENSE.getName(), new AttributeModifier(BOOTS_DEFENSE_MODIFIER, "Defense modifier", defenseIn, Operation.ADDITION));
			builder.put(SharedMonsterAttributes.MAX_HEALTH.getName(), new AttributeModifier(BOOTS_HEALTH_MODIFIER, "Health modifier", healthIn, Operation.ADDITION));
			break;
		default:
			throw new IllegalArgumentException("Armor type cannot be " + slot.getName() + ", it can only be: HEAD, CHEST, LEGS, FEET.");
		}
		attributes = builder.build();
	}
	
	public FBArmorItem(EquipmentSlotType slot, String name, Properties props, FBTier tier, Multimap<String, AttributeModifier> modifiers) {
		super(new FBArmorMaterial(name), slot, props);
		this.tier = tier;
		attributes = modifiers;
	}
	
	public FBArmorItem(EquipmentSlotType slot, String name, Properties props, FBTier tier, double damage, double strength, double critChance, double critDamage, double bonusAttackSpeed, double seaCreatureChance, double health, double defense, double speed, double intelligence, double trueDefense, double magicFind, double petLuck) {
		super(new FBArmorMaterial(name), slot, props);
		this.tier = tier;
		switch(slot) {
		case HEAD:
			attributes = ModifierHelper.modifierMapFromDoubles(damage, strength, critChance, critDamage, bonusAttackSpeed, seaCreatureChance, health, defense, speed, intelligence, trueDefense, magicFind, petLuck, "Helmet");
			break;
		case CHEST:
			attributes = ModifierHelper.modifierMapFromDoubles(damage, strength, critChance, critDamage, bonusAttackSpeed, seaCreatureChance, health, defense, speed, intelligence, trueDefense, magicFind, petLuck, "Chestplate");
			break;
		case LEGS:
			attributes = ModifierHelper.modifierMapFromDoubles(damage, strength, critChance, critDamage, bonusAttackSpeed, seaCreatureChance, health, defense, speed, intelligence, trueDefense, magicFind, petLuck, "Leggings");
			break;
		case FEET:
			attributes = ModifierHelper.modifierMapFromDoubles(damage, strength, critChance, critDamage, bonusAttackSpeed, seaCreatureChance, health, defense, speed, intelligence, trueDefense, magicFind, petLuck, "Boots");
			break;
		default:
			throw new IllegalArgumentException("Armor type cannot be " + slot.getName() + ", it can only be: HEAD, CHEST, LEGS, FEET.");
		}
	}
	
	@Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
		return equipmentSlot == this.slot ? this.attributes : super.getAttributeModifiers(equipmentSlot);
	}
	
	@Override
	public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot, ItemStack stack) {
		if(equipmentSlot != this.slot) return super.getAttributeModifiers(equipmentSlot);
		Builder<String, AttributeModifier> builder = ImmutableMultimap.builder();
		builder.putAll(this.attributes);
		builder.putAll(this.getReforgeModifiers(stack));
		return builder.build();
	}

	@Override
	public FBItemType getFBItemType() {
		switch(this.slot) {
		case HEAD:
			return FBItemType.HELMET;
		case CHEST:
			return FBItemType.CHESTPLATE;
		case LEGS:
			return FBItemType.LEGGINGS;
		case FEET:
			return FBItemType.BOOTS;
		default:
			return FBItemType.GENERAL;
		}
	}

	@Override
	@Nullable
	public Reforge getReforge(ItemStack stack) {
		if(stack.getTag() == null) return null;
		String reforgeName = stack.getTag().getString("Reforge");
		if(reforgeName.isEmpty()) return null;
		else return Reforge.findReforgeByID(reforgeName);
	}

	@Override
	public void setReforge(Reforge reforge, ItemStack stack) {
		stack.getTag().putString("Reforge", reforge.getID());
	}

	@Override
	public Multimap<String, AttributeModifier> getReforgeModifiers(ItemStack stack) {
		if(getReforge(stack) == null) return Reforge.emptyModifier();
		else {
			Reforge reforge = getReforge(stack);
			switch(getStackTier(stack)) {
			case COMMON:
				return reforge.commonModifiers;
			case UNCOMMON:
				return reforge.uncommonModifiers;
			case RARE:
				return reforge.rareModifiers;
			case EPIC:
				return reforge.epicModifiers;
			case LEGENDARY:
				return reforge.legendaryModifiers;
			case MYTHIC:
				return reforge.mythicModifiers;
			default:
				return Reforge.emptyModifier();
			}
		}
	}

	@Override
	public FBTier getFBTier() {
		return tier;
	}

	@Override
	public FBTier getStackTier(ItemStack stack) {
		if(stack.getTag() != null) {
			boolean recombobulated = (stack.getTag().getByte("Recombobulated") == 1);
			boolean woodSingularity = (stack.getTag().getByte("WoodSingularity") == 1);
			int tierBoost = 0;
			if(recombobulated) tierBoost++;
			if(woodSingularity) tierBoost++;
			return FBTier.changeTier(tier, tierBoost);
		} else {
			return tier;
		}
	}
	
	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		String reforgeName = "";
		if(this.getReforge(stack) != null) {
			reforgeName = this.getReforge(stack).getDisplayName();
		}
		FBTier tier = getStackTier(stack);
		String color = tier.color.toString();
		if(this.getReforge(stack) != null)
			return new StringTextComponent(color + reforgeName + " " + new TranslationTextComponent(this.getTranslationKey(stack)).getString());
		else
			return new StringTextComponent(color + new TranslationTextComponent(this.getTranslationKey(stack)).getString());
	}
	
	/*
	 * Any additional information to appear on the tooltip, to be overridden.
	 */
	public List<ITextComponent> additionalInformation() {
		return List.of();
	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		FBTier tier = this.getStackTier(stack);
		tooltip.add(new StringTextComponent(tier.color.toString() + tooltip.get(0).getString()));
		tooltip.remove(0);
		
		Multimap<String, AttributeModifier> modifiers = this.getAttributeModifiers(this.slot, stack);
		Multimap<String, AttributeModifier> reforgeModifiers = this.getReforgeModifiers(stack);
		List<ITextComponent> additional = this.additionalInformation();
		
		tooltip.addAll(DisplayHelper.formatModifierMap(modifiers, this.getReforge(stack), tier));
		
		//Insert enchantments here
		Map<Enchantment, Integer> enchantments = EnchantmentHelper.getEnchantments(stack);
		Set<Map.Entry<Enchantment, Integer>> set = enchantments.entrySet();
		if(!set.isEmpty()) tooltip.add(new StringTextComponent(""));
		for(Map.Entry<Enchantment, Integer> entry : set) {
			tooltip.add(new StringTextComponent(TextFormatting.BLUE.toString() + new TranslationTextComponent(entry.getKey().getName()).getString() + " " + DisplayHelper.getRomanNumeral(entry.getValue())));
		}
		
		//Insert item ability description here (unused for some items)
		tooltip.addAll(additional);
		
		tooltip.add(new StringTextComponent(""));
		
		//If this item is reforgeable but not reforged
		if(this.getReforge(stack) == null) tooltip.add(new StringTextComponent(new TranslationTextComponent("text.forgeblock.reforgeable").getString()));
		
		boolean recombobulated = false;
		if(stack.getTag() != null) recombobulated = (stack.getTag().getByte("Recombobulated") == 1);
		String color = tier.color.toString();
		String bold = TextFormatting.BOLD.toString();
		String obfuscated = TextFormatting.OBFUSCATED.toString();
		String reset = TextFormatting.RESET.toString();
		if(!recombobulated) tooltip.add(new StringTextComponent(color + bold + tier.name.getString() + " " + this.getFBItemType().getDisplayName()));
		else tooltip.add(new StringTextComponent(color + bold + obfuscated + "n " + reset + color + bold + tier.name.getString() + " " + this.getFBItemType().getDisplayName() + obfuscated + " n"));
	}

}
