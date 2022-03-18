package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBookTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String Title =driver.getTitle();
		System.out.println("The tile of facebook is "+Title);
		
        driver.close();
	}

}
