package com.colmarek.fasterfurnaces.blocks.goldfurnace;

import com.colmarek.fasterfurnaces.FasterFurnacesMod;
import com.colmarek.fasterfurnaces.setup.Config;
import com.colmarek.fasterfurnaces.setup.Registration;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class GoldFurnaceTile extends AbstractFurnaceTileEntity {

    public GoldFurnaceTile() {
        super(Registration.GOLD_FURNACE_TILE.get(), IRecipeType.SMELTING);
    }

    @Override
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container." + FasterFurnacesMod.MODID + ".gold_furnace");
    }

    @Override
    protected int getCookTime() {
        return Math.max(1, super.getCookTime() / Config.GOLD_FURNACE_MULTIPLIER);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new GoldFurnaceContainer(id, player, this, this.furnaceData);
    }
}
