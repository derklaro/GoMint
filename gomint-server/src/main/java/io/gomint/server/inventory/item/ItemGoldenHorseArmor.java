package io.gomint.server.inventory.item;
import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:horsearmorgold", id = 418 )
 public class ItemGoldenHorseArmor extends ItemStack implements io.gomint.inventory.item.ItemGoldenHorseArmor {



    @Override
    public ItemType getItemType() {
        return ItemType.GOLDEN_HORSE_ARMOR;
    }

}