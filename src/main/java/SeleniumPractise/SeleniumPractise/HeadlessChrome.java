package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) 
	
	{
		 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
      
		ChromeOptions options = new ChromeOptions();
	      //  options.setHeadless(true);
		 options.addArguments("--headless");

		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		
		String Title =driver.getTitle();
		System.out.println("The tile of facebook is "+Title);
		

	}

}
