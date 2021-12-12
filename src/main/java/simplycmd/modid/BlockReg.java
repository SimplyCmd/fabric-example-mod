package simplycmd.modid;

import io.github.simplycmd.simplylib.registry.BlockRegistry;
import io.github.simplycmd.simplylib.registry.RegisterModBlockCallback;
import io.github.simplycmd.simplylib.registry.ID;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class BlockReg {
    // Method is called in Main (go there if you're confused)
    public static void register() {
        RegisterModBlockCallback.EVENT.register((blocks, block_items) -> {
            // Blocks
            //blocks.put(new BlockRegistrySettings(ID("example_item")), new Block(FabricBlockSettings.of(Material.STONE)));
            
            // Block Items
            //block_items.put(ID("example_item"), new BlockItem(get("example_item"), new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        });

        BlockRegistry.register();
    }

    public static Block get(String blockId) {
        try {
            return BlockRegistry.get(ID(blockId));
        } catch (IllegalArgumentException i) {
            return Blocks.AIR;
        }
    }

    private static ID ID(String id) {
        return new ID(Main.MOD_ID, id);
    }
}