package com.gamezgalaxy.GGS.system.heartbeat;

import java.io.BufferedReader;
import java.io.IOException;

import com.gamezgalaxy.GGS.server.Server;

public class MBeat extends Heart {
	private boolean show = false;
	@Override
	public String Prepare(Server server) {
		return "port=" + server.Port +
				"&max=" + server.MaxPlayers +
				"&name=" + server.Name.trim() +
				"&public=" + server.Public +
				"&version=7" +
				"&salt=" + server.Salt +
				"&users=" + server.players.size();
	}
	
	@Override
	public String onPump(BufferedReader rdr, Server server) throws IOException {
		String url = "";
		String line = "";
		try {
			while (line != null) {
				line = rdr.readLine();
				if (line != null)
					url = line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rdr.close();
		}
		if (!show) {
			server.Log("URL: " + url);
			show = true;
		}
		return url;
	}

	@Override
	public String getURL() {
		return "http://www.minecraft.net/heartbeat.jsp";
	}
}
