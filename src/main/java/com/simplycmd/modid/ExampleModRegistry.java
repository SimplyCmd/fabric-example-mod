package com.simplycmd.modid;

import com.simplycmd.featherlib.registry.SimpleBlock;
import com.simplycmd.featherlib.registry.SimpleItem;
import com.simplycmd.featherlib.registry.SimpleRegistry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Material;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ExampleModRegistry extends SimpleRegistry {

    private static final SimpleBlock[] blocks = {
        new SimpleBlock(ID("example_block"), new Block(FabricBlockSettings.of(Material.STONE)),
            (block) -> new BlockItem(block, new FabricItemSettings()),
            (block, model) -> {
                model.registerSimpleCubeAll(block);
                model.registerParentedItemModel(block);
            }
        ),
    };
    private static final SimpleItem[] items = {
        new SimpleItem(ID("example_item"), new Item(new FabricItemSettings()), (item, model) -> model.register(item, Models.GENERATED)),
    };

    public ExampleModRegistry() {
        super(blocks, items);
    }

    public static Identifier ID(String id) {
        return new Identifier(Main.MOD_ID, id);
    }
    
}
