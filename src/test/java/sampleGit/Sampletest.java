package sampleGit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sampletest {

	@Test
	public void login() throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		driver.findElement(By.name("q")).sendKeys("ABC");
		driver.findElement(By.name("go")).click();
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\eclipse-workspace\\SampleGit\\Screenshot\\bing.jpg"));
		
	
	}
}
