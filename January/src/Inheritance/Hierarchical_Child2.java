package Inheritance;

public class Hierarchical_Child2 extends SingleLvl_Parent
{
	int x;
	public void m7() 
	{
		System.out.println("This is the method of child 2 Hierarchical");
	}
	public static void main(String[] args) 
	{
		Hierarchical_Child2 obj=new Hierarchical_Child2();
		obj.x=10;
		System.out.println("This is Variable of Child 2 class: "+obj.x);
		obj.m7();
		obj.a=10;
		System.out.println("This is Variable of Parent Class: "+obj.a);
		obj.m1();
		obj.m2(10, 10);
	}
}
