package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemBurnable;
import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 173 )
public class ItemBlockOfCoal extends ItemStack implements io.gomint.inventory.item.ItemBlockOfCoal, ItemBurnable {

    @Override
    public ItemType getType() {
        return ItemType.BLOCK_OF_COAL;
    }

    @Override
    public long getBurnTime() {
        return 800000;
    }

}
