package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.SeleniumUtility;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class POMPractice {
	public static void main(String[] args) throws InterruptedException {
		//FaceBook login where we get stale exception
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.facebook.com");
//		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
//		email.sendKeys("Varshitha@gmail.com");
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
//		email1.sendKeys("Varshitha@gmail.com");
		
		//FaceBook login using SeleniumUtility class 
//		SeleniumUtility sUtil = new SeleniumUtility();
//		WebDriver driver = new ChromeDriver();
//		String url = "https://www.facebook.com/";
//		
//		sUtil.maximizeWindow(driver);
//		sUtil.implicitWait(driver, 10);
//		sUtil.accessApplication(driver,url);
//		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
//		email.sendKeys("Varshitha@gmail.com");
//		driver.navigate().refresh();
//		WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
//		email1.sendKeys("Varshitha@gmail.com");
//		driver.quit();
		
		//Login to VTIGER application and perform actions
		SeleniumUtility sUtil = new SeleniumUtility();
		WebDriver driver = new ChromeDriver();
		String url = "http://localhost:8888/";
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 10);
		sUtil.accessApplication(driver, url);
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication("admin", "admin");
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
//		hp.operations();
		hp.clickOnLeadsMenu();
		Thread.sleep(2000);
		hp.clickOnOrganizationMenu();
		Thread.sleep(2000);
		hp.SignOutOperation(driver);
		Thread.sleep(2000);
		sUtil.closeBrowser(driver);

	}
}
