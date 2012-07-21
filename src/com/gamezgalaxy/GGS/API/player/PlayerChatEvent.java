package com.gamezgalaxy.GGS.API.player;

import com.gamezgalaxy.GGS.API.Cancelable;
import com.gamezgalaxy.GGS.API.EventList;
import com.gamezgalaxy.GGS.server.Player;

public class PlayerChatEvent extends PlayerEvent implements Cancelable {

	private static EventList events = new EventList();
	
	private boolean _canceled; 
	
	private String message;
	
	private String orginalmessage;
	
	public PlayerChatEvent(Player who, String message) {
		super(who);
		this.message = message;
		this.orginalmessage = message;
	}
	
	@Override
	public EventList getEvents() {
		return events;
	}
	
	public static EventList getEventList() {
		return events;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getOrginalMessage() {
		return orginalmessage;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public boolean isCancelled() {
		return _canceled;
	}

	@Override
	public void Cancel(boolean cancel) {
		_canceled = cancel;
	}
}
