package com.colmarek.fasterfurnaces.blocks.ironfurnace;

import com.colmarek.fasterfurnaces.setup.Registration;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.RecipeBookCategory;
import net.minecraft.util.IIntArray;

public class IronFurnaceContainer extends AbstractFurnaceContainer {

    public IronFurnaceContainer(int id, PlayerInventory playerInventoryIn) {
        super(Registration.IRON_FURNACE_CONTAINER.get(), IRecipeType.SMELTING, RecipeBookCategory.FURNACE, id, playerInventoryIn);
    }

    public IronFurnaceContainer(int id, PlayerInventory playerInventoryIn, IInventory furnaceInventoryIn, IIntArray furnaceDataIn) {
        super(Registration.IRON_FURNACE_CONTAINER.get(), IRecipeType.SMELTING, RecipeBookCategory.FURNACE, id, playerInventoryIn, furnaceInventoryIn, furnaceDataIn);
    }
}
