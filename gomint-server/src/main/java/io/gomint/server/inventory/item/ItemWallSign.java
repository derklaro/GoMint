/*
 * Copyright (c) 2018, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:wall_sign", id = 68 )
public class ItemWallSign extends ItemStack implements io.gomint.inventory.item.ItemWallSign {

    @Override
    public ItemType getItemType() {
        return ItemType.WALL_SIGN;
    }

}
