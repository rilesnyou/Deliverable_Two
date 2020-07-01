package Deliverable_Two;

import java.util.Scanner;

public class Deliverable_Two {
	public static void main(String[] args) {

		String headsOrTailsGuess;
		int numberOfFlips;
		int correctCount = 0;


		Scanner input = new Scanner(System.in);

		System.out.println("Do you think it will land on heads or tails more?");
		headsOrTailsGuess = input.nextLine();
		
		while(headsOrTailsGuess.equalsIgnoreCase("tails")!=true && headsOrTailsGuess.equalsIgnoreCase("heads")!=true) {
			System.out.println("Please enter tails or heads.");
			headsOrTailsGuess = input.nextLine();
		}
		

		System.out.println("How many times would you like to flip?");
		numberOfFlips = input.nextInt();

		while (numberOfFlips <= 0 || numberOfFlips > 100) {
			System.out.println("Please enter a more reasonable number of coins! 1-100 please!");
			System.out.println("How many would you like to flip?");
			numberOfFlips = input.nextInt();
		}

		for (int i = 0; i < numberOfFlips; i++) {
			Math.random();
			if (Math.random() <= .5) {

				System.out.println("Tails");
				if (headsOrTailsGuess.equalsIgnoreCase("Tails")) {
					correctCount++;
				}

			} else {

				System.out.println("Heads");
				if (headsOrTailsGuess.equalsIgnoreCase("Heads")) {
					correctCount++;
				}
			}

		}

		float percentage = (float) correctCount / (float) numberOfFlips * 100;
		String result = ("You guessed " + headsOrTailsGuess + ", it came up " + correctCount + " times. You got " + (int) percentage + "% correct.");
		System.out.print(result);
		
		input.close();
		System.exit(0);
	}
}
