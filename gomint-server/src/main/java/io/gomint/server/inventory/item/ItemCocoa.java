package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:cocoa", id = 127)
public class ItemCocoa extends ItemStack implements io.gomint.inventory.item.ItemCocoa {

    @Override
    public ItemType getItemType() {
        return ItemType.COCOA;
    }

}
