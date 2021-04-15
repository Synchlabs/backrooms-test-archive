package net.synchlabs.backrooms.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.synchlabs.backrooms.Backrooms;

import java.util.LinkedHashMap;
import java.util.Map;

public class BackroomsBlocks {

    public static final Block WALLPAPER = new Block(FabricBlockSettings.of(Material.BAMBOO).hardness(3).resistance(66).breakByHand(false).breakByTool(FabricToolTags.AXES).requiresTool());
    public static final Block STRIPED_WALLPAPER = new Block(FabricBlockSettings.of(Material.BAMBOO).hardness(3).resistance(66).breakByHand(false).breakByTool(FabricToolTags.AXES).requiresTool());
    public static final Block DOTTED_WALLPAPER = new Block(FabricBlockSettings.of(Material.BAMBOO).hardness(3).resistance(66).breakByHand(false).breakByTool(FabricToolTags.AXES).requiresTool());
    public static final Block DRYWALL = new Block(FabricBlockSettings.of(Material.SPONGE).hardness(1).resistance(5).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.NYLIUM));
    public static final Block CARPET = new Block(FabricBlockSettings.of(Material.WOOL).hardness(1).resistance(0.5).breakByTool(FabricToolTags.SHEARS).sounds(BlockSoundGroup.WET_GRASS));

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(Backrooms.MOD_ID, "patterned_wallpaper"), WALLPAPER);
        Registry.register(Registry.ITEM, new Identifier(Backrooms.MOD_ID, "patterned_wallpaper"), new BlockItem(WALLPAPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Backrooms.MOD_ID, "striped_wallpaper"), STRIPED_WALLPAPER);
        Registry.register(Registry.ITEM, new Identifier(Backrooms.MOD_ID, "striped_wallpaper"), new BlockItem(STRIPED_WALLPAPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Backrooms.MOD_ID, "dotted_wallpaper"), DOTTED_WALLPAPER);
        Registry.register(Registry.ITEM, new Identifier(Backrooms.MOD_ID, "dotted_wallpaper"), new BlockItem(DOTTED_WALLPAPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Backrooms.MOD_ID, "drywall_tile"), DRYWALL);
        Registry.register(Registry.ITEM, new Identifier(Backrooms.MOD_ID, "drywall_tile"), new BlockItem(DRYWALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(Backrooms.MOD_ID, "moist_carpet"), CARPET);
        Registry.register(Registry.ITEM, new Identifier(Backrooms.MOD_ID, "moist_carpet"), new BlockItem(CARPET, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

    }
}
