package java_practice;

import java.util.Random;

public class rollingDice {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		int x = randomNumber.nextInt(6) + 1;
		
		System.out.println("You rolled a: " + x);

	}

}
