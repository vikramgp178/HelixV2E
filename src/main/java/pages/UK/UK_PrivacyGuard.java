package pages.UK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class UK_PrivacyGuard extends BasePage{

	
	public UK_PrivacyGuard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(css="input[alt='Login to PrivacyGuard']")
	private WebElement loginBtn;
	
	@FindBy(css="li#editProfile > a[title='View My Profile']")
	private WebElement myAccount;
	
	
	@FindBy(css="fieldset:nth-of-type(2) > div:nth-of-type(1) > .user-info > strong")
	private WebElement currentEmailAddress;

	@FindBy(css="img[alt='Log out of PrivacyGuard']")
	private WebElement logout;

	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
	private WebElement googleSearchbtn;
	
	
	public void LogIn_Action(String uName, String pwd){
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	public void openMyaccount() {
		myAccount.click();
	}
	
	public void ClickGooglebtn() {
		//myAccount.click();
		googleSearchbtn.click();
	}
	
	public String  getCurrentEmailID() {
		return currentEmailAddress.getText();
	}
	
	public void LogoutFromAccount() {
		logout.click();
	}
	

}
