package com.fct.factory;

import com.fct.playerInterface.IPlayer;

public class PlayerFactory {

	IPlayer player;

	public PlayerFactory(IPlayer player) {
		this.player = player;
	}
	
	public void getInsertPlayer() {
		player.insertPlayer();
	}
	
	public void getDeletePlayer(int tag) {
		player.deletePlayerByTag(tag);
	}
}
