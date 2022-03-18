package SeleniumPractise.SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) 
	
	{
		// TODO Conditional Commands 
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
        if(email.isDisplayed() && email.isEnabled() ==true)
        {
        	
        	email.sendKeys("anoushka.oberoi001@gmail.com");
        }
        
        else 
        {
        	System.out.println("user Name not found");
        	
        	
        }	
	
	    if(password.isDisplayed() && password.isEnabled()==true)
	    {
	    	password.sendKeys("akk20864");
	    	
	    }
	
	    else 
        {
        	System.out.println("Password Field not found");
        	
        	
        }	
	
	    driver.navigate().to("https://www.ironspider.ca/forms/checkradio.htm");
	    System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[1]/form/input[1]")).isSelected());
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[1]/form/input[1]")).click();
	    System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/blockquote[1]/form/input[1]")).isSelected());
	    
	    driver.close();
	
	}  
	
	
	

}
