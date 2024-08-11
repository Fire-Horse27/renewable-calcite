package net.fire_horse27.calcite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fire_horse27.calcite.util.ModTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.DEAD_CORAL_BLOCKS)
                .add(Items.DEAD_TUBE_CORAL_BLOCK)
                .add(Items.DEAD_BRAIN_CORAL_BLOCK)
                .add(Items.DEAD_BUBBLE_CORAL_BLOCK)
                .add(Items.DEAD_FIRE_CORAL_BLOCK)
                .add(Items.DEAD_HORN_CORAL_BLOCK);
    }
}
