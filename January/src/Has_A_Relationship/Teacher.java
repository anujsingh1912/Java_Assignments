package Has_A_Relationship;

public class Teacher 
{
	int b;
	public void m2()
	{
		System.out.println("This is a teacher class method");
	}
	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.a=1;
		System.out.println("This is Student class variable: "+obj.a);
		obj.m1();
		Teacher obj1=new Teacher();
		obj1.b=10;
		System.out.println("This is teacher class variable: "+obj1.b);
		obj1.m2();
	}
}
 