package tek.capstone.framework.pages;

import tek.capstone.framework.base.BaseSetup;

public class POMFactory extends BaseSetup{
	
	private RetailHomePage homePage;
	private SigninPage signinPage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retailOrderPage;
	private MultipleWindowsPage multipleWinPage;
	
	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signinPage = new SigninPage();
		this.retailAccountPage = new RetailAccountPage();
		this.retailOrderPage = new RetailOrderPage();
		this.multipleWinPage = new MultipleWindowsPage();
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	public SigninPage signinPage() {
		return this.signinPage;
	}
	
	public RetailAccountPage retailAccountPage() {
		return this.retailAccountPage;
	}
	
	public RetailOrderPage retailOrderPage() {
		return this.retailOrderPage;
	}
	public MultipleWindowsPage multipleWinPage() {
		return this.multipleWinPage;
	}

	
}
