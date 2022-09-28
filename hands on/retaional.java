package CoreJava;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		//creating Scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		//getting input value from user 
	  System.out.println("Enter the first value: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second value: ");
		int num2=sc.nextInt();
		
		// performing Equal to operation 
		System.out.println(" num1==num2 :" + (num1==num2));
		
		//performing is not equal to operation 
		System.out.println(" num1!=num2 :" + (num1!=num2));
		
		//performing greater than operation 
		System.out.println(" num1>num2 :" + (num1>num2));
		
		//performing less than operation 
		System.out.println(" num1<num2 :" + (num1<num2));
		
		//performing greater than or equal to operation
		System.out.println(" num1>=num2 :" + (num1>=num2));
		
		//performing less than or equal to operation 
		System.out.println(" num1<=num2 :" + (num1<=num2));
	}

}
