/*******************************************************************************
 * Copyright (c) 2013 MCForge.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package com.ep.ggs.world.blocks.mcmodel;

public class Grass extends SMPBlock {

    @Override
    public boolean canWalkThrough() {
        return false;
    }
    
    public Grass() {
        super("Grass", (byte)2);
    }

}
