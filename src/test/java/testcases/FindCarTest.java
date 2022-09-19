package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.HomePage;
import utilities.DataUtil;

public class FindCarTest extends BaseTest {

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void findCarTest(String brandName, String browserName, String runmode) {

		if (runmode.equals("N")) {

			throw new SkipException("Skipping the test as the run mode is NO");
		}

		setUp(browserName);
		if (brandName.equals("Hyundai")) {

			HomePage home = new HomePage(driver);
			home.findNewCar().selectHyundaiCar();
			System.out.println(BasePage.car.getCarTitle());

		} else if (brandName.equals("Kia")) {

			HomePage home = new HomePage(driver);
			home.findNewCar().selectKiaCar();
			System.out.println(BasePage.car.getCarTitle());
		} else if (brandName.equals("Toyota")) {

			HomePage home = new HomePage(driver);
			home.findNewCar().selectToyotaCar();
			System.out.println(BasePage.car.getCarTitle());
		
		
		} else if (brandName.equals("Maruti")) {

		
			HomePage home = new HomePage(driver);
			home.findNewCar().selectMarutiCar();
			System.out.println(BasePage.car.getCarTitle());
		
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
