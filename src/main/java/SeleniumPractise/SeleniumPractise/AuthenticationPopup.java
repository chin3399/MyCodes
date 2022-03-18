package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) 
	
	{
		// TODO Handling Authentication POPUP using WebDriver 
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");  //Id password is been provided in the link only 
		driver.manage().window().maximize();
	

	}

}
