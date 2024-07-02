package Sample.SeleniumTet;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monster.com/");
		driver.manage().window().maximize();
		
		//Full Screenshot
		
//		TakesScreenshot js = (TakesScreenshot) driver;
//		File src = js.getScreenshotAs(OutputType.FILE);
//		File trg = new File(".\\Screenshots\\Test.png");
//		FileUtils.copyFile(src, trg);
		
		//Partial/Section of a screenshot
		
//		WebElement section = driver.findElement(By.xpath("//div[@class='sc-laNGHT kYygui']"));
//		File src = section.getScreenshotAs(OutputType.FILE);
//		File trg = new File(".\\Screenshots\\portion.png");
//		FileUtils.copyFile(src, trg);
		
		//Capture specific element screenshot
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Sign up']"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\webelement.png");
		FileUtils.copyFile(src, trg);
	}

}
