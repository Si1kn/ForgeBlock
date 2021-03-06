package alephinfinity1.forgeblock.entity;

import javax.annotation.Nullable;

import alephinfinity1.forgeblock.ForgeBlock;
import alephinfinity1.forgeblock.attribute.FBAttributes;
import alephinfinity1.forgeblock.init.ModItems;
import alephinfinity1.forgeblock.item.armor.FBArmorItem;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.ai.goal.ZombieAttackGoal;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class LapisZombieEntity extends ZombieEntity implements IFBEntity {

	public LapisZombieEntity(EntityType<? extends ZombieEntity> type, World worldIn) {
		super(type, worldIn);
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.registerFBAttributes();
		this.goalSelector.addGoal(0, new ZombieAttackGoal(this, 1.0D, false));
		this.goalSelector.addGoal(1, new SwimGoal(this));
		this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 6.0F));
		this.goalSelector.addGoal(4,  new LookRandomlyGoal(this));
		
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
	}

	@Override
	protected int getExperiencePoints(PlayerEntity player) {
		return 5;
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_ZOMBIE_AMBIENT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_ZOMBIE_DEATH;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.ENTITY_ZOMBIE_HURT;
	}
	
	@Override
	protected void playStepSound(BlockPos pos, BlockState state) {
		this.playSound(SoundEvents.ENTITY_ZOMBIE_STEP, 0.15f, 1.0f);
	}
	
	@Override
	protected boolean shouldBurnInDay() {
		return false;
	}
	
	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		this.registerFBAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(50.0D);
		this.getAttribute(FBAttributes.CRIT_CHANCE).setBaseValue(0.0D);
		this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.0D);
	}
	
	@Override
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
		this.setItemStackToSlot(EquipmentSlotType.HEAD, ((FBArmorItem) (ModItems.LAPIS_HELMET.get())).getDisplayStack());
		this.setItemStackToSlot(EquipmentSlotType.CHEST, ((FBArmorItem) (ModItems.LAPIS_CHESTPLATE.get())).getDisplayStack());
		this.setItemStackToSlot(EquipmentSlotType.LEGS, ((FBArmorItem) (ModItems.LAPIS_LEGGINGS.get())).getDisplayStack());
		this.setItemStackToSlot(EquipmentSlotType.FEET, ((FBArmorItem) (ModItems.LAPIS_BOOTS.get())).getDisplayStack());
	}
	
	@Override
	public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
		ILivingEntityData data = super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
		this.setChild(false); //Can never be child.
		return data;
	}
	
	@Override
	public ResourceLocation getLootTable() {
		return new ResourceLocation(ForgeBlock.MOD_ID, "lapis_zombie");
	}
	
	@Override
	public void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
		//Do nothing. Armour should not be dropped beside loot tables.
	}

	@Override
	public int getLevel() {
		return 7;
	}

	@Override
	public double getCoins() {
		return 5.0D;
	}

	@Override
	public double getCombatXP() {
		return 12.0D;
	}

}
