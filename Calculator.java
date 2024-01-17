package Test;

import java.util.Arrays;

public class Calculator {
	
	public static double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	public static double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	public static double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	public static double division(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	public static int sumOfArray(int[] array) {
		int len = array.length;
		int sum = 0;
		for(int i = 0; i < len; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static double meanOfArray(int[] array) {
		int len = array.length;
		double sum = 0.0;
		for(int i = 0; i < len; i++) {
			sum = sum + array[i];
		}
		return sum/len;
	}

	public static int modeOfArray(int[] array) {
		int len = array.length;

		int max = Arrays.stream(array).max().getAsInt();

		int t = max + 1;
        int[] count = new int[t];
        for (int i = 0; i < t; i++) //initialize an empty array that has number of elements equal to the largest element in the array
        {
            count[i] = 0;
        }

		for (int i = 0; i < len; i++)
        {
            count[array[i]]++;
        }

		int mode = 0;
        int k = count[0];
        for (int i = 1; i < t; i++) 
        {
            if (count[i] > k)
            {
                k = count[i];
                mode = i;
            }
        }
		return mode;			
	}
	
	public static double medianOfArray(int[] array) { 
		Arrays.sort(array);
		
		int len = array.length;
		 
        // check for even case
        if (len % 2 != 0)
            return (double)array[len / 2];
 
        return (double)(array[(len - 1) / 2] + array[len / 2]) / 2.0;
	}
	
	public static double varianceOfArray(int[] array) { 
		int lenOfArray = array.length;
        double mean = meanOfArray(array);
        double sumOfSqauredDifference = 0;
        
        for (int i = 0; i < lenOfArray; i++) {
        	sumOfSqauredDifference = sumOfSqauredDifference + Math.pow((array[i] - mean), 2);
        }
        
        double variance = sumOfSqauredDifference / lenOfArray;

        return variance;
	}
	
	public static double stdOfArray(int[] array) { 
		double variance = varianceOfArray(array);
		
		double standardDeviation = Math.sqrt(variance);
		
		return standardDeviation;
 	}
}
