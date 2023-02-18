package Day_9;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{	
		System.out.println("Enter a number to check for armstrong:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int result=0, num;
		
		int temp=a;
		while(a>0)
		{
			num=a%10;
			result=result+(num*num*num);
			a=a/10;
		}
		if(result==temp)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("OOPS! Number is not Armstrong");
		}
	}
}
