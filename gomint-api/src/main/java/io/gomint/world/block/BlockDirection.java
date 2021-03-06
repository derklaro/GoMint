/*
 * Copyright (c) 2018 Gomint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.world.block;

import io.gomint.world.block.data.Direction;

/**
 * @author geNAZt
 * @version 1.0
 * @stability 3
 */
public interface BlockDirection extends Block {

    /**
     * Set the direction of this block, this block can also hold null as direction (sit on ground)
     *
     * @param direction of this block
     */
    void setDirection( Direction direction );

    /**
     * Get the direction in which this block
     *
     * @return the direction of this block, null when no direction given (sitting on ground)
     */
    Direction getDirection();

}
