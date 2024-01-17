// NAME: SAKSHI SAH
// PRN: 22070126096
// BATCH: AIML B1

package Test;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What do you want to do?");
		System.out.println("1. Array Operations");
		System.out.println("2. Simple Operations");
		
		int choiceOperations = scanner.nextInt();
		if (choiceOperations == 1) {
			System.out.println("1. Sum of Array");
			System.out.println("2. Mean of Array");
			System.out.println("3. Mode of Array");
			System.out.println("4. Median of Array"); 
			System.out.println("5. Variance of Array"); 
			System.out.println("6. Standard Deviation of Array"); 
			
			int choiceArray = scanner.nextInt(); 
			int[] inputArray = UserInput.takeArrayInputs();
			
			switch (choiceArray) {
			case 1:
				int sum = Calculator.sumOfArray(inputArray);
				System.out.println("Sum of array = " + sum);
				break;
				
			case 2:
				double mean = Calculator.meanOfArray(inputArray);
				System.out.println("Mean of array = " + mean);
				break;
				
			case 3:
				int mode = Calculator.modeOfArray(inputArray);
				System.out.println("Mode of array = " + mode);
				break;
				
			case 4:
				double median = Calculator.medianOfArray(inputArray);
				System.out.println("Median of array = " + median);
				break;
			
			case 5:
				double variance = Calculator.varianceOfArray(inputArray);
				System.out.println("Variance of array = " + variance);
				break;
				
			case 6: 
				double standardDeviation = Calculator.stdOfArray(inputArray);
				System.out.println("Standard Deviation of array = " + standardDeviation);
				break;
			}
		}
		
		else if (choiceOperations == 2) {
			System.out.println("Addition: + ");
			System.out.println("Subtraction: -");
			System.out.println("Multiplication: *");
			System.out.println("Division: /"); 
		
			scanner.nextLine();
			String choiceSimple = scanner.nextLine();
			double[] inputSimple = UserInput.takeSimpleInputs();
			
			switch (choiceSimple) {
			case "+":
				double addition = Calculator.addition(inputSimple[0], inputSimple[1]);
				System.out.println("Addition = " + addition);	
				break;
				
			case "-":
				double subtraction = Calculator.subtraction(inputSimple[0], inputSimple[1]);
				System.out.println("Subtraction = " + subtraction);	
				break;
				
			case "*":
				double multiplication = Calculator.multiplication(inputSimple[0], inputSimple[1]);
				System.out.println("Multiplication = " + multiplication);
				break;
				
			case "/":
				double division = Calculator.division(inputSimple[0], inputSimple[1]);
				System.out.println("Division = " + division);	
				break;
			}			
		}
		scanner.close();
	}
}
