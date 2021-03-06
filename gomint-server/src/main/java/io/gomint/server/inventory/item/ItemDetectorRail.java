package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo(sId = "minecraft:detector_rail", id = 28)
public class ItemDetectorRail extends ItemStack implements io.gomint.inventory.item.ItemDetectorRail {

    @Override
    public ItemType getItemType() {
        return ItemType.DETECTOR_RAIL;
    }

}
