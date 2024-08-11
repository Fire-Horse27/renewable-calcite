package net.fire_horse27.calcite.block;

import net.fire_horse27.calcite.Calcite;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    /*public static final Block AZALEA_BUTTON = registerBlock("azalea_button",
            new ButtonBlock(AZALEA, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));*/

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, id(name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, id(name),
                new BlockItem(block, new Item.Settings()));

        return item;
    }

    public static void registerModBlocks() {
        Calcite.LOGGER.debug("Registering ModBlocks for " + Calcite.MOD_ID);
    }

    private static Identifier id(String path) {
        return Identifier.of(Calcite.MOD_ID, path);
    }
}
