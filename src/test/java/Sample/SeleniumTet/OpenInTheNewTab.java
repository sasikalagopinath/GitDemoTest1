package Sample.SeleniumTet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenInTheNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demo.nopcommerce.com/");
				driver.manage().window().maximize();
		
		//Keyboard keys
				//Open the link in new tab
				
				String tab = Keys.chord(Keys.CONTROL, Keys.RETURN);
				
				driver.findElement(By.linkText("Register")).sendKeys(tab);
				
	}

}
