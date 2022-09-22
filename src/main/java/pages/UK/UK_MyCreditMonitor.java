package pages.UK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class UK_MyCreditMonitor extends BasePage{

	
	public UK_MyCreditMonitor(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(id="UserName")
	private WebElement username;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(css="[type='submit']")
	private WebElement loginBtn;
	
	@FindBy(css="a#myaccount")
	private WebElement myAccount;
	
	
	@FindBy(css="input#emailInput")
	private WebElement currentEmailAddress;
	
	@FindBy(css="a[title='Sign out']")
	private WebElement logout;


	
	public void LogIn_Action(String uName, String pwd){
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	public void openMyaccount() {
		myAccount.click();
	}
	
	public String  getCurrentEmailID() {
		return currentEmailAddress.getAttribute("value");
	}
	
	public void LogoutFromAccount() {
		logout.click();
	}

}
