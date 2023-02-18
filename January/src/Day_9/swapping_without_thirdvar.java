package Day_9;

public class swapping_without_thirdvar 
{
	public static void main(String[] args) 
	{
		int a=15;
		int b=12;
		System.out.println("Value of a before swap: "+a);
		System.out.println("Value of b before swap: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a after swap: "+a);
		System.out.println("Value of b after swap: "+b);
	}
}
