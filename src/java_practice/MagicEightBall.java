package java_practice;

import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your question.");
		
		//Scanner allows us to let user type into console
		Scanner scan = new Scanner(System.in);
		scan.next();
		scan.close();
		
		Random randomNumber = new Random();
		int r = randomNumber.nextInt(5);
		
		if(r == 0) {
			System.out.println("As I see it, yes.");
		} else if(r == 1) {
			System.out.println("As I see it, yes.");
		} else if(r == 2) {
			System.out.println("Reply hazy, try again.");
		} else if(r == 3) {
			System.out.println("Don't count on it.");
		} else if(r == 4) {
			System.out.println("Outlook not so good.");
		}
		
	}

}
