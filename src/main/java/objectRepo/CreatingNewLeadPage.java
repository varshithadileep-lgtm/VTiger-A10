package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage {

	@FindBy(name="firstname")
	private WebElement firstNameTextField;
	@FindBy(name="lastname")
	private WebElement lastNametextField;
	@FindBy(name="company")
	private WebElement companyTextField;
	@FindBy(name="designation")
	private WebElement titleTextField;
	@FindBy(name="leadsource")
	private WebElement leadsSourceDropdown;
	@FindBy(name="mobile")
	private WebElement mobileTextField;
	@FindBy(name="noofemployees")
	private WebElement noofemployeesTextField;
	@FindBy(name="city")
	private WebElement cityTextField;
	@FindBy(name="state")
	private WebElement stateTextField;
	@FindBy(name="country")
	private WebElement countryTextField;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNametextField() {
		return lastNametextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getLeadsSourceDropdown() {
		return leadsSourceDropdown;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getNoofemployeesTextField() {
		return noofemployeesTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
