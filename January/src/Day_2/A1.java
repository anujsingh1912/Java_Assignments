package Day_2;

public class A1 
{
	public void Display()
	{
		System.out.println("Equation is: (((((10+2)+2)-2)*2)/2)");
	}
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum Result is: "+c);
		return c;
	}
	public int sub(int a1, int b1)
	{
		int c1=a1-b1;
		System.out.println("Sub Result is: "+c1);
		return c1;
	}
	public int mul(int a2, int b2)
	{
		int c2=a2*b2;
		System.out.println("Mul Result is: "+c2);
		return c2;
	}
	public void div(int a3, int b3)
	{
		int c3=a3/b3;
		System.out.println("Div Result is: "+c3);
	}
	public static void main(String[] args) 
	{
	A1 obj=new A1();
	obj.Display();
	int sumresult=obj.sum(10, 2);
	int sumresult2=obj.sum(sumresult, 2);
	int subresult=obj.sub(sumresult2, 2);
	int mulresult=obj.mul(subresult, 2);
	obj.div(mulresult, 2);
	}
}
