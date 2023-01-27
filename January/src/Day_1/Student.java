package Day_1;

public class Student 
{
	int age;
	int roll_no;
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.age=18;
		System.out.println(obj.age);
		obj.roll_no=18;
		System.out.println(obj.roll_no);
		obj.display1();
		obj.display2();
	}
}
