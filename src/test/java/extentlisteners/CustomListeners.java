package extentlisteners;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import io.qameta.allure.Allure;

public class CustomListeners implements ITestListener{
	
	public InputStream ins;
//	static String fileName = "V2E_Test_Report_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";

	/*private static ExtentReports extent = ExtentManager
			.createInstance(System.getProperty("user.dir") + "\\target\\reports\\" + fileName);*/
	
	
	public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	
		try {
			ins = new FileInputStream("C:\\Users\\VikramPhatangare\\Downloads\\20220822_220656.jpg");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Allure.attachment("Screenshot", ins); 		
    }		

    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

}
