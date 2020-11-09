package com.colmarek.fasterfurnaces.blocks.ironfurnace;

import com.colmarek.fasterfurnaces.FasterFurnacesMod;
import com.colmarek.fasterfurnaces.setup.Config;
import com.colmarek.fasterfurnaces.setup.Registration;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class IronFurnaceTile extends AbstractFurnaceTileEntity {

    public IronFurnaceTile() {
        super(Registration.IRON_FURNACE_TILE.get(), IRecipeType.SMELTING);
    }

    @Override
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container." + FasterFurnacesMod.MODID + ".iron_furnace");
    }

    @Override
    protected int getCookTime() {
        return Math.max(1, super.getCookTime() / Config.IRON_FURNACE_MULTIPLIER);
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new IronFurnaceContainer(id, player, this, this.furnaceData);
    }
}
