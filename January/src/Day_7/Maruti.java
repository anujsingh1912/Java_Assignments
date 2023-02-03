package Day_7;

public class Maruti 
{
	public Maruti()
	{
		this(10,11,12);
		System.out.println("This is Parent Default contructor");
	}
	public Maruti(int a)
	{
		this();
		System.out.println("This is Parent 1 parameterized constructor");
	}
	public Maruti(int a, int b)
	{
		this(10);
		System.out.println("This is Parent 2 parameterized constructor");
	}
	public Maruti(int a, int b, int c)
	{
		System.out.println("This is Parent 3 parameterized constructor");
	}
}

