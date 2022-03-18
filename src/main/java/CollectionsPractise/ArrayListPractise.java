package CollectionsPractise;

import java.util.ArrayList;

public class ArrayListPractise {

	public static void main(String[] args) 
	
	{
		ArrayList ar = new ArrayList();
		ar.add(10);                                 //Yellow line because of generics we have not defined what type of data we are storing in this list
		ar.add(20);                                 
		ar.add(30);
		ar.add("Arpit");
		ar.add('a');
		int s=ar.size();
		for(int i=0;i<s;i++)
		{
			
			System.out.println(ar.get(i));
		
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();    //now it will only allow integer values using <> generics 
		ar1.add(10);
	}

}
