package com.colmarek.fasterfurnaces.setup;

import com.colmarek.fasterfurnaces.FasterFurnacesMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FasterFurnacesMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {
    public static final ItemGroup ITEM_GROUP = new ItemGroup(FasterFurnacesMod.MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.DIAMOND_FURNACE.get());
        }
    };
}
