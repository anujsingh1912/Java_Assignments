package Day_5;

import java.util.Scanner;

public class A1 
{
	public int add(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum Result is:"+c);
		return c;
	}
	public int sub(int a1, int b1)
	{
		int c1=a1-b1;
		System.out.println("Sub Result is:"+c1);
		return c1;
	}
	public int div(int a2, int b2)
	{
		int c2=a2/b2;
		System.out.println("Division Result is:"+c2);
		return c2;
	}
	public void mul(int a3, int b3)
	{
		int c3=a3*b3;
		System.out.println("Multiplication Result is:"+c3);
	}
	public static void main(String[] args) 
	{
		System.out.println("Your Equation is: ((((x1+x2)+x3)-x4)/x5)*x6)");
		System.out.println("Please enter your values:");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int x2=s.nextInt();
		int x3=s.nextInt();
		int x4=s.nextInt();
		int x5=s.nextInt();
		int x6=s.nextInt();
		A1 obj=new A1();
		int sumresult=obj.add(x1,x2);
		int sumresult2=obj.add(sumresult,x3);
		int subresult=obj.sub(sumresult2, x4);
		int divresult=obj.div(subresult, x5);
		obj.mul(divresult, x6);
	}
}
