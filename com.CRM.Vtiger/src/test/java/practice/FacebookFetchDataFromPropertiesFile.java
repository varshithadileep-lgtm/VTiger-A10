package practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtilityFB;

public class FacebookFetchDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		PropertiesUtilityFB pu = new PropertiesUtilityFB();
		String url = pu.GetDataFromProperties("url");
		String mailid = pu.GetDataFromProperties("mailid");
		String phno = pu.GetDataFromProperties("phno");
		String password = pu.GetDataFromProperties("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(mailid);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).submit();
	}
}

