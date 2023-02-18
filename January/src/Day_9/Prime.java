package Day_9;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
		int count=0;
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		if(num%2==0)
		{
			count++;
		}
			if(count==0)
			{
				System.out.println("Number is Prime");
			}
			else
			{
				System.out.println("Number is not Prime");
			}
	}
}
