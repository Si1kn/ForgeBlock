package alephinfinity1.forgeblock;

import alephinfinity1.forgeblock.attribute.AttributeHelper;
import alephinfinity1.forgeblock.config.CustomModConfig;
import alephinfinity1.forgeblock.init.ModEffects;
import alephinfinity1.forgeblock.init.ModEnchantments;
import alephinfinity1.forgeblock.init.ModEntities;
import alephinfinity1.forgeblock.init.ModItems;
import alephinfinity1.forgeblock.init.ModPotions;
import alephinfinity1.forgeblock.init.ModRecipes;
import alephinfinity1.forgeblock.misc.mana.IMana;
import alephinfinity1.forgeblock.misc.mana.Mana;
import alephinfinity1.forgeblock.misc.mana.ManaStorage;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(value = ForgeBlock.MOD_ID)
public class ForgeBlock {

	public static final String MOD_ID = "forgeblock";
	public static final String MINECRAFT_ID = "minecraft";
	
	public ForgeBlock() {
		ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModItems.OVERRIDE.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModEffects.POTIONS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModEffects.OVERRIDE.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModPotions.POTION_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModPotions.OVERRIDE.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModEnchantments.ENCHANTMENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModEnchantments.OVERRIDE.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModEntities.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModEntities.OVERRIDE.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModRecipes.RECIPE_SERIALIZERS.register(FMLJavaModLoadingContext.get().getModEventBus());
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CustomModConfig.CLIENT_CONFIG);
        CustomModConfig.loadConfig(CustomModConfig.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("forgeblock-client.toml"));
        
	}
	
	private void setup(FMLCommonSetupEvent event) {
		AttributeHelper.removeLimits();
		CapabilityManager.INSTANCE.register(IMana.class, new ManaStorage(), Mana::new);
	}
	
}
