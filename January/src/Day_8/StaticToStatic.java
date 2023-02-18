package Day_8;

public class StaticToStatic 
{
	static int abc;
	public static void m1()
	{
		System.out.println("This is first Static method");
		StaticToStatic obj=new StaticToStatic();								//using reference variable
		obj.m3();
	}
	public static void m2() 
	{
		System.out.println("This is second static method");
		m1();																	//using direct call
	}
	public static void m3()
	{
		System.out.println("This is third static method");
//		this.m4();
	}
	public static void m4()
	{
		System.out.println("This is forth static method");
		abc=123;																//using direct call on static variable
		System.out.println("This is static variable: "+abc);					 
	}
	public static void main(String[] args) 
	{
		StaticToStatic.m2();													//using class name
		StaticToStatic.m4();
	}
}
