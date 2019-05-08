//Tuck Vollom
//CIS 35a
//Lab 1 - Part 2
//Due Date 		 4/21/2019
//Date Submitted 4/21/2019

import java.util.Scanner;

public class Assignment1_Part2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter a integer number: ");
		long num = input.nextLong();
		// Call method
		System.out.println("The square root of " + num + " is " + sqrt(num));
		input.close();
	}

	public static double sqrt(long n) {
		// Initial guess as instructed in the assignment
		double lastGuess = 1;
		double nextGuess = (lastGuess + n / lastGuess) / 2;

		//if the difference between NG and LG is less than 0.0001,
		//NG is the approx. n. So the loop must continue with the condition
		//as long as NG-LG>0.0001.
		while(nextGuess - lastGuess > 0.0001) 
		{
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		nextGuess = n;
		return nextGuess = (lastGuess + n / lastGuess) / 2;
	}
}
