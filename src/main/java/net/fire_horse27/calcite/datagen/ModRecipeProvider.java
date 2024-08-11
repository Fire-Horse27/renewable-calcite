package net.fire_horse27.calcite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fire_horse27.calcite.util.ModTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CALCITE, 4)
                .pattern("##")
                .pattern("##")
                .input('#', ModTags.Items.DEAD_CORAL_BLOCKS)
                .criterion(hasItem(Items.DEAD_BRAIN_CORAL_BLOCK), conditionsFromItem(Items.DEAD_BRAIN_CORAL_BLOCK))
                .criterion(hasItem(Items.DEAD_BUBBLE_CORAL_BLOCK), conditionsFromItem(Items.DEAD_BUBBLE_CORAL_BLOCK))
                .criterion(hasItem(Items.DEAD_FIRE_CORAL_BLOCK), conditionsFromItem(Items.DEAD_FIRE_CORAL_BLOCK))
                .criterion(hasItem(Items.DEAD_HORN_CORAL_BLOCK), conditionsFromItem(Items.DEAD_HORN_CORAL_BLOCK))
                .criterion(hasItem(Items.DEAD_TUBE_CORAL_BLOCK), conditionsFromItem(Items.DEAD_TUBE_CORAL_BLOCK))
                .offerTo(exporter, "calcite:calcite");

        /*ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DISPENSER)
                .input(Items.DROPPER)
                .input(Items.BOW)
                .group("dispenser")
                .criterion(hasItem(Items.DROPPER), conditionsFromItem(Items.DROPPER))
                .criterion(hasItem(Items.BOW), conditionsFromItem(Items.BOW))
                .offerTo(exporter, new Identifier("dispenser_dropper"));*/
        /*ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.DISPENSER)
                .pattern(" WS")
                .pattern("WDS")
                .pattern(" WS")
                .input('S', Items.STRING)
                .input('W', Items.STICK)
                .input('D', Items.DROPPER)
                .criterion(hasItem(Items.DROPPER), conditionsFromItem(Items.DROPPER))
                .group("dispenser")
                .offerTo(exporter, new Identifier("dispenser_stackable"));*/
        /*offerSmelting(exporter, Blocks.RAW_COPPER_BLOCK, RecipeCategory.BUILDING_BLOCKS, Blocks.COPPER_BLOCK,
                        0.7f, 200, "iron_block");*/
    }
}
