package Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import utils.FileUtils;

public class LoginTest extends BaseTest{
	
@Test(enabled=false)
	public void login() throws IOException {
	WebDriver driver= BaseTest.getBrowserType("Chrome");
	
	LoginPage lp= new LoginPage(driver);
	driver.get(FileUtils.readLoginTestData("app.url"));
	lp.username.sendKeys(FileUtils.readLoginTestData("username"));
	lp.password.sendKeys(FileUtils.readLoginTestData("password"));
	lp.loginButton.click();
	driver.quit();
	
	
//	driver.get("https://login.salesforce.com");
	//driver.findElement(By.id("username")).sendKeys(FileUtils.readLoginTestData("username"));
	//driver.findElement(By.id("password")).sendKeys(FileUtils.readLoginTestData("password"));
	//driver.findElement(By.id("Login")).click();
	//driver.quit();
	
}

@Test(enabled=false)
public void checkRememberMe_TC01() throws IOException{
	WebDriver driver= BaseTest.getBrowserType("Chrome");
	LoginPage lp= new LoginPage(driver);
	driver.get(FileUtils.readLoginTestData("app.url"));
	lp.enterUsername(FileUtils.readLoginTestData("username"));
	lp.enterPassword(FileUtils.readLoginTestData("password.null"));
	lp.loginButton.click();
	AssertJUnit.assertEquals(lp.getErrorLoginText(),FileUtils.readLoginTestData("error.message"));
	driver.quit();
}
@Test(enabled=false)
public void checkRememberMe_TC02() throws IOException, InterruptedException{
	WebDriver driver= BaseTest.getBrowserType("Chrome");
	LoginPage lp= new LoginPage(driver);
	driver.get(FileUtils.readLoginTestData("app.url"));
	lp.username.sendKeys(FileUtils.readLoginTestData("username"));
	lp.password.sendKeys(FileUtils.readLoginTestData("password"));
	lp.loginButton.click();
//	driver.manage().timeouts().implicitlyWait(10);
	Thread.sleep(3000);
	driver.quit();
}

@Test(enabled=false)
public void checkRememberMe_TC03() throws IOException, InterruptedException {
	WebDriver driver= BaseTest.getBrowserType("Chrome");
	LoginPage lp= new LoginPage(driver);
	driver.get(FileUtils.readLoginTestData("app.url"));
	lp.enterUsername(FileUtils.readLoginTestData("username"));
	lp.enterPassword(FileUtils.readLoginTestData("password"));
	lp.selectRememberMeCheckbox();
	lp.clickLoginButton();
	lp.userMenuDropdown();
	lp.logoutButton();
	Thread.sleep(3000);
	Assert.assertEquals(lp.isLoginPageOpened(driver),FileUtils.readLoginTestData("loginPage.title"));
	driver.quit();
}

@Test(enabled=false)
public void validateLoginError_TC04A() throws IOException {
	WebDriver driver= BaseTest.getBrowserType("Chrome");
	LoginPage lp= new LoginPage(driver);
	driver.get(FileUtils.readLoginTestData("app.url"));
	lp.forgotPassword();
	Assert.assertEquals(lp.isForgotPasswordPageOpened(driver),FileUtils.readLoginTestData("forgotPasswordPage.title"));
	lp.resetPasswordUsername(FileUtils.readLoginTestData("username"));
	
	lp.continueButton();
	driver.quit();
}

@Test(enabled=false)
public void validateLoginError_TC04B() throws IOException {
	WebDriver driver= BaseTest.getBrowserType("Chrome");
	LoginPage lp= new LoginPage(driver);
	driver.get(FileUtils.readLoginTestData("app.url"));
	Assert.assertEquals(lp.isLoginPageOpened(driver),FileUtils.readLoginTestData("loginPage.title"));
	lp.enterUsername(FileUtils.readLoginTestData("invalid.username"));
	lp.enterPassword(FileUtils.readLoginTestData("invalid.password"));
//	Assert.assertEquals(lp.getUsername(), FileUtils.readLoginTestData("invalid.username"));
//	Assert.assertNotNull(lp.getPassword());
	lp.selectRememberMeCheckbox();
	lp.clickLoginButton();
	Assert.assertEquals(lp.getErrorLoginText(),FileUtils.readLoginTestData("invalid.login.errorText"));
}
}