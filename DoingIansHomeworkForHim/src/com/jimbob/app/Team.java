package com.jimbob.app;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.tools.DocumentationTool.Location;


public class Team implements Cloneable {

	public static int MAX_PLAYERS = 40;
	private Player[] players;
	
	public Team(){
		players = new Player[MAX_PLAYERS];
	}
	public Object clone() {
		Location answer;
		try {
			answer = (Location)super.clone();	
		}
		catch(CloneNotSupportedException e) {
			throw new RuntimeException("");
		}
		//Team players = (Team)super.clone();
		return answer;
	}
	public boolean equals(Object obj) {
		if(players.equals(obj)) {
			return true;}
		else {return false;}
	}
	public int size() {
		return players.length;
	}
	public void addPlayer(Player p, int position) {
		if(position != 0) {
			players[position] = p;
		}
		
		//throw new IllegalArgumentException("Unable to add player.");
		//throw new FullTeamException("That Team is full. No more players can be added.");
		
	}
	public void removePlayer(int position) {
		for(int i = 0; i < players.length-1; i++) {
			players[i] = players[i+1];
		}
	}
	public Player getPlayer(int position) {
		if(players[position]==null) {
			throw new IllegalArgumentException("Player not found");
		}
		else {
		return players[position];
		}
	}
	public Player getLeader(String stat) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		for(int i=0; i<players.length;i++) {
		if(stat == "hits") {
			System.out.println();
		}
		else if(stat == "errors") {
			
		}
		else {
			throw new IllegalArgumentException("Player/Leader not found");
			}
		}
		return null;
	}
	
	public void printAllPlayers() {
		for(int i=0; i<players.length;i++) {
//			Player player = players[i];
//			System.out.println(player.getName());
//			System.out.println(player.getNumHits());
//			System.out.println(player.getNumErros());
		}
	}

	@Override
	public String toString() {
		return "Team [players=" + Arrays.toString(players) + "]";
	}
	
}
