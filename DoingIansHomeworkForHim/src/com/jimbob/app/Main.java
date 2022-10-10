package com.jimbob.app;

import java.util.Scanner;

public class Main {

	static int MAX_TEAMS = 5;
	private Team[] teams;
	
	public static void main(String[] args) {
		Team[] teams = new Team[MAX_TEAMS]; //instantiate max amount of teams
		Player player = new Player(null, 0, 0); //instantiate the player object
		Team team = new Team(); //instantiate the team object

		char option ='0';
		
		Scanner scanner = new Scanner(System.in);

		
		do {
			System.out.println("Please select an option:");
			System.out.println("A) Add Player.");
			System.out.println("G) Get Player stats.");
			System.out.println("L) Get leader in a stat.");
			System.out.println("R) Remove Player.");
			System.out.println("P) Print all players");
			System.out.println("S) Size of team.");
			System.out.println("T) Select team.");
			System.out.println("C) Clone team.");
			System.out.println("E) Team equals.");
			System.out.println("U) Update stat.");
			System.out.println("Q) Quit.");
			
			option = scanner.next().charAt(0);
			
				switch(option) {
				
			case 'A':System.out.print("Enter the Player's name: ");
					 scanner.nextLine();
					 String playerName = scanner.nextLine();
					 System.out.print("Enter the number of hits: ");
					 int playerHits = scanner.nextInt();
					 System.out.print("Enter the number of errors: ");
					 int playerErrors = scanner.nextInt();
					 System.out.print("Enter the position: ");
					 int playerPosition = scanner.nextInt();
					 team.addPlayer(new Player(playerName, playerHits, playerErrors), playerPosition);
					player.setName(playerName);
					player.setNumHits(playerHits);
					player.setNumErros(playerErrors);
					//System.out.println("Player added: "+playerName+" - "+playerHits+" hits, "+playerErrors+" errors");
					System.out.println(player.toString());
					System.out.println();
					break;
			case 'G':System.out.print("Enter the position: ");
					 int position = scanner.nextInt();
					 team.getPlayer(position);
					 System.out.println(player);
					 System.out.println();
					 break;
			case 'L':System.out.print("Enter the stat: ");
					 String stat = scanner.next();
					 break;
			case 'R':System.out.print("Enter position of player that you would like to remove: ");
					 int position1 = scanner.nextInt();
					 team.removePlayer(position1);
					 System.out.println(player.getName()+ " removed!");
					 break;
			case 'P':team.printAllPlayers();
					 break;
			}
		}
		while(option != 'Q');
			
	}

}
