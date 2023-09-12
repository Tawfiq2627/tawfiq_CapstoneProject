package tek.capstone.framework.steps;

import org.junit.Assert; 

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class SigninSteps extends CommonUtility{
	
	POMFactory pomFactory = new POMFactory();
	
	@Given("User is on retail website homepage")
	public void userIsOnRetailWebsiteHomepage() {
		Assert.assertTrue(pomFactory.homePage().tekschoolLogo.isDisplayed());
		logger.info("TEKSCHOOL logo is displayed");
	}
	
	@When("User click on the login link")
	public void userClickOnTheLoginLink() {
		click(pomFactory.signinPage().signInLink);
		logger.info("Login Link was clicked successfully");
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(pomFactory.signinPage().emailField, email);
		sendText(pomFactory.signinPage().passwordField, password);
		logger.info("Email and Password were entered successfully");
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(pomFactory.signinPage().loginBttn);
		logger.info("Login button was clicked successfully");
	}
	@Then("Verify user is logged in")
	public void verifyUserIsLoggedIn() {
		Assert.assertTrue(pomFactory.signinPage().logoutBttn.isDisplayed());
		logger.info("User is logged in successfully");
	}
	
	//register
	@When("User click on create new account link")
	public void userClickOnCreateNewAccountLink() {
		click(pomFactory.signinPage().newAccountBttn);
		logger.info("Create new account bttn clicked successfully");
	}
	@When("User enter {string} and {string} and {string} and {string}")
	public void userEnterAndAndAnd(String name, String email, String password, String confPassword) {
		sendText(pomFactory.signinPage().nameInputField, name);
		sendText(pomFactory.signinPage().emailInputField, email);
		sendText(pomFactory.signinPage().passwordInputField, password);
		sendText(pomFactory.signinPage().confirmPassInputField, confPassword);
		logger.info("User information was entered successfully");
	}
	@When("User click on singup button")
	public void userClickOnSingupButton() {
		click(pomFactory.signinPage().signupBttn);
		logger.info("Signup button was clicked sucessfully");
	}
	@Then("Verify user account is created")
	public void verifyUserAccountIsCreated() {
		Assert.assertTrue(pomFactory.signinPage().yourProfileText.isDisplayed());
		logger.info("User account is created successfully");
	}

}
