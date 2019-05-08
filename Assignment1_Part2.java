//Tuck Vollom
/*
 * Chapter 6 Exercise 22:
 *
 *      (Math: approximate the square root) There are several techniques for implementing
 *      the sqrt method in the Math class. One such technique is known as the Babylonian method.
 *      It approximates the square root of a number, n, by repeatedly performing a calculation
 *      using the following formula:
 *
 *          nextGuess = (lastGuess + n / lastGuess) / 2
 *
 *      When nextGuess and lastGuess are almost identical, nextGuess is the approximated square root.
 *      The initial guess can be any positive value (e.g., 1). This value will be the starting value
 *      for lastGuess. If the difference between nextGuess and lastGuess is less than a very small
 *      number, such as 0.0001, you can claim that nextGuess is the approximated square root of n.
 *      If not, next- Guess becomes lastGuess and the approximation process continues. Implement
 *      the following method that returns the square root of n.
 *
 *      public static double sqrt(long n)
*/

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
