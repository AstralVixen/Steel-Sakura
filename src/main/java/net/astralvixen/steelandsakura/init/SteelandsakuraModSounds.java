
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
	public static final RegistryObject<SoundEvent> MEMETO_MORI = REGISTRY.register("memeto_mori", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("steelandsakura", "memeto_mori")));
	public static final RegistryObject<SoundEvent> FLUTE_1 = REGISTRY.register("flute_1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("steelandsakura", "flute_1")));
	public static final RegistryObject<SoundEvent> FLUTE_2 = REGISTRY.register("flute_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("steelandsakura", "flute_2")));
	public static final RegistryObject<SoundEvent> GONG = REGISTRY.register("gong", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("steelandsakura", "gong")));
	public static final RegistryObject<SoundEvent> SEIRYU_AMBIENCE = REGISTRY.register("seiryu_ambience", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("steelandsakura", "seiryu_ambience")));
}
