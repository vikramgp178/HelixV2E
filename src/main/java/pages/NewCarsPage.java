package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class NewCarsPage extends BasePage{

	

	public NewCarsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/section[1]/div/div/div[1]/div/ul/li[2]/a/div[2]")
	private WebElement hyundai;
	

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/section[1]/div/div/div[1]/div/ul/li[1]/a/div[2]")
	private WebElement maruti;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/section[1]/div/div/div[1]/div/ul/li[5]/a/div[2]")
	private WebElement toyota;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/section[1]/div/div/div[1]/div/ul/li[6]/a/div[2]")
	private WebElement kia;

	public MarutiCarPage selectMarutiCar() {

		maruti.click();
		
		
		return new MarutiCarPage(driver);
		
	}

	public void selectToyotaCar() {

		toyota.click();
	}

	public void selectKiaCar() {

		kia.click();
	}

	public void selectHyundaiCar() {

		hyundai.click();
	}

}
