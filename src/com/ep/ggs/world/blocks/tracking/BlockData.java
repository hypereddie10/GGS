/*******************************************************************************
 * Copyright (c) 2013 MCForge.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package com.ep.ggs.world.blocks.tracking;

import java.io.Serializable;

import com.ep.ggs.world.PlaceMode;
import com.ep.ggs.world.blocks.classicmodel.ClassicBlock;


public class BlockData implements Serializable {
    private static final long serialVersionUID = -7231059348151242381L;
    protected int x, y, z;
    protected long milisecond;
    protected byte type;
    protected ClassicBlock before;
    protected String level;
    
    /**
     * Get the X cord. of the block change.
     * @return
     *        The x value
     */
    public int getX() {
        return x;
    }
    
    /**
     * Get the Y cord. of the block change.
     * @return
     *        The Y value
     */
    public int getY() {
        return y;
    }
    
    /**
     * Get the Z cord. of the block chage.
     * @return
     *       The Z value
     */
    public int getZ() {
        return z;
    }
    
    /**
     * Get the type (place or delete) that occurred as a byte.
     * @return
     */
    public byte getType() {
        return type;
    }
    
    /**
     * Get the type (place or delete) action that occurred as a {@link PlaceMode} object.
     * @return
     */
    public PlaceMode getPlaceType() {
        return PlaceMode.parse(type);
    }
    
    /**
     * Get the <b>name</b> of the level level this blockchange occurred in
     * @return
     */
    public String getLevel() {
        return level;
    }
    
    /**
     * Get the block that was there before this block change occurred
     * @return
     */
    public ClassicBlock getBlock() {
        return before;
    }
}
