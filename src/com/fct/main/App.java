package com.fct.main;

import com.fct.factory.PlayerFactory;
import com.fct.players.PlayerHorde;

public class App {
	public static void main(String[] args) {
		PlayerFactory player = new PlayerFactory(new PlayerHorde()); // You can change PlayerHorde for PlayerAliance
		player.getDeletePlayer(1);
		player.getInsertPlayer();
	}

}
