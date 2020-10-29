package com.colmarek.fasterfurnaces.blocks.goldfurnace;

import com.colmarek.fasterfurnaces.blocks.ModFurnace;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class GoldFurnace extends ModFurnace {

    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new GoldFurnaceTile();
    }

    @Override
    protected void interactWith(World worldIn, BlockPos pos, PlayerEntity player) {
        TileEntity tileEntity = worldIn.getTileEntity(pos);
        if (tileEntity instanceof GoldFurnaceTile) {
            NetworkHooks.openGui((ServerPlayerEntity) player, (GoldFurnaceTile) tileEntity, pos);
            player.addStat(Stats.INTERACT_WITH_FURNACE); // From Minecraft source
        }
    }

}
