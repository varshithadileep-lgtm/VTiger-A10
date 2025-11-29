package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="user_name")
	private WebElement usernametextField;
	@FindBy(name="user_password")
	private WebElement passwordtextField;
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernametextField() {
		return usernametextField;
	}

	public WebElement getPasswordtextField() {
		return passwordtextField;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginToApplication(String UN, String PWD)
	{
		getUsernametextField().sendKeys(UN);
		getPasswordtextField().sendKeys(PWD);
		getLoginBtn().click();
	}
}
