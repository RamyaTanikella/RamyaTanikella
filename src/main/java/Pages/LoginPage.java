package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.FileUtils;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(name="Login")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[@id='rememberUn']")
	public WebElement rememberMe;
	
	@FindBy(id="error")
	public WebElement errorMessage;
	
	@FindBy(id="forgot_password_link")
	public WebElement forgotYourPassword;
	
	@FindBy(id="idcard-identity")
	public WebElement savedUsername;
	
	@FindBy(id="un")
	public WebElement forgotUsername;
	
	@FindBy(name="un")
	public WebElement resetPasswordUsername;
	
	@FindBy(id="continue")
	public WebElement continueButton;
	
	@FindBy(id="userNav")
	public WebElement userMenuDropdown;
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[5]")
	public WebElement logoutButton;
	
	public void enterUsername(String emailID) {
		if(username.isDisplayed()) {
			username.sendKeys(emailID);
		}
		else {
			System.out.println("user element not found");
				
			}
		}
	
	public void enterPassword(String pass) {
		if(password.isDisplayed()) {
			password.sendKeys(pass);
		}
		else {
			System.out.println("Password element not found");
				
			}
		}
	
	public void clickLoginButton() {
		if(loginButton.isDisplayed()) {
			loginButton.click();
		}
		else {
			System.out.println("login element not found");
				
			}
		}
	
	public void forgotPassword() {
		if(forgotYourPassword.isDisplayed())
			forgotYourPassword.click();
		else
			System.out.println("Forgot Password Element not found");
	}
	
	public void resetPasswordUsername(String emailID) {
		if(resetPasswordUsername.isDisplayed()) {
			resetPasswordUsername.sendKeys(emailID);
		}
	}
	public void continueButton() {
		if(continueButton.isDisplayed()) {
			continueButton.click();
		}
		else {
			System.out.println("Continue element not found");
				
			}
		}
	
	public void selectRememberMeCheckbox() {
		if(!rememberMe.isSelected()) {
			rememberMe.click();
		}
	}
	
public void userMenuDropdown() {
	if(userMenuDropdown.isDisplayed()) {
		userMenuDropdown.click();
	}
	else {
		System.out.println("UserMenu is Not available");
			
		}
}
public void logoutButton() {
	//WebElement logoutButton = null;
	if(!logoutButton.isSelected()) {
		logoutButton.click();
	}
	else {
		System.out.println("Logout is Not available");
			
		}
}
	
	public String isLoginPageOpened(WebDriver driver) {
		return driver.getTitle();
		
	}
	
	public String isForgotPasswordPageOpened(WebDriver driver) {
		return driver.getTitle();
		
	}
	
	public String getErrorLoginText() {
		if(errorMessage.isDisplayed())
		{
		return errorMessage.getText();
	}
		else
			return null;
	}
	
	public String getUsername() {
		return username.getText();
		
	}
	public String getPassword() {
		return password.getText();
	}


	
	public void loginToPage(WebDriver driver) throws IOException {
		driver.get(FileUtils.readLoginTestData("app.url"));
		driver.manage().window().maximize();
		if(CommonUtils.waitForElement(driver,username)) {
		username.sendKeys(FileUtils.readLoginTestData("username"));
		password.sendKeys(FileUtils.readLoginTestData("password"));
		loginButton.click();
	}else
		System.out.println("Page failed to load");
	}
	}
	

