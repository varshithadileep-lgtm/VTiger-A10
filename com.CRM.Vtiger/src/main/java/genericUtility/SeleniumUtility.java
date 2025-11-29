package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility {

	public void accessApplication(WebDriver driver,String url)
	{
		driver.get(url);
	}
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void implicitWait(WebDriver driver, int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	public void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
///////////////////////****************Handling DropDown******************/////////////////////////
	public void selectoptionByIndex(WebElement dropdownEle, int index)
	{
		Select sel = new Select(dropdownEle);
		sel.selectByIndex(index);
	}
	public void selectoptionByValue(WebElement dropdownEle, String value)
	{
		Select sel = new Select(dropdownEle);
		sel.selectByValue(value);
	}
	public void sleectoptionByVisibleText(WebElement dropdownEle, String visibleText)
	{
		Select sel = new Select(dropdownEle);
		sel.selectByVisibleText(visibleText);
	}
///////////////////////////**************Mouse Actions********************///////////////////////////
	public void mouseHovering(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void rightClickOperation(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	public void doubleClickOperation(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element);
	}
/////////////////////************Handling Alert Popup*******************////////////////////////////
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void dismissAler(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
//////////////////******************Handling Frames******************///////////////////////////////
	public void switchToFrameUsingFrameIndex(WebDriver driver, int frameIndex)
	{
		driver.switchTo().frame(frameIndex);
	}
////////////////////*******************Taking web screenshot****************///////////////////////
	public String getWebpageScreenshot(WebDriver driver, String screenshotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenShot\\"+screenshotName+".png");
		Files.copy(scr, dest);
		return dest.getAbsolutePath();
	}
}

