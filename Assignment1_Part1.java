//Tuck Vollom
//CIS 35a
//Lab 1 - Part 1
//Due Date 		 4/21/2019
//Date Submitted 4/21/2019

import java.util.Scanner;

public class Assignment1_Part1 {

	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);

		// prompt user for values
		System.out.printf("Loan Amount: ");
		double loanAmount = input.nextDouble();

		System.out.printf("Number of years: ");
		int years = input.nextInt();

		System.out.printf("Annual Interest Rate: ");
		double annualRate = input.nextDouble();

		// Monthly interest rate
		double monthlyRate = annualRate / 1200;

		// call monthlyPayment method
		double monthlyPayment;
		monthlyPayment = Assignment1_Part1.findMonthlyPayment(loanAmount, monthlyRate, years);

		// Show monthly payment
		System.out.printf("Monthly Payment: %.2f \n", +monthlyPayment);

		// Show total payment
		System.out.printf("Total Payment: %.2f \n", +(monthlyPayment * 12) * years);

		double balance = loanAmount, principal, interest;

		for (int i = 1; i <= years * 12; i++) {
			interest = monthlyRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance);
			input.close();

		}
	}

//monthlyPayment Method
	static double findMonthlyPayment(double loanAmount, double monthlyRate, int years) {
		double a = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
		return a;
	}
}