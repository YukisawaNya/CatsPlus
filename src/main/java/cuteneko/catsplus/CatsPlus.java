package cuteneko.catsplus;

import cuteneko.catsplus.item.MyItemGroups;
import cuteneko.catsplus.item.MyItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class CatsPlus implements ModInitializer {


    @Override
    public void onInitialize() {
        new MyItems();
        new MyItemGroups();
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> content.add(MyItems.CAT_BAG));
    }
}
