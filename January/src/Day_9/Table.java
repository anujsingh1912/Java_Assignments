package Day_9;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your number to get number table till 20: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=20;i++)
		{
			int num=a*i;
			System.out.println("Number Table is: "+num);
		}
	}
}
