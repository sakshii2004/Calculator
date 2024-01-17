# Calculator

## Calculator.java

`addition(double firstNumber, double secondNumber):`
Calculates and returns the sum of two double numbers.

`subtraction(double firstNumber, double secondNumber):`
Calculates and returns the result of subtracting the second double number from the first double number.

`multiplication(double firstNumber, double secondNumber):`
Calculates and returns the product of two double numbers.

`division(double firstNumber, double secondNumber):`
Calculates and returns the result of dividing the first double number by the second double number.

`sumOfArray(int[] array):`
Calculates and returns the sum of all elements in an integer array.

`meanOfArray(int[] array):`
Calculates and returns the mean (average) of all elements in an integer array.

`modeOfArray(int[] array):`
Calculates and returns the mode (most frequent element) of an integer array. If there are multiple modes, it returns the smallest one.

`medianOfArray(int[] array):`
Calculates and returns the median of an integer array. If the array has an odd length, it returns the middle element; if it has an even length, it returns the average of the two middle elements.

`varianceOfArray(int[] array):`
Calculates and returns the variance of an integer array. It measures the spread of data points around the mean.

`stdOfArray(int[] array):`
Calculates and returns the standard deviation of an integer array. It is the square root of the variance and provides a measure of the amount of variation or dispersion in the dataset.

## UserInput.java

`takeSimpleInputs():`
Description: This method is used to take simple numeric inputs from the user. It prompts the user to enter two numbers (doubles) and stores them in an array.
Return Type: double[] - An array containing the two input numbers.
Functionality:
Prompts the user to enter the first number.
Reads and stores the first number in the array.
Prompts the user to enter the second number.
Reads and stores the second number in the array.
Prints the entered numbers.
Returns the array containing the entered numbers.

`takeArrayInputs():`
Description: This method is used to take inputs for an integer array from the user. It prompts the user to enter the size of the array and then the elements of the array.
Return Type: int[] - An array containing the entered integer elements.
Functionality:
Prompts the user to enter the size of the array.
Reads and stores the size.
Creates an integer array of the specified size.
Prompts the user to enter each element of the array.
Reads and stores each element in the array.
Returns the array containing the entered elements.

These methods encapsulate the logic for taking user inputs in a console application. They are designed to be reusable, allowing the user to input either a pair of numbers or an array of integers, depending on the application's needs. The methods use the Scanner class to read input from the console.









