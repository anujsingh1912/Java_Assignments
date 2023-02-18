package Day_9;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter 1st number: ");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		
		System.out.println("Enter 2nd number: ");
		Scanner s1=new Scanner(System.in);
		int num2=s.nextInt();
		
		int result;
		
		for(int i=0;i<=10;i++)
		{
			result=num1+num2;
			System.out.println("Number is: "+result);
			num1=num2;
			num2=result;
		}
	}
}
