package com.colmarek.fasterfurnaces.setup;

import com.colmarek.fasterfurnaces.FasterFurnacesMod;
import com.colmarek.fasterfurnaces.blocks.diamondfurnace.DiamondFurnace;
import com.colmarek.fasterfurnaces.blocks.diamondfurnace.DiamondFurnaceContainer;
import com.colmarek.fasterfurnaces.blocks.diamondfurnace.DiamondFurnaceTile;
import com.colmarek.fasterfurnaces.blocks.goldfurnace.GoldFurnace;
import com.colmarek.fasterfurnaces.blocks.goldfurnace.GoldFurnaceContainer;
import com.colmarek.fasterfurnaces.blocks.goldfurnace.GoldFurnaceTile;
import com.colmarek.fasterfurnaces.blocks.ironfurnace.IronFurnace;
import com.colmarek.fasterfurnaces.blocks.ironfurnace.IronFurnaceContainer;
import com.colmarek.fasterfurnaces.blocks.ironfurnace.IronFurnaceTile;
import com.colmarek.fasterfurnaces.blocks.netheritefurnace.NetheriteFurnace;
import com.colmarek.fasterfurnaces.blocks.netheritefurnace.NetheriteFurnaceContainer;
import com.colmarek.fasterfurnaces.blocks.netheritefurnace.NetheriteFurnaceTile;
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

    public static final RegistryObject<IronFurnace> IRON_FURNACE = BLOCKS.register("iron_furnace", IronFurnace::new);
    public static final RegistryObject<Item> IRON_FURNACE_ITEM = ITEMS.register("iron_furnace", () -> new BlockItem(IRON_FURNACE.get(), properties));
    public static final RegistryObject<ContainerType<IronFurnaceContainer>> IRON_FURNACE_CONTAINER = CONTAINERS.register("iron_furnace", () -> IForgeContainerType.create((windowId, inv, data) -> new IronFurnaceContainer(windowId, inv)));
    public static final RegistryObject<TileEntityType<IronFurnaceTile>> IRON_FURNACE_TILE = TILES.register("iron_furnace", () -> TileEntityType.Builder.create(IronFurnaceTile::new, IRON_FURNACE.get()).build(null));

    public static final RegistryObject<GoldFurnace> GOLD_FURNACE = BLOCKS.register("gold_furnace", GoldFurnace::new);
    public static final RegistryObject<Item> GOLD_FURNACE_ITEM = ITEMS.register("gold_furnace", () -> new BlockItem(GOLD_FURNACE.get(), properties));
    public static final RegistryObject<ContainerType<GoldFurnaceContainer>> GOLD_FURNACE_CONTAINER = CONTAINERS.register("gold_furnace", () -> IForgeContainerType.create((windowId, inv, data) -> new GoldFurnaceContainer(windowId, inv)));
    public static final RegistryObject<TileEntityType<GoldFurnaceTile>> GOLD_FURNACE_TILE = TILES.register("gold_furnace", () -> TileEntityType.Builder.create(GoldFurnaceTile::new, GOLD_FURNACE.get()).build(null));

    public static final RegistryObject<DiamondFurnace> DIAMOND_FURNACE = BLOCKS.register("diamond_furnace", DiamondFurnace::new);
    public static final RegistryObject<Item> DIAMOND_FURNACE_ITEM = ITEMS.register("diamond_furnace", () -> new BlockItem(DIAMOND_FURNACE.get(), properties));
    public static final RegistryObject<ContainerType<DiamondFurnaceContainer>> DIAMOND_FURNACE_CONTAINER = CONTAINERS.register("diamond_furnace", () -> IForgeContainerType.create((windowId, inv, data) -> new DiamondFurnaceContainer(windowId, inv)));
    public static final RegistryObject<TileEntityType<DiamondFurnaceTile>> DIAMOND_FURNACE_TILE = TILES.register("diamond_furnace", () -> TileEntityType.Builder.create(DiamondFurnaceTile::new, DIAMOND_FURNACE.get()).build(null));

    public static final RegistryObject<NetheriteFurnace> NETHERITE_FURNACE = BLOCKS.register("netherite_furnace", NetheriteFurnace::new);
    public static final RegistryObject<Item> NETHERITE_FURNACE_ITEM = ITEMS.register("netherite_furnace", () -> new BlockItem(NETHERITE_FURNACE.get(), properties));
    public static final RegistryObject<ContainerType<NetheriteFurnaceContainer>> NETHERITE_FURNACE_CONTAINER = CONTAINERS.register("netherite_furnace", () -> IForgeContainerType.create((windowId, inv, data) -> new NetheriteFurnaceContainer(windowId, inv)));
    public static final RegistryObject<TileEntityType<NetheriteFurnaceTile>> NETHERITE_FURNACE_TILE = TILES.register("netherite_furnace", () -> TileEntityType.Builder.create(NetheriteFurnaceTile::new, NETHERITE_FURNACE.get()).build(null));
}
