package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

	}

}
