package Day_8;

public class Non_StaticToStatic 
{
	static int abc;
	public static void m1()
	{
		System.out.println("This is static method-1");
	}
	public static void m2()
	{
		System.out.println("This is static method-2");
	}
	public static void m3()
	{
		System.out.println("This is static method-3");
	}
	public void m4()
	{
		this.m3();
		System.out.println("This is non static method-4");
		this.m2();															//using this keyword
//		Non_StaticToStatic.m3();											//using class name
		Non_StaticToStatic obj1=new Non_StaticToStatic();					//using ref variable
		obj1.m1();																
		abc=123;															//using direct call on static integer
		System.out.println("This is static variable: "+abc);
	}
	public void m5()
	{
		System.out.println("This is non static method-5");
	}
	public static void main(String[] args) 
	{
		Non_StaticToStatic obj=new Non_StaticToStatic();
		obj.m4();
	}
}
