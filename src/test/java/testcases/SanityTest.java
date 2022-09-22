package testcases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.UK.UK_MyCreditMonitor;
import pages.UK.UK_PrivacyGuard;
import utilities.DataUtil;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SanityTest extends BaseTest {
	
	@Epic("Epic - User Actions Login and Registration")
	@Feature("Feature -UserFlows ")
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void sanityTest(String applicationName, String url, String browserName, String username, String password,
			String runmode) {

		/*
		 * System.out.println("Browsername="+browserName+" and URL :"+url
		 * +" and username :"+username +" and password :"+password
		 * +" and runmode :"+runmode );
		 */

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (applicationName.equals("My Credit Monitor")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			System.out.println("My Credit Monitor");
			UK_MyCreditMonitor home = new UK_MyCreditMonitor(driver);
			home.LogIn_Action(username, password);
			System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			checkBrokenlinks(url);
			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("Privacy Guard UK")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			System.out.println("Privacy Guard UK");
			UK_PrivacyGuard home = new UK_PrivacyGuard(driver);
			home.LogIn_Action(username, password);
			System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("Manage my credit")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			System.out.println("Privacy Guard UK");
			UK_PrivacyGuard home = new UK_PrivacyGuard(driver);
			home.LogIn_Action(username, password);
			System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("Identity Secure")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			System.out.println("Privacy Guard UK");
			UK_PrivacyGuard home = new UK_PrivacyGuard(driver);
			home.LogIn_Action(username, password);
			System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("(Vanquis) Credit Tracker Identiy")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			System.out.println("Privacy Guard UK");
			UK_PrivacyGuard home = new UK_PrivacyGuard(driver);
			home.LogIn_Action(username, password);
			System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("My Credit Tracker")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			System.out.println("Privacy Guard UK");
			UK_PrivacyGuard home = new UK_PrivacyGuard(driver);
			home.LogIn_Action(username, password);
			System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		} else if (applicationName.equals("American Express Identity Defence")) {
			checkRunmode(runmode);
			setUp(browserName, url);
			System.out.println("Privacy Guard UK");
			UK_PrivacyGuard home = new UK_PrivacyGuard(driver);
			home.LogIn_Action(username, password);
			System.out.println("User loggin into the :" + applicationName + " with Username :" + username);
			home.openMyaccount();
			System.out.println("received form home" + home.getCurrentEmailID() + " from xls " + username);

			Assert.assertEquals(home.getCurrentEmailID(), username);
			home.LogoutFromAccount();

		}

	}

}
