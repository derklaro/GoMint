package io.gomint.inventory.item;

import io.gomint.GoMint;

/**
 * @author geNAZt
 * @version 1.0
 * @stability 1
 */
public interface ItemStainedGlassPane extends ItemStack {

    /**
     * Create a new item stack with given class and amount
     *
     * @param amount which is used for the creation
     */
    static ItemStainedGlassPane create( int amount ) {
        return GoMint.instance().createItemStack( ItemStainedGlassPane.class, amount );
    }

}
