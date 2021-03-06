package alephinfinity1.forgeblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BowItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public class CubismEnchantment extends Enchantment implements IFBEnchantment {

	protected CubismEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
	}
	
	public CubismEnchantment() {
		super(Rarity.UNCOMMON, EnchantmentType.create("SWORD_AND_BOW", (item) -> (item instanceof SwordItem || item instanceof BowItem)), new EquipmentSlotType[] {EquipmentSlotType.MAINHAND});
	}
	
	@Override
	public int getMaxLevel() {
		return 5;
	}
	
	@Override
	public int getRepairCostForLevel(int level) {
		switch (level) {
			case 1:
			case 2:
			case 3:
			case 4:
				return level * 2;
			case 5:
				return 12;
			case 6:
				return 18;
			default:
				return Integer.MAX_VALUE;
		}
	}

	@Override
	public int getEnchantingTableMaxLevel() {
		return 5;
	}

	@Override
	public int getRequiredSkillLevel(int level) {	
		return 3;
	}

}
