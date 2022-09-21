package com.jimbob.app;

public class Team {

	public static int MAX_PLAYERS = 40;
	Player[] players;
	
	public Team(Player[] players){
	
	}
	
	public Object clone() {
		return players;
	}
	public boolean equals(Object obj) {
		
		return false;
	}
	public int size() {
		return 0;
	}
	public void addPlayer(Player p, int position) {
		
	}
}
