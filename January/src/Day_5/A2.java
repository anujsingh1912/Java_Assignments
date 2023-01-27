package Day_5;

import java.util.Scanner;

public class A2 
{
	public int mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiplication Result is:" +c);
		return c;	
	}
	public int sub(int a1, int b1)
	{
		int c1=a1-b1;
		System.out.println("Subtraction Result is:" +c1);
		return c1;
	}
	public int add(int a2, int b2)
	{
		int c2=a2+b2;
		System.out.println("Sum result is:" +c2);
		return c2;
	}
	public void div(int a3, int b3)
	{
		int c3=a3/b3;
		System.out.println("Division result is:" +c3);
	}
	public static void main(String[] args) 
	{
		System.out.println("Your Equation is: (((((x1*x2)-x3)+x4)-x5)/x6)");
		System.out.println("Please enter your values:");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int x2=s.nextInt();
		int x3=s.nextInt();
		int x4=s.nextInt();
		int x5=s.nextInt();
		int x6=s.nextInt();
		A2 obj=new A2();
		int mulresult=obj.mul(x1, x2);
		int subresult=obj.sub(mulresult, x3);
		int sumresult=obj.add(subresult, x4);
		int subresult2=obj.sub(sumresult, x5);
		obj.div(subresult2, x6);
	}
}
