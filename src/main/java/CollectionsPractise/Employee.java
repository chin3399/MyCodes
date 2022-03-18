package CollectionsPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

	int age;
	String Name;
	String Dept;

	public Employee(int age,String Name,String Dept) 
	{
       this.age=age;
       this.Name=Name;
       this.Dept=Dept;
	}

	public static void main(String[] args)

	{
		Employee e1 = new Employee(25,"Arpit","SDET");
		Employee e2 = new Employee(25,"Arpit","SDET");
		Employee e3 = new Employee(25,"Arpit","SDET");
		
		ArrayList <Employee> L = new ArrayList();
		L.add(e1);
		L.add(e2);
		L.add(e3);
		Iterator <Employee> I1=L.iterator();
		while(I1.hasNext()) {
			
			Employee E4= I1.next();
			System.out.println(E4.age);
			System.out.println(E4.Name);
			System.out.println(E4.Dept);
		}
	}

}
