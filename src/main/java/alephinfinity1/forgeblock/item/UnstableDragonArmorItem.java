package alephinfinity1.forgeblock.item;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Multimap;

import alephinfinity1.forgeblock.attribute.FBAttributes;
import alephinfinity1.forgeblock.misc.itemreqs.AttributeRequirementPredicate;
import alephinfinity1.forgeblock.misc.itemreqs.IRequirementPredicate;
import alephinfinity1.forgeblock.misc.itemreqs.SkillRequirementPredicate;
import alephinfinity1.forgeblock.misc.tier.FBTier;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class UnstableDragonArmorItem extends FBArmorItem implements IRequirementItem {

	public UnstableDragonArmorItem(EquipmentSlotType slot, String name, Properties props, FBTier tier, double damage,
			double strength, double critChance, double critDamage, double bonusAttackSpeed, double seaCreatureChance,
			double health, double defense, double speed, double intelligence, double trueDefense, double magicFind,
			double petLuck) {
		super(slot, name, props, tier, damage, strength, critChance, critDamage, bonusAttackSpeed, seaCreatureChance, health,
				defense, speed, intelligence, trueDefense, magicFind, petLuck);
	}
	
	public UnstableDragonArmorItem(EquipmentSlotType slot, String name, Properties props, FBTier tier,
			Multimap<String, AttributeModifier> modifiers) {
		super(slot, name, props, tier, modifiers);
	}

	@Override
	public List<ITextComponent> additionalInformation() {
		List<ITextComponent> list = new ArrayList<>();
		list.add(new StringTextComponent(new TranslationTextComponent("text.forgeblock.armor_desc.unstable_0").getString()));
		list.add(new StringTextComponent(new TranslationTextComponent("text.forgeblock.armor_desc.unstable_1").getString()));
		list.add(new StringTextComponent(new TranslationTextComponent("text.forgeblock.armor_desc.unstable_2").getString()));
		list.add(new StringTextComponent(""));
		return list;
	}
	
	@Override
	public IRequirementPredicate[] getRequirements(ItemStack stack) {
		return new IRequirementPredicate[] {SkillRequirementPredicate.combatRequirement(16), AttributeRequirementPredicate.minimum(FBAttributes.STRENGTH, 100)};
	}

}
