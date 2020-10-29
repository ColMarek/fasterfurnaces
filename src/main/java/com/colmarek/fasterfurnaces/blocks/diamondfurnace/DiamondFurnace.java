package com.colmarek.fasterfurnaces.blocks.diamondfurnace;

import com.colmarek.fasterfurnaces.blocks.ModFurnace;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class DiamondFurnace extends ModFurnace {

    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new DiamondFurnaceTile();
    }

    @Override
    protected void interactWith(World worldIn, BlockPos pos, PlayerEntity player) {
        TileEntity tileEntity = worldIn.getTileEntity(pos);
        if (tileEntity instanceof DiamondFurnaceTile) {
            NetworkHooks.openGui((ServerPlayerEntity) player, (DiamondFurnaceTile) tileEntity, pos);
            player.addStat(Stats.INTERACT_WITH_FURNACE); // From Minecraft source
        }
    }

}
