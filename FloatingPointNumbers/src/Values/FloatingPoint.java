package Values;

import java.util.Scanner;

public class FloatingPoint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numAmount;
		do { 
			System.out.println("How many values have you prepared? (1-5)");
			while (!scanner.hasNextInt()) {
				System.out.println("Invalid, enter a value between 1 and 5");
				scanner.next();
			}
			numAmount = scanner.nextInt();
			if (numAmount < 1 || numAmount > 5) {
				System.out.println("This program handles 1-5 values only");
			}
			
		} while (numAmount < 1 || numAmount >5);
		
		double[] inputValues = new double[numAmount]; 	
		
		int tally = 0;
		double total = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		while (tally < numAmount) {
			System.out.println("Enter value " + (tally + 1) + ": ");
			if (scanner.hasNextDouble()) {
				double sum = scanner.nextDouble();
				inputValues[tally] = sum;
				total += sum;			
				if (sum > max) {
					max = sum;
				}
				if (sum < min) {
					min = sum;
				}
				
				
					tally ++;
			} else { 
				System.out.println("Invalid entry");
				scanner.next();
			}
		}
		
		double average = total / numAmount;
		double interest = total * 0.20;
		
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("20% interest: " + interest);
		
		scanner.close();
	}
	
}
		

