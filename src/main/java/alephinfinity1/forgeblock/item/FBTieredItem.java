package alephinfinity1.forgeblock.item;

import java.util.List;

import javax.annotation.Nullable;

import alephinfinity1.forgeblock.misc.FBItemType;
import alephinfinity1.forgeblock.misc.capability.stats_modifier.capability.IItemModifiers;
import alephinfinity1.forgeblock.misc.capability.stats_modifier.capability.ItemModifiersProvider;
import alephinfinity1.forgeblock.misc.tier.FBTier;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

/*
 * A generic FB tiered item.
 * Use interface for complex items.
 */
public class FBTieredItem extends Item implements IFBTieredItem {

	public final FBTier baseTier;
	
	public FBTieredItem(Properties properties) {
		super(properties);
		this.baseTier = FBTier.COMMON;
	}
	
	public FBTieredItem(Properties properties, FBTier tier) {
		super(properties);
		this.baseTier = tier;
	}

	@Override
	public FBTier getFBTier() {
		return baseTier;
	}
	
	@Override
	public FBTier getStackTier(ItemStack stack) {
		if(stack.getTag() != null) {
			IItemModifiers itemMod = stack.getCapability(ItemModifiersProvider.ITEM_MODIFIERS_CAPABILITY).orElse(null);
			if(itemMod != null) {
				return FBTier.changeTier(baseTier, itemMod.getRarity(stack));
			}
			return baseTier;
		} else {
			return baseTier;
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		FBTier tier = getStackTier(stack);
		tooltip.add(new StringTextComponent(tier.color.toString() + tooltip.get(0).getString()));
		tooltip.remove(0);
		boolean recombobulated = false;
		if(stack.getTag() != null) recombobulated = (stack.getTag().getByte("Recombobulated") == 1);
		String color = tier.color.toString();
		String bold = TextFormatting.BOLD.toString();
		String obfuscated = TextFormatting.OBFUSCATED.toString();
		String reset = TextFormatting.RESET.toString();
		if(!recombobulated) tooltip.add(new StringTextComponent(color + bold + tier.name.getString()));
		else tooltip.add(new StringTextComponent(color + bold + obfuscated + "n " + reset + color + bold + tier.name.getString() + obfuscated + " n"));
	}
	
	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		FBTier tier = getStackTier(stack);
		String color = tier.color.toString();
		return new StringTextComponent(color + new TranslationTextComponent(this.getTranslationKey(stack)).getString());
	}

	@Override
	public FBItemType getFBItemType() {
		return FBItemType.GENERAL;
	}
	
	@Override
	public Rarity getRarity(ItemStack stack) {
		return getStackTier(stack).getVanillaRarity();
	}	

}
