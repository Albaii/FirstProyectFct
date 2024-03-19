package com.fct.players;

import com.fct.playerInterface.IPlayer;

public class PlayerHorde implements IPlayer{

	@Override
	public void insertPlayer() {
		System.out.println("Welcome horde player!");
		
	}

	@Override
	public void deletePlayerByTag(int id) {
		System.out.println("Bye horde player!");
		
	}

}
