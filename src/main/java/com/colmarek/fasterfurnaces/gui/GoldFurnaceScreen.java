package com.colmarek.fasterfurnaces.gui;

import com.colmarek.fasterfurnaces.blocks.goldfurnace.GoldFurnaceContainer;
import net.minecraft.client.gui.recipebook.FurnaceRecipeGui;
import net.minecraft.client.gui.screen.inventory.AbstractFurnaceScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GoldFurnaceScreen extends AbstractFurnaceScreen<GoldFurnaceContainer> {
    private static final ResourceLocation FURNACE_GUI_TEXTURES = new ResourceLocation("textures/gui/container/furnace.png");

    public GoldFurnaceScreen(GoldFurnaceContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, new FurnaceRecipeGui(), inv, titleIn, FURNACE_GUI_TEXTURES);
    }
}
