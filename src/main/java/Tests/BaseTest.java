package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Constants.FileConstants;

/**Purpose of this class is to have common methods across different test classes
 * 
 */
public class BaseTest {
	static ExtentReports extent;
	static ExtentTest test;
	
	@BeforeSuite
	public void configuration(){
		extent= new ExtentReports();
		ExtentSparkReporter report= new ExtentSparkReporter(FileConstants.REPORTS_FOLDER_PATH);
		extent.attachReporter(report);
		
	}
	
	@AfterSuite
	public void teardown() {
		extent.flush();
		System.out.println("After Suite Finished ");
	}
	/** This method configures and returns browser object
	 * @param browserName Eg. Chrome Safari....
	 * @return browser object
	 */
	public static WebDriver getBrowserType(String browserName) {
		
		WebDriver driver;
		String browser=browserName.toLowerCase();
		switch(browser) {
		case "chrome":
			driver=new ChromeDriver();
			System.out.println("Chrome browser is configured");
			break;
		case "safari":
			driver=new SafariDriver();
			System.out.println("Safari browser is configured");
			break;
		case "firefox":
			driver=new FirefoxDriver();
			System.out.println("Firefox browser is configured");
			break;
		case "edge":
			driver=new EdgeDriver();
			System.out.println("Edge browser is configured");
			break;
			
			default:
				driver=null;
				System.out.println("Invalid browser input provided");
				break;
					
			
		}
		return driver;
		
		
	}

}
