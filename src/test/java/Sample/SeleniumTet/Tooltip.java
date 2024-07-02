package Sample.SeleniumTet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		//capturing tooltip of the webelement
		
		driver.switchTo().frame(0);
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='age']"));
		
		String tooTip = inputbox.getAttribute("title");
		
		System.out.println("The tiltle is: "+tooTip);
		
		System.out.println("The Tooltip tile extracted successfully");
		
		String expectedToolTip = "We ask for your age only for statistical purposes.";
		
		if(expectedToolTip.equals(tooTip))
		{
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case Not Passed");
		}

	}

}
