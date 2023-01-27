package Day_3;

public class A1 
{
	public A1()
	{
		this(11,12,13);
		System.out.println("Default Contructor");
	}
	public A1(int a)
	{
		this();
		System.out.println("One Parameterized constructor");
	}
	public A1(int a, int b)
	{
		this(12, 11, 11, 11);
		System.out.println("Two Parameterized constructor");
	}
	public A1(int a, int b, int c)
	{
		System.out.println("Three Parameterized Constructor");
	}
	public A1(int a, int b, int c, int d)
	{
		this(11);
		System.out.println("Four Parameterized constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("This is Constructor using this keyword:");
		System.out.println();
		A1 obj=new A1(11,12);	
	}
}
