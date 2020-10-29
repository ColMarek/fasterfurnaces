package com.colmarek.fasterfurnaces.blocks.goldfurnace;

import com.colmarek.fasterfurnaces.setup.Registration;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.IIntArray;

public class GoldFurnaceContainer extends AbstractFurnaceContainer {

    public GoldFurnaceContainer(int id, PlayerInventory playerInventoryIn) {
        super(Registration.GOLD_FURNACE_CONTAINER.get(), IRecipeType.SMELTING, id, playerInventoryIn);
    }

    public GoldFurnaceContainer(int id, PlayerInventory playerInventoryIn, IInventory furnaceInventoryIn, IIntArray furnaceDataIn) {
        super(Registration.GOLD_FURNACE_CONTAINER.get(), IRecipeType.SMELTING, id, playerInventoryIn, furnaceInventoryIn, furnaceDataIn);
    }
}
