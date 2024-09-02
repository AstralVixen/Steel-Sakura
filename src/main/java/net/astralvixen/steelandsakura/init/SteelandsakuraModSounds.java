
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.astralvixen.steelandsakura.SteelandsakuraMod;

public class SteelandsakuraModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SteelandsakuraMod.MODID);
	public static final RegistryObject<SoundEvent> YUREI = REGISTRY.register("yurei", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("steelandsakura", "yurei")));
}
