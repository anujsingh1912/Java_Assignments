package Day_7;

public class SuperChild_A2 extends Super_A2
{
	public void m3()
	{
		System.out.println("Child Default method");
	}
	public void m4(int a)
	{
		System.out.println("Child 1 parameterized method");
	}
	public void m5(int a, int b)
	{
		super.m1();
		super.m3(10, 11);
		super.m2(10);
		super.m4(10, 11, 12);
		System.out.println("Child 2 parameterized method");
	}
	public void m6(int a, int b, int c)
	{
		this.m5(10, 11);
		this.m3();
		this.m4(10);
		System.out.println("Child 3 parameterized method");
	}
	public static void main(String[] args) 
	{
		SuperChild_A2 obj=new SuperChild_A2();
		obj.m6(10,11,12);
	}
} 
