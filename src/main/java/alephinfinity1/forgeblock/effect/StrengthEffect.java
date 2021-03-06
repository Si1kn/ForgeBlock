package alephinfinity1.forgeblock.effect;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.common.extensions.IForgeEffect;

public class StrengthEffect extends Effect implements IForgeEffect {

	public StrengthEffect(EffectType typeIn, int liquidColorIn) {
		super(typeIn, liquidColorIn);
	}
	
	@Override
	public double getAttributeModifierAmount(int amplifier, AttributeModifier modifier) {
		switch(amplifier) {
		case 0:
			return 5.0;
		case 1:
			return 12.5;
		case 2:
			return 20.0;
		case 3:
			return 30.0;
		case 4:
			return 40.0;
		case 5:
			return 50.0;
		case 6:
			return 60.0;
		case 7:
			return 75.0;
		default:
			return (amplifier - 2) * 15;
		}
	}

}
