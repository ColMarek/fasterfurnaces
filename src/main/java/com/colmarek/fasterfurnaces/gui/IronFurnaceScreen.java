package com.colmarek.fasterfurnaces.gui;

import com.colmarek.fasterfurnaces.blocks.ironfurnace.IronFurnaceContainer;
import net.minecraft.client.gui.recipebook.FurnaceRecipeGui;
import net.minecraft.client.gui.screen.inventory.AbstractFurnaceScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class IronFurnaceScreen extends AbstractFurnaceScreen<IronFurnaceContainer> {
    private static final ResourceLocation FURNACE_GUI_TEXTURES = new ResourceLocation("textures/gui/container/furnace.png");

    public IronFurnaceScreen(IronFurnaceContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, new FurnaceRecipeGui(), inv, titleIn, FURNACE_GUI_TEXTURES);
    }
}
