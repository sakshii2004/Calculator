package Test;

import java.util.Scanner;

public class UserInput {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static double[] takeSimpleInputs() {		
		double[] UserInputs = new double[2];
		System.out.println("Enter the first number: ");
		UserInputs[0] = scanner.nextDouble();
		System.out.println("Enter the second number: ");
		UserInputs[1] = scanner.nextDouble();		
		System.out.println(UserInputs[0] + " " + UserInputs[1]);
		return UserInputs;
	}
	
	public static int[] takeArrayInputs() {		
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();		
		int[] array = new int[size];		
		System.out.println("Enter elements of the array: ");		
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		} 
		return array;	
	}
}
