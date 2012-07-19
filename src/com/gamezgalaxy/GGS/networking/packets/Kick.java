/*******************************************************************************
 * Copyright (c) 2012 GamezGalaxy.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package com.gamezgalaxy.GGS.networking.packets;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.gamezgalaxy.GGS.networking.Packet;
import com.gamezgalaxy.GGS.networking.PacketManager;
import com.gamezgalaxy.GGS.networking.PacketType;
import com.gamezgalaxy.GGS.server.Player;
import com.gamezgalaxy.GGS.server.Server;

public class Kick extends Packet {

	public Kick(String name, byte ID, PacketManager parent,
			PacketType packetType) {
		super(name, ID, parent, packetType);
		// TODO Auto-generated constructor stub
	}
	
	public Kick(PacketManager pm) {
		super("Kick", (byte)0x0e, pm, PacketType.Server_to_Client);
	}

	@Override
	public void Handle(byte[] message, Server server, Player player) {
	}

	@Override
	public void Write(Player player, Server server) {
		try {
			while (player.kickreason.length() < 64) {
				player.kickreason += " ";
			}
			byte[] temp = player.kickreason.getBytes("US-ASCII");
			byte[] finals = new byte[1 + temp.length];
			finals[0] = ID;
			System.arraycopy(temp, 0, finals, 1, temp.length);
			player.WriteData(finals);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
