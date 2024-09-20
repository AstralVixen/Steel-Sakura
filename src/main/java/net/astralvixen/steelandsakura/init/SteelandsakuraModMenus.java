
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.astralvixen.steelandsakura.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.astralvixen.steelandsakura.world.inventory.YungenGUIMenu;
import net.astralvixen.steelandsakura.world.inventory.YugenToriiGUIMenu;
import net.astralvixen.steelandsakura.world.inventory.TataraGUIMenu;
import net.astralvixen.steelandsakura.world.inventory.ShogunsManualTemplateGUIMenu;
import net.astralvixen.steelandsakura.world.inventory.DanGUIMenu;
import net.astralvixen.steelandsakura.SteelandsakuraMod;

public class SteelandsakuraModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SteelandsakuraMod.MODID);
	public static final RegistryObject<MenuType<TataraGUIMenu>> TATARA_GUI = REGISTRY.register("tatara_gui", () -> IForgeMenuType.create(TataraGUIMenu::new));
	public static final RegistryObject<MenuType<YungenGUIMenu>> YUNGEN_GUI = REGISTRY.register("yungen_gui", () -> IForgeMenuType.create(YungenGUIMenu::new));
	public static final RegistryObject<MenuType<DanGUIMenu>> DAN_GUI = REGISTRY.register("dan_gui", () -> IForgeMenuType.create(DanGUIMenu::new));
	public static final RegistryObject<MenuType<ShogunsManualTemplateGUIMenu>> SHOGUNS_MANUAL_TEMPLATE_GUI = REGISTRY.register("shoguns_manual_template_gui", () -> IForgeMenuType.create(ShogunsManualTemplateGUIMenu::new));
	public static final RegistryObject<MenuType<YugenToriiGUIMenu>> YUGEN_TORII_GUI = REGISTRY.register("yugen_torii_gui", () -> IForgeMenuType.create(YugenToriiGUIMenu::new));
}
