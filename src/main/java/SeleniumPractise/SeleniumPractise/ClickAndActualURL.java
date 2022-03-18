package SeleniumPractise.SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndActualURL {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/search?q=simpli5d&hl=en&sxsrf=APq-WBuoen76ujFUwv1LppcuGjM4se7SOA%3A1647181832794&ei=CAAuYpiPMMSU4-EPgZiFgAU&oq=&gs_lcp=Cgdnd3Mtd2l6EAEYATIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJ0oECEEYAEoECEYYAFAAWABg-BVoAXABeACAAQCIAQCSAQCYAQCgAQGwAQrAAQE&sclient=gws-wiz");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int i=1;//Click on first Link 
		WebElement W1 = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div["+i+"]/div/div[1]/div/a/h3"));
		WebElement W2 = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/div/div[1]/div/a/h3"));
		String FirstLink= W2.getAttribute("href");
		System.out.println("FirstURL"+FirstLink);
		W1.click();
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("CurrentURL"+CurrentURL);
		driver.close();

	
	
	
	
	
	
	
	
	
	
	
	}

}
