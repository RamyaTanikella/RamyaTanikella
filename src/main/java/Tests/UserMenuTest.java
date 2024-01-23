package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Constants.FileConstants;
import Constants.WaitConstants;
import Pages.LoginPage;
import Pages.UserMenuPage;
import utils.CommonUtils;
import utils.FileUtils;


public class UserMenuTest extends BaseTest{
	
	
	

	private WebDriver driver;
	
	@BeforeMethod
	public void precondition() throws IOException {
	//	WebDriver driver;
		driver=BaseTest.getBrowserType("chrome");
		LoginPage lp= new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(WaitConstants.IMPLICIT_WAIT_TIME);
		lp.loginToPage(driver); 
			
	}
	
	@AfterMethod
	public void teardownclose() throws IOException {
	driver.close();
		
	}
	
	@Test(enabled=false)
	public void selectMyProfile_TC06() throws IOException, InterruptedException {
	
		UserMenuPage ump= new UserMenuPage(driver);
		Thread.sleep(5000);
		ump.selectUserMenu();
		Assert.assertTrue(ump.verifyUserMenuItems(), "Failed to verifyUserMenu items");
		Assert.assertTrue(ump.selectUserMenuOption(driver,"My Profile"),"");
	//	ump.selectUserMenuOption(driver,"My Profile");
		CommonUtils.waitForElement(driver, ump.profilePage);
		Assert.assertTrue(ump.isMyProfilePageDisplayed(), "Failed to load My Profile page");
		ump.selectEditContact(driver);
		Assert.assertTrue(ump.verifyEditContactIframe(driver), "failed toverify profile iframe");
		Assert.assertTrue(ump.verifyLastNameChangeInAboutTab(driver,FileUtils.readUserMenuTestData("user.newLastname")));
		Assert.assertTrue(ump.verifyCreatePost(driver,FileUtils.readUserMenuTestData("post.message")));
		Assert.assertTrue(ump.verifyFileUpload(driver,FileConstants.TEST_FILE_PATH));
		Assert.assertTrue(ump.verifyPhotoUpload(driver, FileConstants.PHOTO_FILE_PATH));
	}
	 
	@Test
	public void selectMySettings_TC07() throws IOException, InterruptedException {
		System.out.println("Test method");
		UserMenuPage ump=new UserMenuPage(driver);
		ump.selectUserMenu();
		Assert.assertTrue(ump.verifyUserMenuItems(), "Failed to verifyUserMenu items");
		Assert.assertTrue(ump.selectUserMenuOption(driver,"My Settings"),"");
		System.out.println(CommonUtils.getScreenshot(driver));
	}
		
}
