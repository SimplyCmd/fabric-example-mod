package simplycmd.modid;

import io.github.simplycmd.simplylib.registry.ID;
import io.github.simplycmd.simplylib.registry.ItemRegistry;
import io.github.simplycmd.simplylib.registry.RegisterModItemCallback;
import net.minecraft.item.Item;

public class ItemReg {
    // Method is called in Main (go there if you're confused)
    public static void register() {
        RegisterModItemCallback.EVENT.register((items) -> {
            //items.put(ID("example_item"), new Item(new FabricItemSettings().group(ItemGroup.MISC)));
        });
        ItemRegistry.register();
    }

    public static Item get(String itemId) {
        return ItemRegistry.get(ID(itemId));
    }

    private static ID ID(String id) {
        return new ID(Main.MOD_ID, id);
    }
}