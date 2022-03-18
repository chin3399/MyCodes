package SeleniumPractise.SeleniumPractise;



/* difference between Throws and catch is that in case of Try catch the exception will be hit in the 
 * try block and will be handled in the catch block 
 * but in case of throws the exception will be hit in the menthod body but it will be handled 
 * in the calling function();*/

/* Throwable is the super class in exception and error and we cannot handle error in Java (out of memory or stack over flow*/

public class ExceptionHandling {

	public static void main(String[] args) 
	
	{
		
		try {
			
			System.out.println("Exception Handling. I am inside try block");
			int i = 10/0;
		}

	  catch(Exception e ) 
		{
		  
		  System.out.println("I am inside the cach block");
		  e.printStackTrace();
	    }
			
		
	
	}

}
