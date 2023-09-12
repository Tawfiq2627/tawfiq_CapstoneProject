package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.capstone.framework.base.BaseSetup;



public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(linkText = "Account")
	public WebElement accountLink;
	
	@FindBy(id = "nameInput")
	public WebElement nameField;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement phoneField;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement updateBttn;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMssg;
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addAPaymentMethodLink;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberField;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardField;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthField;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expireationYearField;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeField;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodSuccessMssg;
	
	@FindBy(xpath = "//div[starts-with(@class,'account__address-new-')]")
	public WebElement addAddressLink;
	
	@FindBy(id = "countryDropdown")
	public WebElement AddressCountryDropdown;
	
	@FindBy(id = "fullNameInput")
	public WebElement addressNameField;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement addressPhoneField;
	
	@FindBy(id = "streetInput")
	public WebElement addressStreetField;
	
	@FindBy(id = "apartmentInput")
	public WebElement addressApartmentNum;
	
	@FindBy(id = "cityInput")
	public WebElement addressCityField;
	
	@FindBy(name = "state")
	public WebElement addressStateDropdown;
	
	@FindBy(id = "zipCodeInput")
	public WebElement addressZipCodeField;
	
	@FindBy(id = "addressBtn")
	public WebElement addressAddBttn;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressSuccessMssg;
	
	// Edit address and removed address
	@FindBy(xpath ="(//button[text()='Edit'])[1]")
	public WebElement editAddressBttn;
	
	@FindBy(xpath = "//button[text()='Update Your Address']")
	public WebElement updateYourAddressBttn;
	
	@FindBy(xpath ="//div[text()='Address Updated Successfully']")
	public WebElement updateYourAddressMsg;
	
	@FindBy(xpath = "(//button[text()='Remove'])[2]")
	public WebElement removeAddressBttn;
	
	@FindBy(xpath ="(//div[@class='account__address-single'])[1]")
	public WebElement addressremovedIcon;
	
	// edit payment method
	@FindBy(xpath ="//button[text()='Edit']")
	public WebElement editCardBttn;
	
	// remove payment method
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removePCard;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYear;
	
	@FindBy(id ="paymentSubmitBtn")
	public WebElement addCardBttn;
	
	@FindBy(xpath ="//div[text()='Payment Method updated Successfully']")
	public WebElement paymentInfoUpdate;
	
	@FindBy(xpath = "//div[@class='account__payment-sub']")
	public WebElement selectMasterCard;
	
	
	
	
	
	
}
