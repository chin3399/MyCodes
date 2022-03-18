package OOPS;

public class BaseClass {

	int a;
	String name;
	
	public BaseClass()
	{
		System.out.println("Base class contructor");
		
	}
	
	public BaseClass(int i) 
	{
		System.out.println("Single parameter constructor Value is "+i);
	}
	
	public BaseClass(string name, int a)
	{
		
		System.out.println("This is 2 Parameter constructor Value is "+i +','+j);
	}
	public static void main(String[] args) 
	
	{
		BaseClass obj = new BaseClass(10,20);
		
	}

}
