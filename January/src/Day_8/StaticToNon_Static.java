package Day_8;

public class StaticToNon_Static 
{
	public static void m1()
	{
		System.out.println("This is static method-1");
		StaticToNon_Static obj=new StaticToNon_Static();
		obj.m4();															//calling static to non static using ref variable
		obj.m2();															//calling static to non static using ref variable
		m3();																//direct call for static to static (i.e m1-m3)
//		this.m5();
	}
	public void m2()
	{
		System.out.println("This is non static method-2");
	}
	public static void m3()
	{
		System.out.println("This is static method-3");
//		m4();																//calling static to non-static(not possible)
	}
	public void m4()
	{
		System.out.println("This is non static method-4");
	}
	public void m5()
	{
		System.out.println("This is non static method-5");
	}
	public static void main(String[] args) 
	{
		m1();																//direct call static to static
	}
}
