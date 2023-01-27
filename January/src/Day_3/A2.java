package Day_3;

public class A2 
{
	public void m1()
	{
		System.out.println("Default Method");
	}
	public void m2(int a)
	{
		System.out.println("One Parameterized Method");
	}
	public void m3(int a, int b)
	{
		System.out.println("Two Parameterized Method");
	}
	public void m4(int a, int b, int c)
	{
		System.out.println("Three Parameterized Method");
	}
	public void m5(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized Method");
		this.m1();
		this.m2(10);
		this.m4(10, 11,12);
		this.m3(10, 10);
	}
	public static void main(String[] args) 
	{
		System.out.println("This is Method using this keyword:");
		System.out.println();
		A2 obj=new A2();
		obj.m5(10,11,12,13);
	}
}
