package project_java;
import java.util.Scanner;

public class Task2 {
	// main method begins the execution of program
	public static void main(String[] arg)
	{
		Scanner input = new Scanner( System.in );
		
		int x, y, z;
		int result;
		
		System.out.print("Enter first integer: "); //prompt for input
		x = input.nextInt();
		
		System.out.print("Enter second integer: "); //prompt for input
		y = input.nextInt();
		
		System.out.print("Enter third integer: "); //prompt for input
		z = input.nextInt();
		
		result = x * y * z; //calculate product of numbers
		System.out.printf("Product is: %d", result);
	} // end method main	
} //end class product
