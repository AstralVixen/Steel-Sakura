
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.astralvixen.steelandsakura.entity.YureiEntity;
import net.astralvixen.steelandsakura.entity.TekeTekeEntity;
import net.astralvixen.steelandsakura.entity.ShirokamiEntity;
import net.astralvixen.steelandsakura.entity.OniEntity;
import net.astralvixen.steelandsakura.entity.MidoriSamuraiEntity;
import net.astralvixen.steelandsakura.entity.KinSamuraiEntity;
import net.astralvixen.steelandsakura.entity.FrostOniEntity;
import net.astralvixen.steelandsakura.entity.EndOniEntity;
import net.astralvixen.steelandsakura.entity.AoiSamuraiEntity;
import net.astralvixen.steelandsakura.entity.AkaiSamuraiEntity;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SteelandsakuraModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SteelandsakuraMod.MODID);
	public static final RegistryObject<EntityType<AkaiSamuraiEntity>> AKAI_SAMURAI = register("akai_samurai",
			EntityType.Builder.<AkaiSamuraiEntity>of(AkaiSamuraiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AkaiSamuraiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MidoriSamuraiEntity>> MIDORI_SAMURAI = register("midori_samurai",
			EntityType.Builder.<MidoriSamuraiEntity>of(MidoriSamuraiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MidoriSamuraiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AoiSamuraiEntity>> AOI_SAMURAI = register("aoi_samurai",
			EntityType.Builder.<AoiSamuraiEntity>of(AoiSamuraiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AoiSamuraiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FrostOniEntity>> FROST_ONI = register("frost_oni",
			EntityType.Builder.<FrostOniEntity>of(FrostOniEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FrostOniEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EndOniEntity>> END_ONI = register("end_oni",
			EntityType.Builder.<EndOniEntity>of(EndOniEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndOniEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OniEntity>> ONI = register("oni",
			EntityType.Builder.<OniEntity>of(OniEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OniEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShirokamiEntity>> SHIROKAMI = register("shirokami", EntityType.Builder.<ShirokamiEntity>of(ShirokamiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(ShirokamiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KinSamuraiEntity>> KIN_SAMURAI = register("kin_samurai",
			EntityType.Builder.<KinSamuraiEntity>of(KinSamuraiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KinSamuraiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YureiEntity>> YUREI = register("yurei",
			EntityType.Builder.<YureiEntity>of(YureiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YureiEntity::new)

					.sized(0f, 0f));
	public static final RegistryObject<EntityType<TekeTekeEntity>> TEKE_TEKE = register("teke_teke",
			EntityType.Builder.<TekeTekeEntity>of(TekeTekeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TekeTekeEntity::new)

					.sized(0.6f, 1.1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AkaiSamuraiEntity.init();
			MidoriSamuraiEntity.init();
			AoiSamuraiEntity.init();
			FrostOniEntity.init();
			EndOniEntity.init();
			OniEntity.init();
			ShirokamiEntity.init();
			KinSamuraiEntity.init();
			YureiEntity.init();
			TekeTekeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(AKAI_SAMURAI.get(), AkaiSamuraiEntity.createAttributes().build());
		event.put(MIDORI_SAMURAI.get(), MidoriSamuraiEntity.createAttributes().build());
		event.put(AOI_SAMURAI.get(), AoiSamuraiEntity.createAttributes().build());
		event.put(FROST_ONI.get(), FrostOniEntity.createAttributes().build());
		event.put(END_ONI.get(), EndOniEntity.createAttributes().build());
		event.put(ONI.get(), OniEntity.createAttributes().build());
		event.put(SHIROKAMI.get(), ShirokamiEntity.createAttributes().build());
		event.put(KIN_SAMURAI.get(), KinSamuraiEntity.createAttributes().build());
		event.put(YUREI.get(), YureiEntity.createAttributes().build());
		event.put(TEKE_TEKE.get(), TekeTekeEntity.createAttributes().build());
	}
}
