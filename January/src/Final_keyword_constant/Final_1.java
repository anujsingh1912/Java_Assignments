package Final_keyword_constant;

public final class Final_1   		//final keyword used for class
{
	final int a=11111;				//final keyword used for variable
	public void m1()
	{
		System.out.println("This is method 1");
	}
	public static void main(String[] args) 
	{
		Final_1 obj=new Final_1();
//		obj.a=111;
		System.out.println(obj.a);
	}
}
