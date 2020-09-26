package alephinfinity1.forgeblock.network;

import java.util.function.Supplier;

import alephinfinity1.forgeblock.misc.skills.ISkills;
import alephinfinity1.forgeblock.misc.skills.SkillType;
import alephinfinity1.forgeblock.misc.skills.SkillsProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

public class SkillUpdatePacket {
	
	private CompoundNBT nbt;
	
	SkillUpdatePacket(final PacketBuffer buf) {
		nbt = buf.readCompoundTag();
	}
	
	public SkillUpdatePacket(CompoundNBT nbt) {
		this.nbt = nbt;
	}
	
	void encode(final PacketBuffer buf) {
		buf.writeCompoundTag(nbt);
	}
	
	public static void handle(SkillUpdatePacket msg, Supplier<NetworkEvent.Context> ctx) {
		if(ctx.get().getDirection().getReceptionSide().isClient()) {
			ctx.get().enqueueWork(() -> {
				ClientPlayerEntity player = Minecraft.getInstance().player;
				ISkills skills = player.getCapability(SkillsProvider.SKILLS_CAPABILITY).orElseThrow(NullPointerException::new);
				SkillType type = SkillType.getSkillTypeByID(msg.nbt.getString("SkillType"));
				skills.setLevel(type, msg.nbt.getInt("Level"));
				skills.setProgress(type, msg.nbt.getDouble("Progress"));
			});
		}
		
		if(ctx.get().getDirection().getReceptionSide().isServer()) {
			ctx.get().enqueueWork(() -> {
				ServerPlayerEntity player = ctx.get().getSender();
				ISkills skills = player.getCapability(SkillsProvider.SKILLS_CAPABILITY).orElseThrow(NullPointerException::new);
				SkillType type = SkillType.getSkillTypeByID(msg.nbt.getString("SkillType"));
				skills.setLevel(type, msg.nbt.getInt("Level"));
				skills.setProgress(type, msg.nbt.getDouble("Progress"));
			});
		}
		
		ctx.get().setPacketHandled(true);
	}

}