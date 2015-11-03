import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		int valueOne, valueTwo;
		
		valueOne = userSelectionOne();
		
		valueTwo = userSelectionTwo();	
		
		operation(valueOne, valueTwo);
		
	}

	//---------------------------------------------------------------------------------------------------
	//Task: This method prompts users to enter in the first number
	//Input: No parameters
	//Return: numOne - The number the user entered
	//---------------------------------------------------------------------------------------------------
	public static int userSelectionOne() {
		Scanner numInput = new Scanner (System.in);
		
		int numOne;
		
		System.out.println("Please enter in a Number: \n");
		numOne = numInput.nextInt();
		
		return numOne;
	}
	
	//---------------------------------------------------------------------------------------------------
	//Task: This method prompts users to enter in the second number
	//Input: No parameters
	//Return: numTwo - The second number the user entered
	//---------------------------------------------------------------------------------------------------
	public static int userSelectionTwo() {
		Scanner numInput = new Scanner (System.in);
		
		int numTwo;
		
		System.out.println("Please enter in a Second Number: \n");
		numTwo = numInput.nextInt();
		
		return numTwo;
	}
	
	//---------------------------------------------------------------------------------------------------
	//Task: This method prompts users to select the operation they would like it to perform
	//Input: valueOne and valueTwo
	//Return: Answer is displayed on console
	//---------------------------------------------------------------------------------------------------
	public static void operation(int valueOne, int valueTwo) {
		Scanner opInput = new Scanner (System.in); 
		
		int numOne, numTwo, answer, operator;
		
		numOne = valueOne;
		
		numTwo = valueTwo;
		
		do {System.out.println("Please select what mathematical operation you would like to perform");
		System.out.println("1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division");
		operator = opInput.nextInt();

		if (operator == 1) {
	
			answer = numOne + numTwo;
	
			System.out.println("Your answer is: " + answer);
	
		} else if (operator == 2) {
	
			answer = numOne - numTwo;
	
			System.out.println("Your answer is: " + answer);
		
		} else if(operator == 3) {
	
			answer = numOne * numTwo;
	
			System.out.println("Your answer is: " + answer);
	
		} else if (operator == 4) {
	
			answer = numOne / numTwo;
	
			System.out.println("Your answer is: " + answer);
		
		} else {
	
			System.out.println("Not a valid choice! \n");
		}

} while ((operator > 4) || (operator < 1));
	}
	
	
}