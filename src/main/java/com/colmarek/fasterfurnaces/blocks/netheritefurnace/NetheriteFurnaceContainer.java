package com.colmarek.fasterfurnaces.blocks.netheritefurnace;

import com.colmarek.fasterfurnaces.setup.Registration;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.RecipeBookCategory;
import net.minecraft.util.IIntArray;

public class NetheriteFurnaceContainer extends AbstractFurnaceContainer {

    public NetheriteFurnaceContainer(int id, PlayerInventory playerInventoryIn) {
        super(Registration.NETHERITE_FURNACE_CONTAINER.get(), IRecipeType.SMELTING, RecipeBookCategory.FURNACE, id, playerInventoryIn);
    }

    public NetheriteFurnaceContainer(int id, PlayerInventory playerInventoryIn, IInventory furnaceInventoryIn, IIntArray furnaceDataIn) {
        super(Registration.NETHERITE_FURNACE_CONTAINER.get(), IRecipeType.SMELTING, RecipeBookCategory.FURNACE,id, playerInventoryIn, furnaceInventoryIn, furnaceDataIn);
    }
}
