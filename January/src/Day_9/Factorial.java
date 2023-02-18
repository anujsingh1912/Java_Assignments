package Day_9;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int factorial=1;
		System.out.println("Enter your number to get factorial: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
			System.out.println("Factorial of the number is: "+factorial);
		}
	}
	
}
