package alephinfinity1.forgeblock.init;

import alephinfinity1.forgeblock.ForgeBlock;
import alephinfinity1.forgeblock.attribute.ModifierHelper;
import alephinfinity1.forgeblock.item.AspectOfTheDragonsItem;
import alephinfinity1.forgeblock.item.AspectOfTheEndItem;
import alephinfinity1.forgeblock.item.AspectOfTheEnderItem;
import alephinfinity1.forgeblock.item.BlazeArmorItem;
import alephinfinity1.forgeblock.item.CustomSwordItem;
import alephinfinity1.forgeblock.item.FBArmorItem;
import alephinfinity1.forgeblock.item.FBDyeableArmorItem;
import alephinfinity1.forgeblock.item.FBEnchantedBookItem;
import alephinfinity1.forgeblock.item.FBExperienceBottleItem;
import alephinfinity1.forgeblock.item.FBGlintedItem;
import alephinfinity1.forgeblock.item.FBPickaxeItem;
import alephinfinity1.forgeblock.item.FBPotionItem;
import alephinfinity1.forgeblock.item.FBSwordItem;
import alephinfinity1.forgeblock.item.FrozenBlazeArmorItem;
import alephinfinity1.forgeblock.item.GolemArmorItem;
import alephinfinity1.forgeblock.item.LapisArmorItem;
import alephinfinity1.forgeblock.item.MinerOutfitArmorItem;
import alephinfinity1.forgeblock.item.OneSwordItem;
import alephinfinity1.forgeblock.item.ProtectorDragonArmorItem;
import alephinfinity1.forgeblock.item.RogueSwordItem;
import alephinfinity1.forgeblock.item.StonkItem;
import alephinfinity1.forgeblock.item.StrongDragonArmorItem;
import alephinfinity1.forgeblock.item.SuperiorDragonArmorItem;
import alephinfinity1.forgeblock.item.SwordOfTheStarsItem;
import alephinfinity1.forgeblock.item.UnstableDragonArmorItem;
import alephinfinity1.forgeblock.item.WiseDragonArmorItem;
import alephinfinity1.forgeblock.item.YoungDragonArmorItem;
import alephinfinity1.forgeblock.misc.tier.FBTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class ModItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ForgeBlock.MOD_ID);
	
	public static final DeferredRegister<Item> OVERRIDE = DeferredRegister.create(ForgeRegistries.ITEMS, ForgeBlock.MINECRAFT_ID);
	
	/*
	 * Enchanted items
	 */
	public static final RegistryObject<Item> ENCHANTED_COBBLESTONE = ITEMS.register("enchanted_cobblestone", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_IRON = ITEMS.register("enchanted_iron", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_GOLD = ITEMS.register("enchanted_gold", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_COAL = ITEMS.register("enchanted_coal", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_REDSTONE = ITEMS.register("enchanted_redstone", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_LAPIS_LAZULI = ITEMS.register("enchanted_lapis_lazuli", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_DIAMOND = ITEMS.register("enchanted_diamond", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_EMERALD = ITEMS.register("enchanted_emerald", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_QUARTZ = ITEMS.register("enchanted_quartz", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_OBSIDIAN = ITEMS.register("enchanted_obsidian", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_ICE = ITEMS.register("enchanted_ice", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_GLOWSTONE_DUST = ITEMS.register("enchanted_glowstone_dust", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_END_STONE = ITEMS.register("enchanted_end_stone", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	
	public static final RegistryObject<Item> ENCHANTED_STONE = ITEMS.register("enchanted_stone", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_IRON_BLOCK = ITEMS.register("enchanted_iron_block", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_GOLD_BLOCK = ITEMS.register("enchanted_gold_block", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_COAL_BLOCK = ITEMS.register("enchanted_coal_block", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_REDSTONE_BLOCK = ITEMS.register("enchanted_redstone_block", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_LAPIS_BLOCK = ITEMS.register("enchanted_lapis_block", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_DIAMOND_BLOCK = ITEMS.register("enchanted_diamond_block", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_EMERALD_BLOCK = ITEMS.register("enchanted_emerald_block", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_QUARTZ_BLOCK = ITEMS.register("enchanted_quartz_block", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_PACKED_ICE = ITEMS.register("enchanted_packed_ice", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_GLOWSTONE = ITEMS.register("enchanted_glowstone", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));

	public static final RegistryObject<Item> ENCHANTED_ROTTEN_FLESH = ITEMS.register("enchanted_rotten_flesh", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.COMMON));
	public static final RegistryObject<Item> ENCHANTED_BONE = ITEMS.register("enchanted_bone", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.COMMON));
	public static final RegistryObject<Item> ENCHANTED_STRING = ITEMS.register("enchanted_string", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_SPIDER_EYE = ITEMS.register("enchanted_spider_eye", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_GUNPOWDER = ITEMS.register("enchanted_gunpowder", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_ENDER_PEARL = ITEMS.register("enchanted_ender_pearl", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS).maxStackSize(16), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_GHAST_TEAR = ITEMS.register("enchanted_ghast_tear", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_SLIME_BALL = ITEMS.register("enchanted_slime_ball", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_BLAZE_POWDER = ITEMS.register("enchanted_blaze_powder", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_MAGMA_CREAM = ITEMS.register("enchanted_magma_cream", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	
	public static final RegistryObject<Item> ENCHANTED_SLIME_BLOCK = ITEMS.register("enchanted_slime_block", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.RARE));
	public static final RegistryObject<Item> ENCHANTED_BLAZE_ROD = ITEMS.register("enchanted_blaze_rod", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON));
	public static final RegistryObject<Item> ENCHANTED_ENDER_EYE = ITEMS.register("enchanted_ender_eye", () -> new FBGlintedItem(new Item.Properties().group(ModItemGroups.FB_MATERIALS), FBTier.UNCOMMON)); 


	/*
	 * Swords
	 */
	public static final RegistryObject<Item> WOODEN_SWORD = OVERRIDE.register("wooden_sword", () -> new FBSwordItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.COMMON, 20, 0, 0, 0));
	public static final RegistryObject<Item> GOLDEN_SWORD = OVERRIDE.register("golden_sword", () -> new FBSwordItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.COMMON, 20, 0, 0, 0));
	public static final RegistryObject<Item> STONE_SWORD = OVERRIDE.register("stone_sword", () -> new FBSwordItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.COMMON, 25, 0, 0, 0));
	public static final RegistryObject<Item> IRON_SWORD = OVERRIDE.register("iron_sword", () -> new FBSwordItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.COMMON, 30, 0, 0, 0));
	public static final RegistryObject<Item> DIAMOND_SWORD = OVERRIDE.register("diamond_sword", () -> new FBSwordItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.UNCOMMON, 35, 0, 0, 0));
	
	public static final RegistryObject<Item> ASPECT_OF_THE_END = ITEMS.register("aspect_of_the_end", () -> new AspectOfTheEndItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.RARE, 100, 100, 0, 0));
	public static final RegistryObject<Item> SILVER_FANG = ITEMS.register("silver_fang", () -> new FBSwordItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.UNCOMMON, 100, 0, 0, 0));
	public static final RegistryObject<Item> LEAPING_SWORD = ITEMS.register("leaping_sword", () -> new FBSwordItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.EPIC, 150, 100, 0, 25));
	public static final RegistryObject<Item> ASPECT_OF_THE_DRAGONS = ITEMS.register("aspect_of_the_dragons", () -> new AspectOfTheDragonsItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.LEGENDARY, 225, 100, 0, 0));
	public static final RegistryObject<Item> SWORD_OF_THE_STARS = ITEMS.register("sword_of_the_stars", () -> new SwordOfTheStarsItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.SPECIAL, 99999, 0, 0, 0));
	public static final RegistryObject<Item> ROGUE_SWORD = ITEMS.register("rogue_sword", () -> new RogueSwordItem(new Item.Properties().group(ModItemGroups.FB_SWORDS), FBTier.COMMON, 20, 0, 0, 0));
	
	public static final RegistryObject<Item> ASPECT_OF_THE_ENDER = ITEMS.register("aspect_of_the_ender", () -> new AspectOfTheEnderItem(new Item.Properties(), FBTier.EPIC, 175, 100, 0, 0));
	public static final RegistryObject<Item> CUSTOM_SWORD = ITEMS.register("custom_sword", () -> new CustomSwordItem());
	
	/*
	 * Pickaxes
	 */
	public static final RegistryObject<Item> WOODEN_PICKAXE = OVERRIDE.register("wooden_pickaxe", () -> new FBPickaxeItem(new Item.Properties().group(ModItemGroups.FB_HARVESTING_TOOLS), FBTier.COMMON, 15, 1, 1.5f, 1));
	public static final RegistryObject<Item> GOLDEN_PICKAXE = OVERRIDE.register("golden_pickaxe", () -> new FBPickaxeItem(new Item.Properties().group(ModItemGroups.FB_HARVESTING_TOOLS), FBTier.COMMON, 15, 1, 6f, 1));
	public static final RegistryObject<Item> STONE_PICKAXE = OVERRIDE.register("stone_pickaxe", () -> new FBPickaxeItem(new Item.Properties().group(ModItemGroups.FB_HARVESTING_TOOLS), FBTier.COMMON, 20, 2, 2f, 1));
	public static final RegistryObject<Item> IRON_PICKAXE = OVERRIDE.register("iron_pickaxe", () -> new FBPickaxeItem(new Item.Properties().group(ModItemGroups.FB_HARVESTING_TOOLS), FBTier.COMMON, 25, 3, 3f, 1));
	public static final RegistryObject<Item> DIAMOND_PICKAXE = OVERRIDE.register("diamond_pickaxe", () -> new FBPickaxeItem(new Item.Properties().group(ModItemGroups.FB_HARVESTING_TOOLS), FBTier.UNCOMMON, 30, 4, 4.5f, 1));
	
	public static final RegistryObject<Item> STONK = ITEMS.register("stonk", () -> new StonkItem(new Item.Properties().group(ModItemGroups.FB_HARVESTING_TOOLS), FBTier.EPIC, 15, 1, 12, 1));
	
	/*
	 * Armor
	 */
	public static final RegistryObject<Item> LEATHER_HELMET = OVERRIDE.register("leather_helmet", () -> new FBDyeableArmorItem(EquipmentSlotType.HEAD, "leather", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 5, 0));
	public static final RegistryObject<Item> LEATHER_CHESTPLATE = OVERRIDE.register("leather_chestplate", () -> new FBDyeableArmorItem(EquipmentSlotType.CHEST, "leather", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 15, 0));
	public static final RegistryObject<Item> LEATHER_LEGGINGS = OVERRIDE.register("leather_leggings", () -> new FBDyeableArmorItem(EquipmentSlotType.LEGS, "leather", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 10, 0));
	public static final RegistryObject<Item> LEATHER_BOOTS = OVERRIDE.register("leather_boots", () -> new FBDyeableArmorItem(EquipmentSlotType.FEET, "leather", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 5, 0));
	
	public static final RegistryObject<Item> GOLDEN_HELMET = OVERRIDE.register("golden_helmet", () -> new FBArmorItem(EquipmentSlotType.HEAD, "gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 10, 0));
	public static final RegistryObject<Item> GOLDEN_CHESTPLATE = OVERRIDE.register("golden_chestplate", () -> new FBArmorItem(EquipmentSlotType.CHEST, "gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 25, 0));
	public static final RegistryObject<Item> GOLDEN_LEGGINGS = OVERRIDE.register("golden_leggings", () -> new FBArmorItem(EquipmentSlotType.LEGS, "gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 15, 0));
	public static final RegistryObject<Item> GOLDEN_BOOTS = OVERRIDE.register("golden_boots", () -> new FBArmorItem(EquipmentSlotType.FEET, "gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 5, 0));
	
	public static final RegistryObject<Item> CHAINMAIL_HELMET = OVERRIDE.register("chainmail_helmet", () -> new FBArmorItem(EquipmentSlotType.HEAD, "chainmail", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 12, 0));
	public static final RegistryObject<Item> CHAINMAIL_CHESTPLATE = OVERRIDE.register("chainmail_chestplate", () -> new FBArmorItem(EquipmentSlotType.CHEST, "chainmail", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 30, 0));
	public static final RegistryObject<Item> CHAINMAIL_LEGGINGS = OVERRIDE.register("chainmail_leggings", () -> new FBArmorItem(EquipmentSlotType.LEGS, "chainmail", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 20, 0));
	public static final RegistryObject<Item> CHAINMAIL_BOOTS = OVERRIDE.register("chainmail_boots", () -> new FBArmorItem(EquipmentSlotType.FEET, "chainmail", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 7, 0));
	
	public static final RegistryObject<Item> IRON_HELMET = OVERRIDE.register("iron_helmet", () -> new FBArmorItem(EquipmentSlotType.HEAD, "iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 10, 0));
	public static final RegistryObject<Item> IRON_CHESTPLATE = OVERRIDE.register("iron_chestplate", () -> new FBArmorItem(EquipmentSlotType.CHEST, "iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 30, 0));
	public static final RegistryObject<Item> IRON_LEGGINGS = OVERRIDE.register("iron_leggings", () -> new FBArmorItem(EquipmentSlotType.LEGS, "iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 25, 0));
	public static final RegistryObject<Item> IRON_BOOTS = OVERRIDE.register("iron_boots", () -> new FBArmorItem(EquipmentSlotType.FEET, "iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.COMMON, 10, 0));
	
	public static final RegistryObject<Item> DIAMOND_HELMET = OVERRIDE.register("diamond_helmet", () -> new FBArmorItem(EquipmentSlotType.HEAD, "diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 15, 0));
	public static final RegistryObject<Item> DIAMOND_CHESTPLATE = OVERRIDE.register("diamond_chestplate", () -> new FBArmorItem(EquipmentSlotType.CHEST, "diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 40, 0));
	public static final RegistryObject<Item> DIAMOND_LEGGINGS = OVERRIDE.register("diamond_leggings", () -> new FBArmorItem(EquipmentSlotType.LEGS, "diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 30, 0));
	public static final RegistryObject<Item> DIAMOND_BOOTS = OVERRIDE.register("diamond_boots", () -> new FBArmorItem(EquipmentSlotType.FEET, "diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 15, 0));
	
	public static final RegistryObject<Item> LAPIS_HELMET = ITEMS.register("lapis_helmet", () -> new LapisArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 25, 0));
	public static final RegistryObject<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate", () -> new LapisArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 40, 0));
	public static final RegistryObject<Item> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings", () -> new LapisArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 35, 0));
	public static final RegistryObject<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots", () -> new LapisArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 20, 0));
	
	public static final RegistryObject<Item> HARDENED_DIAMOND_HELMET = ITEMS.register("hardened_diamond_helmet", () -> new FBArmorItem(EquipmentSlotType.HEAD, "diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, 60, 0));
	public static final RegistryObject<Item> HARDENED_DIAMOND_CHESTPLATE = ITEMS.register("hardened_diamond_chestplate", () -> new FBArmorItem(EquipmentSlotType.CHEST, "diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, 120, 0));
	public static final RegistryObject<Item> HARDENED_DIAMOND_LEGGINGS = ITEMS.register("hardened_diamond_leggings", () -> new FBArmorItem(EquipmentSlotType.LEGS, "diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, 95, 0));
	public static final RegistryObject<Item> HARDENED_DIAMOND_BOOTS = ITEMS.register("hardened_diamond_boots", () -> new FBArmorItem(EquipmentSlotType.FEET, "diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, 55, 0));
	
	public static final RegistryObject<Item> MINER_OUTFIT_HELMET = ITEMS.register("miner_outfit_helmet", () -> new MinerOutfitArmorItem(EquipmentSlotType.HEAD, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 15, 0));
	public static final RegistryObject<Item> MINER_OUTFIT_CHESTPLATE = ITEMS.register("miner_outfit_chestplate", () -> new MinerOutfitArmorItem(EquipmentSlotType.CHEST, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 40, 0));
	public static final RegistryObject<Item> MINER_OUTFIT_LEGGINGS = ITEMS.register("miner_outfit_leggings", () -> new MinerOutfitArmorItem(EquipmentSlotType.LEGS, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 30, 0));
	public static final RegistryObject<Item> MINER_OUTFIT_BOOTS = ITEMS.register("miner_outfit_boots", () -> new MinerOutfitArmorItem(EquipmentSlotType.FEET, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.UNCOMMON, 15, 0));
	
	public static final RegistryObject<Item> GOLEM_HELMET = ITEMS.register("golem_helmet", () -> new GolemArmorItem(EquipmentSlotType.HEAD, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, 45, 45));
	public static final RegistryObject<Item> GOLEM_CHESTPLATE = ITEMS.register("golem_chestplate", () -> new GolemArmorItem(EquipmentSlotType.CHEST, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, 90, 65));
	public static final RegistryObject<Item> GOLEM_LEGGINGS = ITEMS.register("golem_leggings", () -> new GolemArmorItem(EquipmentSlotType.LEGS, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, 75, 55));
	public static final RegistryObject<Item> GOLEM_BOOTS = ITEMS.register("golem_boots", () -> new GolemArmorItem(EquipmentSlotType.FEET, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, 40, 40));
	
	public static final RegistryObject<Item> HELMET_OF_THE_STARS = ITEMS.register("helmet_of_the_stars", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.SPECIAL, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 10000, 3000, 0, 1000, 0, 0, 0)));
	public static final RegistryObject<Item> CHESTPLATE_OF_THE_STARS = ITEMS.register("chestplate_of_the_stars", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.SPECIAL, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 20000, 5000, 0, 2000, 0, 0, 0)));
	public static final RegistryObject<Item> LEGGINGS_OF_THE_STARS = ITEMS.register("leggings_of_the_stars", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.SPECIAL, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 15000, 4000, 0, 1500, 0, 0, 0)));
	public static final RegistryObject<Item> BOOTS_OF_THE_STARS = ITEMS.register("boots_of_the_stars", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.SPECIAL, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 7500, 2500, 0, 1000, 0, 0, 0)));
	
	public static final RegistryObject<Item> YOUNG_DRAGON_HELMET = ITEMS.register("young_dragon_helmet", () -> new YoungDragonArmorItem(EquipmentSlotType.HEAD, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 70, 110, 20, 0, 0, 0, 0)));
	public static final RegistryObject<Item> YOUNG_DRAGON_CHESTPLATE = ITEMS.register("young_dragon_chestplate", () -> new YoungDragonArmorItem(EquipmentSlotType.CHEST, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 120, 160, 20, 0, 0, 0, 0)));
	public static final RegistryObject<Item> YOUNG_DRAGON_LEGGINGS = ITEMS.register("young_dragon_leggings", () -> new YoungDragonArmorItem(EquipmentSlotType.LEGS, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 100, 140, 20, 0, 0, 0, 0)));
	public static final RegistryObject<Item> YOUNG_DRAGON_BOOTS = ITEMS.register("young_dragon_boots", () -> new YoungDragonArmorItem(EquipmentSlotType.FEET, "minecraft:iron", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 60, 90, 20, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> WISE_DRAGON_HELMET = ITEMS.register("wise_dragon_helmet", () -> new WiseDragonArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 70, 110, 0, 125, 0, 0, 0)));
	public static final RegistryObject<Item> WISE_DRAGON_CHESTPLATE = ITEMS.register("wise_dragon_chestplate", () -> new WiseDragonArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 120, 160, 0, 75, 0, 0, 0)));
	public static final RegistryObject<Item> WISE_DRAGON_LEGGINGS = ITEMS.register("wise_dragon_leggings", () -> new WiseDragonArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 100, 140, 0, 75, 0, 0, 0)));
	public static final RegistryObject<Item> WISE_DRAGON_BOOTS = ITEMS.register("wise_dragon_boots", () -> new WiseDragonArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 60, 90, 0, 75, 0, 0, 0)));
	
	public static final RegistryObject<Item> UNSTABLE_DRAGON_HELMET = ITEMS.register("unstable_dragon_helmet", () -> new UnstableDragonArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 5, 15, 0, 0, 70, 110, 0, 25, 0, 0, 0)));
	public static final RegistryObject<Item> UNSTABLE_DRAGON_CHESTPLATE = ITEMS.register("unstable_dragon_chestplate", () -> new UnstableDragonArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 5, 15, 0, 0, 120, 160, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> UNSTABLE_DRAGON_LEGGINGS = ITEMS.register("unstable_dragon_leggings", () -> new UnstableDragonArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 5, 15, 0, 0, 100, 140, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> UNSTABLE_DRAGON_BOOTS = ITEMS.register("unstable_dragon_boots", () -> new UnstableDragonArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 5, 15, 0, 0, 60, 90, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> STRONG_DRAGON_HELMET = ITEMS.register("strong_dragon_helmet", () -> new StrongDragonArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 25, 0, 0, 0, 0, 70, 110, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> STRONG_DRAGON_CHESTPLATE = ITEMS.register("strong_dragon_chestplate", () -> new StrongDragonArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 25, 0, 0, 0, 0, 120, 160, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> STRONG_DRAGON_LEGGINGS = ITEMS.register("strong_dragon_leggings", () -> new StrongDragonArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 25, 0, 0, 0, 0, 100, 140, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> STRONG_DRAGON_BOOTS = ITEMS.register("strong_dragon_boots", () -> new StrongDragonArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 25, 0, 0, 0, 0, 60, 90, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> SUPERIOR_DRAGON_HELMET = ITEMS.register("superior_dragon_helmet", () -> new SuperiorDragonArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 10, 2, 8, 0, 0, 90, 130, 3, 25, 0, 0, 0)));
	public static final RegistryObject<Item> SUPERIOR_DRAGON_CHESTPLATE = ITEMS.register("superior_dragon_chestplate", () -> new SuperiorDragonArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 10, 2, 8, 0, 0, 150, 190, 3, 25, 0, 0, 0)));
	public static final RegistryObject<Item> SUPERIOR_DRAGON_LEGGINGS = ITEMS.register("superior_dragon_leggings", () -> new SuperiorDragonArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 10, 2, 8, 0, 0, 130, 170, 3, 25, 0, 0, 0)));
	public static final RegistryObject<Item> SUPERIOR_DRAGON_BOOTS = ITEMS.register("superior_dragon_boots", () -> new SuperiorDragonArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 10, 2, 8, 0, 0, 80, 110, 3, 25, 0, 0, 0)));
	
	public static final RegistryObject<Item> PROTECTOR_DRAGON_HELMET = ITEMS.register("protector_dragon_helmet", () -> new ProtectorDragonArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 70, 135, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PROTECTOR_DRAGON_CHESTPLATE = ITEMS.register("protector_dragon_chestplate", () -> new ProtectorDragonArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 120, 185, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PROTECTOR_DRAGON_LEGGINGS = ITEMS.register("protector_dragon_leggings", () -> new ProtectorDragonArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 100, 165, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PROTECTOR_DRAGON_BOOTS = ITEMS.register("protector_dragon_boots", () -> new ProtectorDragonArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 60, 115, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T1 = ITEMS.register("perfect_helmet_t1", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 110, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T1 = ITEMS.register("perfect_chestplate_t1", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 160, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T1 = ITEMS.register("perfect_leggings_t1", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 140, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T1 = ITEMS.register("perfect_boots_t1", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 90, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T2 = ITEMS.register("perfect_helmet_t2", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 130, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T2 = ITEMS.register("perfect_chestplate_t2", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 180, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T2 = ITEMS.register("perfect_leggings_t2", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 160, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T2 = ITEMS.register("perfect_boots_t2", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 110, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T3 = ITEMS.register("perfect_helmet_t3", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 150, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T3 = ITEMS.register("perfect_chestplate_t3", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 200, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T3 = ITEMS.register("perfect_leggings_t3", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 180, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T3 = ITEMS.register("perfect_boots_t3", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.RARE, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 130, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T4 = ITEMS.register("perfect_helmet_t4", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 170, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T4 = ITEMS.register("perfect_chestplate_t4", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 220, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T4 = ITEMS.register("perfect_leggings_t4", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 200, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T4 = ITEMS.register("perfect_boots_t4", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 150, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T5 = ITEMS.register("perfect_helmet_t5", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 190, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T5 = ITEMS.register("perfect_chestplate_t5", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 240, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T5 = ITEMS.register("perfect_leggings_t5", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 220, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T5 = ITEMS.register("perfect_boots_t5", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 170, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T6 = ITEMS.register("perfect_helmet_t6", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 210, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T6 = ITEMS.register("perfect_chestplate_t6", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 260, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T6 = ITEMS.register("perfect_leggings_t6", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 240, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T6 = ITEMS.register("perfect_boots_t6", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 190, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T7 = ITEMS.register("perfect_helmet_t7", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 230, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T7 = ITEMS.register("perfect_chestplate_t7", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 280, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T7 = ITEMS.register("perfect_leggings_t7", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 260, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T7 = ITEMS.register("perfect_boots_t7", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 210, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T8 = ITEMS.register("perfect_helmet_t8", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 250, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T8 = ITEMS.register("perfect_chestplate_t8", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 300, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T8 = ITEMS.register("perfect_leggings_t8", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 280, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T8 = ITEMS.register("perfect_boots_t8", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 230, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T9 = ITEMS.register("perfect_helmet_t9", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 270, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T9 = ITEMS.register("perfect_chestplate_t9", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 320, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T9 = ITEMS.register("perfect_leggings_t9", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 300, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T9 = ITEMS.register("perfect_boots_t9", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 250, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T10 = ITEMS.register("perfect_helmet_t10", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 290, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T10 = ITEMS.register("perfect_chestplate_t10", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 340, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T10 = ITEMS.register("perfect_leggings_t10", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 320, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T10 = ITEMS.register("perfect_boots_t10", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 270, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T11 = ITEMS.register("perfect_helmet_t11", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 310, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T11 = ITEMS.register("perfect_chestplate_t11", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 360, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T11 = ITEMS.register("perfect_leggings_t11", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 340, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T11 = ITEMS.register("perfect_boots_t11", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 290, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> PERFECT_HELMET_T12 = ITEMS.register("perfect_helmet_t12", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 330, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_CHESTPLATE_T12 = ITEMS.register("perfect_chestplate_t12", () -> new FBArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 380, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_LEGGINGS_T12 = ITEMS.register("perfect_leggings_t12", () -> new FBArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 360, 0, 0, 0, 0, 0)));
	public static final RegistryObject<Item> PERFECT_BOOTS_T12 = ITEMS.register("perfect_boots_t12", () -> new FBArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.LEGENDARY, ModifierHelper.modifierMapFromDoubles(0, 0, 0, 0, 0, 0, 0, 310, 0, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> BLAZE_HELMET = ITEMS.register("blaze_helmet", () -> new BlazeArmorItem(EquipmentSlotType.HEAD, "minecraft:gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 10, 0, 0, 0, 0, 0, 80, 2, 0, 0, 0, 0)));
	public static final RegistryObject<Item> BLAZE_CHESTPLATE = ITEMS.register("blaze_chestplate", () -> new BlazeArmorItem(EquipmentSlotType.CHEST, "minecraft:gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 10, 0, 0, 0, 0, 0, 150, 2, 0, 0, 0, 0)));
	public static final RegistryObject<Item> BLAZE_LEGGINGS = ITEMS.register("blaze_leggings", () -> new BlazeArmorItem(EquipmentSlotType.LEGS, "minecraft:gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 10, 0, 0, 0, 0, 0, 110, 2, 0, 0, 0, 0)));
	public static final RegistryObject<Item> BLAZE_BOOTS = ITEMS.register("blaze_boots", () -> new BlazeArmorItem(EquipmentSlotType.FEET, "minecraft:gold", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 10, 0, 0, 0, 0, 0, 70, 2, 0, 0, 0, 0)));
	
	public static final RegistryObject<Item> FROZEN_BLAZE_HELMET = ITEMS.register("frozen_blaze_helmet", () -> new FrozenBlazeArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 40, 0, 0, 0, 0, 0, 110, 2, 0, 0, 0, 0)));
	public static final RegistryObject<Item> FROZEN_BLAZE_CHESTPLATE = ITEMS.register("frozen_blaze_chestplate", () -> new FrozenBlazeArmorItem(EquipmentSlotType.CHEST, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 40, 0, 0, 0, 0, 0, 180, 2, 0, 0, 0, 0)));
	public static final RegistryObject<Item> FROZEN_BLAZE_LEGGINGS = ITEMS.register("frozen_blaze_leggings", () -> new FrozenBlazeArmorItem(EquipmentSlotType.LEGS, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 40, 0, 0, 0, 0, 0, 140, 2, 0, 0, 0, 0)));
	public static final RegistryObject<Item> FROZEN_BLAZE_BOOTS = ITEMS.register("frozen_blaze_boots", () -> new FrozenBlazeArmorItem(EquipmentSlotType.FEET, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_ARMOR), FBTier.EPIC, ModifierHelper.modifierMapFromDoubles(0, 40, 0, 0, 0, 0, 0, 100, 2, 0, 0, 0, 0)));

	/*
	 * Potion
	 */
	public static final RegistryObject<Item> FB_POTION = OVERRIDE.register("potion", () -> new FBPotionItem(new Item.Properties().group(ModItemGroups.FB_POTIONS).maxStackSize(1)));
	
	/*
	 * Spawn Eggs
	 */
	public static final RegistryObject<Item> LV1_ZOMBIE_SPAWN_EGG = ITEMS.register("lv1_zombie_spawn_egg", () -> new SpawnEggItem(ModEntities.LV1_ZOMBIE_TYPE, 44975, 7969893, new Item.Properties().group(ModItemGroups.FB_MOBS)));
	public static final RegistryObject<Item> LAPIS_ZOMBIE_SPAWN_EGG = ITEMS.register("lapis_zombie_spawn_egg", () -> new SpawnEggItem(ModEntities.LAPIS_ZOMBIE_TYPE, 1269462, 7969893, new Item.Properties().group(ModItemGroups.FB_MOBS)));
	public static final RegistryObject<Item> ZEALOT_SPAWN_EGG = ITEMS.register("zealot_spawn_egg", () -> new SpawnEggItem(ModEntities.ZEALOT_TYPE, 1447446, 0, new Item.Properties().group(ModItemGroups.FB_MOBS)));
	
	/*
	 * Misc
	 */
	public static final RegistryObject<Item> ENCHANTED_BOOK = OVERRIDE.register("enchanted_book", () -> new FBEnchantedBookItem(new Item.Properties()));
	public static final RegistryObject<Item> GRAND_EXPERIENCE_BOTTLE = ITEMS.register("grand_experience_bottle", () -> new FBExperienceBottleItem(new Item.Properties(), FBTier.UNCOMMON, 1500 - 307, 1500 + 307));
	public static final RegistryObject<Item> TITANIC_EXPERIENCE_BOTTLE = ITEMS.register("titanic_experience_bottle", () -> new FBExperienceBottleItem(new Item.Properties(), FBTier.RARE, 139770 - 2477, 139770 + 2477));
	
	/*
	 * Custom items/ideas/debug
	 */
	public static final RegistryObject<Item> DIMENSIUS = ITEMS.register("dimensius", () -> new FBArmorItem(EquipmentSlotType.HEAD, "minecraft:diamond", new Item.Properties().group(ModItemGroups.FB_CUSTOM), FBTier.MYTHIC, ModifierHelper.modifierMapFromDoubles(0, -1000, 0, 0, 0, 0, -1000, 0, 0, 3000, 0, 0, 0)));
	public static final RegistryObject<Item> ONE = ITEMS.register("one", () -> new OneSwordItem(new Item.Properties().group(ModItemGroups.FB_CUSTOM), FBTier.SPECIAL));
}
