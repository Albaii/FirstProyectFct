package com.fct.players;

import com.fct.playerInterface.IPlayer;

public class PlayerAliance implements IPlayer{

	@Override
	public void insertPlayer() {
		System.out.println("Welcome aliance player");
		
	}

	@Override
	public void deletePlayerByTag(int tag) {
		System.out.println("Bye aliance player");
		
	}

}
