package com.colmarek.fasterfurnaces.setup;

import com.colmarek.fasterfurnaces.FasterFurnacesMod;
import com.colmarek.fasterfurnaces.blocks.DiamondFurnace;
import com.colmarek.fasterfurnaces.blocks.DiamondFurnaceContainer;
import com.colmarek.fasterfurnaces.blocks.DiamondFurnaceTile;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FasterFurnacesMod.MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FasterFurnacesMod.MODID);
    private static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, FasterFurnacesMod.MODID);
    private static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, FasterFurnacesMod.MODID);

    private static final Item.Properties properties = new Item.Properties().group(ModSetup.ITEM_GROUP);

    public static void init() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        TILES.register(modEventBus);
        CONTAINERS.register(modEventBus);
    }

    public static final RegistryObject<DiamondFurnace> DIAMOND_FURNACE = BLOCKS.register("diamond_furnace", DiamondFurnace::new);
    public static final RegistryObject<Item> DIAMOND_FURNACE_ITEM = ITEMS.register("diamond_furnace", () -> new BlockItem(DIAMOND_FURNACE.get(), properties));
    public static final RegistryObject<ContainerType<DiamondFurnaceContainer>> DIAMOND_FURNACE_CONTAINER = CONTAINERS.register("diamond_furnace", () -> IForgeContainerType.create((windowId, inv, data) -> new DiamondFurnaceContainer(windowId, inv)));
    public static final RegistryObject<TileEntityType<DiamondFurnaceTile>> DIAMOND_FURNACE_TILE = TILES.register("diamond_furnace", () -> TileEntityType.Builder.create(DiamondFurnaceTile::new, DIAMOND_FURNACE.get()).build(null));
}
