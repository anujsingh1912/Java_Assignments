package Inheritance;

public class Hierarchical_Child1 extends SingleLvl_Parent
{
	public void m5()
	{
		System.out.println("This is Method of child 1 hierarchical");
	}
	public static void main(String[] args) 
	{
		Hierarchical_Child1 obj=new Hierarchical_Child1();
		obj.m5();
		obj.a=10;
		System.out.println("This is Variable of Parent Class: "+obj.a);
		obj.m1();
		obj.m2(10, 10);
	}
}
