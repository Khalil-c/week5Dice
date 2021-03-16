import java.util.Scanner;

public class Game {

	String firstPlayer = "";
	String secondPlayer = "";
	int totalOfPointsFirstPlayer = 0;
	int numberOfThrows = 0;

	Scanner sc = new Scanner(System.in);
	Player pl = new Player(firstPlayer);
	Dice dice = new Dice(numberOfThrows);

	public void requestPlayerNames() {

		System.out.println("Enter the name of the first player");
		firstPlayer = sc.next();
		System.out.println("Enter the name of the second player");
		secondPlayer = sc.next();
	}

	public String requestPlayerThrows(String player) {
		System.out.println("################## " + player + " ##################");
		System.out.print(player + ", please press Enter to throw a dice...");
		sc.nextLine();
		System.out.println(player + ", you got: " + dice.throwDice());
		pl.setTotalPoints(dice.value);
		System.out.print(player + ", please press Enter to throw a dice...");
		sc.nextLine();
		System.out.println(player + ", you got: " + dice.throwDice());
		pl.setTotalPoints(dice.value);
		System.out.print(player + ", please press Enter to throw a dice...");
		sc.nextLine();
		System.out.println(player + ", you got: " + dice.throwDice());
		pl.setTotalPoints(dice.value);
		System.out.println("");
		System.out.println(player + ", that was your last throw!! you got: " + pl.getTotalPoints() + " points!!");

		return player;
	}

	public void comparePointsOfPlayers(String firstPlayer, String secondPlayer) {

		System.out.println("################## " + firstPlayer + " Vs. " + secondPlayer + " ##################");
		
		if (pl.getTotalPoints() > totalOfPointsFirstPlayer) {
			System.out.println(" " + secondPlayer + " won the game!");
		} else if (pl.getTotalPoints() < totalOfPointsFirstPlayer) {
			System.out.println(" " + firstPlayer + " won the game!");
		} else
			System.out.println(" It was a draw!");

	}

	public void runGame() {
		requestPlayerNames();
		requestPlayerThrows(firstPlayer);
		totalOfPointsFirstPlayer = pl.getTotalPoints();
		pl.setTotalPoints(pl.getTotalPoints() * -1);// to set total point to 0
		requestPlayerThrows(secondPlayer);
		comparePointsOfPlayers(firstPlayer, secondPlayer);

	}

}
