package com.earthinc.earthincquests.block;

import com.earthinc.earthincquests.EarthIncQuests;
import com.earthinc.earthincquests.block.blocks.TrophyBlock;
import com.earthinc.earthincquests.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, EarthIncQuests.MOD_ID);

    public static final RegistryObject<Block> TY_TROPHY = registerBlock("tytrophy",
            () -> new TrophyBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(.2f)));

    public static final RegistryObject<Block> CRASH_TROPHY = registerBlock("crash_trophy",
            () -> new TrophyBlock(AbstractBlock.Properties.create(Material.SHULKER)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(.2f)));

    public static final RegistryObject<Block> BUILD_TROPHY = registerBlock("build_trophy",
            () -> new TrophyBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(.2f)));

    public static final RegistryObject<Block> BRONZE_TROPHY = registerBlock("bronze_trophy",
            () -> new TrophyBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(.2f)));

    public static final RegistryObject<Block> SILVER_TROPHY = registerBlock("silver_trophy",
            () -> new TrophyBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(.2f)));

    public static final RegistryObject<Block> GOLD_TROPHY = registerBlock("gold_trophy",
            () -> new TrophyBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(.2f)));

    public static final RegistryObject<Block> NETHERITE_TROPHY = registerBlock("netherite_trophy",
            () -> new TrophyBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).hardnessAndResistance(.2f)));



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ItemGroup.MISC)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}