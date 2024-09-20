
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.astralvixen.steelandsakura.potion.MizuchisGraceMobEffect;
import net.astralvixen.steelandsakura.potion.BloodlustMobEffect;
import net.astralvixen.steelandsakura.potion.BleedMobEffect;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

public class SteelandsakuraModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SteelandsakuraMod.MODID);
	public static final RegistryObject<MobEffect> BLEED = REGISTRY.register("bleed", () -> new BleedMobEffect());
	public static final RegistryObject<MobEffect> BLOODLUST = REGISTRY.register("bloodlust", () -> new BloodlustMobEffect());
	public static final RegistryObject<MobEffect> MIZUCHIS_GRACE = REGISTRY.register("mizuchis_grace", () -> new MizuchisGraceMobEffect());
}
