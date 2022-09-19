package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath="//nav/ul[@class='o-bkmzIL o-cpnuEd']//div[.='NEW CARS']")
	public WebElement newCars;
	
	@FindBy(xpath="//nav/ul[@class='o-bkmzIL o-cpnuEd']/li[1]/div[2]/div[1]/ul/a[@href='/new-cars/']/div/div[.='Find New Cars']")
	public WebElement findNewCars;
	
	
	public NewCarsPage findNewCar() {
		
		new Actions(driver).moveToElement(newCars).perform();
		findNewCars.click();
		return new NewCarsPage(driver);
	}
	

}
