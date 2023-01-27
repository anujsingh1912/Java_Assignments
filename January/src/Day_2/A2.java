package Day_2;

public class A2 
{
	public void Display()
	{
		System.out.println("Equation is: (((((10/2)-2)+2)-2)*2)");
	}
	public int div(int a, int b)
	{
		int c=a/b;
		System.out.println("Div Result is: "+c);
		return c;
	}
	public int sub(int a1, int b1)
	{
		int c1=a1-b1;
		System.out.println("Sub Result is:"+c1);
		return c1;
	}
	public int add(int a2, int b2)
	{
		int c2=a2+b2;
		System.out.println("Add Result is: "+c2);
		return c2;
	}
	public void mul(int a3, int b3)
	{
		int c3=a3*b3;
		System.out.println("Multi Result is: "+c3);
	}
	public static void main(String[] args) 
	{
		A2 obj=new A2();
		obj.Display();
		int divresult=obj.div(10, 2);
		int subresult=obj.sub(divresult, 2);
		int addresult=obj.add(subresult, 2);
		int subresult2=obj.sub(addresult, 2);
		obj.mul(subresult2, 2);
	}
}
