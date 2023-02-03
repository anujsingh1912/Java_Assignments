package Day_7;

public class Swift extends Maruti
{
	public Swift()
	{
		this(10,11);
		System.out.println("This is Child class default constructor");
	}
	public Swift(int a)
	{
		this(11,12,13);
		System.out.println("This is Child class 1 parameterized constructor");
	}
	public Swift(int a, int b)
	{
		super(10,11);
		System.out.println("This is Child class 2 parameterized constructor");
	}
	public Swift (int a, int b, int c)
	{
		this();
		System.out.println("This is Child class 3 parameterized constructor");
	}
	public static void main(String[] args) 
	{
	Swift s=new Swift(11);	
	}
}
