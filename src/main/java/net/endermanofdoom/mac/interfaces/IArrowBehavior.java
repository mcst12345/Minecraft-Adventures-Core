package net.endermanofdoom.mac.interfaces;

import net.endermanofdoom.mac.entity.EntityArrowEX;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public interface IArrowBehavior
{
	public abstract void onArrowTick(World world, EntityLivingBase shooter, EntityArrowEX arrow);
	public abstract void onArrowTickAir(World world, EntityLivingBase shooter, EntityArrowEX arrow);
	public abstract void onArrowTickGround(World world, EntityLivingBase shooter, EntityArrowEX arrow);
	public abstract void onArrowTickWater(World world, EntityLivingBase shooter, EntityArrowEX arrow);
	public abstract void onArrowHit(World world, EntityLivingBase shooter, Entity victim, EntityArrowEX arrow);
	public abstract void onArrowHitBlock(World world, EntityLivingBase shooter, RayTraceResult raytrace, EntityArrowEX arrow);
	public abstract void onArrowStop(World world, EntityLivingBase shooter, RayTraceResult raytrace, EntityArrowEX arrow);
	public boolean onDamageEntity(World world, EntityLivingBase shooter, Entity victim, RayTraceResult raytrace, EntityArrowEX arrow, float damage, float velocity);
	public boolean onPierce(World world, EntityLivingBase shooter, Entity victim, RayTraceResult raytrace, EntityArrowEX arrow);
	public boolean onPierceBlock(World world, EntityLivingBase shooter, IBlockState state, BlockPos position, RayTraceResult raytrace, EntityArrowEX arrow);
}
