package Final_keyword_constant;

// public class Final_2_Inheriting extends Final_1  //final keyword used for class Final_1
public class Final_2_Inheriting 
{

	int b;
	public void m2()
	{
		System.out.println("This is Final_2 class method");
	}
	public static void main(String[] args) 
	{
		Final_2_Inheriting obj=new Final_2_Inheriting();
//		obj.a=123;									//final keyword used for a variable
//		System.out.println(obj.a);
//		obj.m1();
		obj.b=111;
		System.out.println(obj.b);
		obj.m2();
	}
}
