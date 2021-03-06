/*
 * Copyright (c) 2018 Gomint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.world.generator.object;

import io.gomint.world.block.Block;

/**
 * @author geNAZt
 * @version 1.0
 */
public class OreType {

    private Block block;
    private int clusterCount;
    private int clusterSize;
    private int minHeight;
    private int maxHeight;

    public OreType(Block block, int clusterCount, int clusterSize, int minHeight, int maxHeight) {
        this.block = block;
        this.clusterCount = clusterCount;
        this.clusterSize = clusterSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Block getBlock() {
        return block;
    }

    public int getClusterCount() {
        return clusterCount;
    }

    public int getClusterSize() {
        return clusterSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

}
