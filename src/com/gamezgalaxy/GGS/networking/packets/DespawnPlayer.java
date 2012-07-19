/*******************************************************************************
 * Copyright (c) 2012 GamezGalaxy.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package com.gamezgalaxy.GGS.networking.packets;

import com.gamezgalaxy.GGS.networking.Packet;
import com.gamezgalaxy.GGS.networking.PacketManager;
import com.gamezgalaxy.GGS.networking.PacketType;
import com.gamezgalaxy.GGS.server.Player;
import com.gamezgalaxy.GGS.server.Server;

public class DespawnPlayer extends Packet {

	public DespawnPlayer(String name, byte ID, PacketManager parent,
			PacketType packetType) {
		super(name, ID, parent, packetType);
		// TODO Auto-generated constructor stub
	}
	
	public DespawnPlayer(PacketManager pm) {
		super("DespawnPlayer", (byte)0x0c, pm, PacketType.Server_to_Client);
	}

	@Override
	public void Handle(byte[] message, Server server, Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Write(Player player, Server server) {
		// TODO Auto-generated method stub
		
	}

}
