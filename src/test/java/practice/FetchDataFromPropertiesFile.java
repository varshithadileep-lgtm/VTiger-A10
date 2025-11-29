package practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		PropertiesUtility pu = new PropertiesUtility();
		String url = pu.getDataFromProperties("url");
		String username = pu.getDataFromProperties("username");
		String password = pu.getDataFromProperties("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class=' _aswp _aswr _aswu _asw_ _asx2']")).submit();
		driver.quit();

	}

}
