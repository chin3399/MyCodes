package SeleniumPractise.SeleniumPractise;

public class ThrowsUse {
	
	public static void  R() throws Exception 
	{
		System.out.println("Inside the method ");
		int R=10/0;
	
	}

	public static void main(String[] args) 
	{
		{
			
			try {
				R();
			} catch (Exception e) {
				System.out.println("Inside the cach Block ");
				e.printStackTrace();
			}
		}

	}

	}


