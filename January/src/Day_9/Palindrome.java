package Day_9;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int reverse=0, remainder;
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		int temp=a;
		while (a>0)
		{
			remainder=a%10;
			reverse=(reverse*10)+remainder;
			a=a/10;
		}
		if(temp==reverse)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
