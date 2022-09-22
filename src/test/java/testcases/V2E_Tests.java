package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UK.UK_PrivacyGuard;
import utilities.DataUtil;

public class V2E_Tests extends BaseTest{
	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void sampleTest(String url,String browsername) {
		System.out.println("browser :"+browsername+" and url is: "+url);
		setUp(browsername,url);
		UK_PrivacyGuard home= new UK_PrivacyGuard(driver);
		home.ClickGooglebtn();
		Assert.assertEquals(1, 0);
	}

}
