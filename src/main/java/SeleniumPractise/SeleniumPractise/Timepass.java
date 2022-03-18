package SeleniumPractise.SeleniumPractise;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timepass 
{

	public static void main(String[] args) 
	
	{
		// TODO Handling Browser Window
       System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		String Parent=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		
		
		Set <String> S=driver.getWindowHandles();
		Iterator <String> I1 = S.iterator();
		while(I1.hasNext())
		{
			String ChildWindow = I1.next();
			if(!Parent.equals(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
				System.out.println(driver.switchTo().window(ChildWindow).getTitle());
				driver.close();
			}
		
		}
		driver.switchTo().window(Parent);

		
	}
}