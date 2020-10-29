package com.colmarek.fasterfurnaces.setup;

import com.colmarek.fasterfurnaces.FasterFurnacesMod;
import com.colmarek.fasterfurnaces.gui.DiamondFurnaceScreen;
import com.colmarek.fasterfurnaces.gui.GoldFurnaceScreen;
import com.colmarek.fasterfurnaces.gui.IronFurnaceScreen;
import com.colmarek.fasterfurnaces.gui.NetheriteFurnaceScreen;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FasterFurnacesMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(Registration.IRON_FURNACE_CONTAINER.get(), IronFurnaceScreen::new);
        ScreenManager.registerFactory(Registration.GOLD_FURNACE_CONTAINER.get(), GoldFurnaceScreen::new);
        ScreenManager.registerFactory(Registration.DIAMOND_FURNACE_CONTAINER.get(), DiamondFurnaceScreen::new);
        ScreenManager.registerFactory(Registration.NETHERITE_FURNACE_CONTAINER.get(), NetheriteFurnaceScreen::new);
    }
}
