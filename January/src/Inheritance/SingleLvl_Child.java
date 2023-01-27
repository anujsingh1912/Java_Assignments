package Inheritance;

public class SingleLvl_Child extends SingleLvl_Parent
{
	int b;
	public void m3()
	{
		System.out.println("This is Child Method");
	}
	public static void main(String[] args) 
	{
		SingleLvl_Child obj=new SingleLvl_Child();
		obj.a=10;
		System.out.println("This is Parent class variable: "+obj.a);
		obj.b=15;
		System.out.println("This is Child class variable: "+obj.b);
		obj.m1();
		obj.m2(10, 10);
		obj.m3();
//		obj.m4();											Multilevel_inheritance objects
//		obj.c=20;											Multilevel_inheritance objects
//		System.out.println("This is Grandfather Class variable: "+obj.c);			Multilevel_inheritance objects
	}
}
