package project_java;
import java.util.Scanner;

public class Task2 {
	// main method begins the execution of program
	public static void main(String[] arg)
	{
		Scanner input = new Scanner( System.in );
		
		int x, y, z;
		int result;
		
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter third integer: ");
		z = input.nextInt();
		
		result = x * y * z;
		System.out.printf("Product is: %d", result);
		
	}
}
