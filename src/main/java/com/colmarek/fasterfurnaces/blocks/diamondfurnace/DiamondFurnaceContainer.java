package com.colmarek.fasterfurnaces.blocks.diamondfurnace;

import com.colmarek.fasterfurnaces.setup.Registration;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.RecipeBookCategory;
import net.minecraft.util.IIntArray;

public class DiamondFurnaceContainer extends AbstractFurnaceContainer {

    public DiamondFurnaceContainer(int id, PlayerInventory playerInventoryIn) {
        super(Registration.DIAMOND_FURNACE_CONTAINER.get(), IRecipeType.SMELTING, RecipeBookCategory.FURNACE, id, playerInventoryIn);
    }

    public DiamondFurnaceContainer(int id, PlayerInventory playerInventoryIn, IInventory furnaceInventoryIn, IIntArray furnaceDataIn) {
        super(Registration.DIAMOND_FURNACE_CONTAINER.get(), IRecipeType.SMELTING, RecipeBookCategory.FURNACE,id, playerInventoryIn, furnaceInventoryIn, furnaceDataIn);
    }
}
