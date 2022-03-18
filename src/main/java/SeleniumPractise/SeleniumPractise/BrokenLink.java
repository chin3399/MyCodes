package SeleniumPractise.SeleniumPractise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	private static final URLConnection URLConnection = null;

	public static void main(String[] args) throws IOException

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * Steps for Broken Link 1. Find all the links in the page using Anchor tag 2.
		 * Store the Links in the List 3. Calculate the size of the list 4. run for Loop
		 * 5. Inside Loop create a object of URL class 6. Create a object of
		 * HttpConnection Class and pass the URL object in it 7. Create connection with
		 * all the links 8. Give condition if the response code is > 400 the broken link
		 * 9. Else the link is not broken
		 */

		List<WebElement> Link = driver.findElements(By.tagName("a"));

		System.out.println(Link.size());

		for (int i = 0; i < Link.size(); i++) 
		{
            //Get href attribute of the link 
			 WebElement element =Link.get(i);
			 String EachLink= element.getAttribute("href");
			 URL url = new URL(EachLink);
			 
			 //Creating connection using HttpConnection
			 
			HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
			
			httpcon.connect();
			int Response = httpcon.getResponseCode();
			if(Response>400) 
			{
				
				System.out.println(url   +"-"+ "is the broken url");
			}
			
			else
			{
				
				System.out.println(url   +"-"+ "It is working");
			}
			
			
			
			
			 
			
			 
		}

	}

}
