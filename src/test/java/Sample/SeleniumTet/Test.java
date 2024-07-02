package Sample.SeleniumTet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	public static void main (String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://omayo.blogspot.com/");
		
		driver.get("https://www.monster.com/");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\THANVI\\Downloads\\wave.jpg");
		
	//	String projectPath = System.getProperty("user.dir");
		
	//driver.findElement(By.id("uploadfile")).sendKeys(projectPath+"//Files//wave.jpg");
		
		//Robot key
		
		
		
		WebElement button = driver.findElement(By.id("uploadfile"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click;", button);
		
		
		
	}

}
