package OOPS;

public class ChildClass extends BaseClass{
	
	int a;
	String name;
	
	public ChildClass() {
		
		super(10);
		System.out.println("Child Class Contructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj = new ChildClass();

	}

}
