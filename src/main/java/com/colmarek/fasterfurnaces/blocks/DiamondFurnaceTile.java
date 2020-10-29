package com.colmarek.fasterfurnaces.blocks;

import com.colmarek.fasterfurnaces.FasterFurnacesMod;
import com.colmarek.fasterfurnaces.setup.Registration;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class DiamondFurnaceTile extends AbstractFurnaceTileEntity {

    public DiamondFurnaceTile() {
        super(Registration.DIAMOND_FURNACE_TILE.get(), IRecipeType.SMELTING);
    }

    @Override
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container." + FasterFurnacesMod.MODID + ".diamond_furnace");
    }

    @Override
    protected int getCookTime() {
//        return super.getCookTime() / 300;
        return 1;
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new DiamondFurnaceContainer(id, player, this, this.furnaceData);
    }
}
