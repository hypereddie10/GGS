/*******************************************************************************
 * Copyright (c) 2013 MCForge.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package com.ep.ggs.world.blocks.mcmodel;

public class Air extends SMPBlock {

    @Override
    public boolean canWalkThrough() {
        return true;
    }
    
    public Air() {
        super("Air", (byte)0);
    }

}
