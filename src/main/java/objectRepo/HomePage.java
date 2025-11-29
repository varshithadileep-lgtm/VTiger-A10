package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {
	@FindBy(xpath="//td[@class='tabSelected']/following-sibling::td[@class='small']//a[text()='Leads']")
	private WebElement leadsMenu;
	@FindBy(xpath="//td[@class='tabSelected']/following-sibling::td[@class='small']//a[text()='Organizations']")
	private WebElement organizationMenu;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutOption;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getOrganizationMenu() {
		return organizationMenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	public void clickOnOrganizationMenu()
	{
		getOrganizationMenu().click();
	}
	public void SignOutOperation(WebDriver driver)
	{
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.mouseHovering(driver, getAccountsIcon());
		getSignoutOption().click();
	}
}
