package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.FileUtils;

public class UserMenuPage {

	public UserMenuPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userNavLabel")
	public WebElement userMenu;
	
	public void userMenu() {
		if(userMenu.isDisplayed()) {
			userMenu.click();
		}
		else {
			System.out.println("UserMenu is Not available");
				
			}
	}
	@FindBy(xpath="//div[@id='userNav-menuItems']/a")
	public List<WebElement> userMenuOptions;

	@FindBy(xpath="//a[@title='My Profile']")
	public WebElement MyProfile;
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[2]")
	public WebElement MySettings;
		
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[3]")
	public WebElement DeveloperConsole;
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[4]")
	public WebElement SwitchToLightningExperience;
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[5]")
	public WebElement Logout;
	
	//My Profile
	
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']")
	public WebElement EditContactButton;
	
	@FindBy(xpath="//div/h2[@id='contactInfoTitle']")
	public WebElement EditProfilePopupWindow;
	
	@FindBy(id="aboutTab")
	public WebElement AboutTab;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement AboutTabLastName;
	
	@FindBy(xpath="//*[@value='Save All']")
	public WebElement SaveAllButton;
	
	@FindBy(xpath="//*[@id=\"tailBreadcrumbNode\"]")
	public WebElement userProfilePageNameDisplay;
	 
	
	//PostLink
	
	@FindBy(css="#publisherAttachTextPost")
	public WebElement postLink;
	
	@FindBy(xpath="/html/body")
	public WebElement postTextArea;
	
	@FindBy(xpath="//input[@id='publishersharebutton']")
	public WebElement shareButton;
	
	//File Link
	
	@FindBy(xpath="//*[@id='publisherAttachContentPost']")
	public WebElement fileLink;
	
	@FindBy(xpath="//a[@id='publisherAttachContentPost']/span[1]")
	public WebElement contentPost;
	
	@FindBy(css="#chatterUploadFileAction")
	public WebElement UploadFile;
	
	@FindBy(css="#chatterFile")
	public WebElement FileOpen;
	
	@FindBy(css="#publishershareButton")
	public WebElement Publish;
	
	@FindBy(xpath="//input[@value='Cancel Upload']")
	public WebElement cancelUpload;
	
	@FindBy(id="uploadLink")
	public WebElement updateButton;
	
	//Photo Link
	
	@FindBy(xpath="//*[@id=\"publisherAttachLinkPost\"]/span[1]")
	public WebElement photoLink;
	
	@FindBy(id="j_id0:uploadFileForm:uploadInputFile")
	public WebElement uploadPhoto;
	
	@FindBy(name="j_id0:uploadFileForm:uploadBtn")
	public WebElement uploadButton;
	
	@FindBy(id="publishersharebutton")
	public WebElement photosharebutton;
	
	@FindBy(id="uploadPhotoContentId")
	public WebElement photoUploadIFrame;
	
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadBtn']")
	public WebElement photoSaveButton;
	
	@FindBy(xpath="//input[@id='j_id0:j_id7:save']")
	public WebElement photoSaveButton2;
	
	//My Settings
	//Personal Link
	
	@FindBy(xpath="//*[@id=\'PersonalInfo_font\']")
	public WebElement personalLink;
	
	@FindBy(xpath="//*[@id=\'LoginHistory_font\']")
	public WebElement loginHistoryLink;
	
	@FindBy(xpath="//*[@id=\'RelatedUserLoginHistoryLink_body\']/div/a")
	public WebElement loginDisplay;
	
	@FindBy(id="contactInfoContentId")
	public WebElement iframeAboutTab;
	
	//Display&LayoutLink
	
	@FindBy(xpath="//*[@id=\'DisplayAndLayout_font\']")
	public WebElement DisplayLayoutLink;
	
	@FindBy(id="CustomizeTabs_font")
	public WebElement CustomizedTabs;
	
	@FindBy(xpath="//*[@id=\'p4\']/option[9]")
	public WebElement customApp;
	
	@FindBy(xpath="//*[@id=\'duel_select_0\']/option[73]")
	public WebElement AvailableTab;
	
	@FindBy(xpath="//*[@id=\'duel_select_0_right\']/img")
	public WebElement Add;
	
	@FindBy(xpath="//*[@id=\'bottomButtonRow\']/input[1]")
	public WebElement save;
	
	@FindBy(id="tabBar")
	public WebElement tabList;
	
	//Email Link
	
	@FindBy(xpath="//*[@id=\'EmailSetup_font\']")
	public WebElement EmailLink;
	
	@FindBy(id="EmailSettings_font")
	public WebElement MyEmailSettings;
	
	@FindBy(id="sender_name")
	public WebElement Emailname;
	
	@FindBy(xpath="//*[@id=\'sender_email\']")
	public WebElement EmailAddress;
	
	@FindBy(xpath="//*[@id=\'useremailSection\']/table/tbody/tr[7]/td[2]/")
	public WebElement BCCRadioButton;
	
	@FindBy(xpath="//*[@id=\'bottomButtonRow\']/input[1]")
	public WebElement Saveonemail;
	
	//Calendar and Remainder
	
	@FindBy(id="CalendarAndReminders_font")
	public WebElement CalendarAndReminders;
	
	@FindBy(xpath="//*[@id=\'Reminders_font\']")
	public WebElement ActivityReminders;
	
	@FindBy(id="testbtn")
	public WebElement OpenaTestRemainder;
	
	@FindBy(xpath="//*[@id=\'summary\']")
	public WebElement SampleEventPopup;
	
	@FindBy(css="#displayBadge")
	public WebElement moderatorButton;
	
	@FindBy(id="profileTab_sfdc.ProfilePlatformFeed")
	public WebElement profilePage;
	
		public boolean isMyProfilePageDisplayed() {
			return profilePage.isDisplayed();
			
		}
	
	@FindBy(id="contactTab")
	public WebElement contactTab;
	
	@FindBy(xpath="//div[@class='cxfeeditem feeditem'][1]//p")
	public WebElement firstPostText;
	
	@FindBy(xpath="//*[@class='contentFileTitle'][1]")
	public WebElement verifyFilePostElement;
	
	@FindBy(name="j_id0:waitingForm")
	public WebElement spinnerIcon;
	
	@FindBy(id="cropWaitingPage:croppingForm")
	public WebElement spinnerWhileCropping;
	
	@FindBy(id="progressIcon")
	public WebElement fileUploadSpinner;
	
	
	public boolean verifyUserMenuItems() throws IOException{
		boolean isAllOptionsVerified=true;
		String[] expectedUserMenuItems= FileUtils.readUserMenuTestData("userMenu.items").split(",");
		for(int i=0;i<expectedUserMenuItems.length;i++) {
			String actualOption=userMenuOptions.get(i).getText();
			if(actualOption.equals(expectedUserMenuItems[i])) {
				System.out.println("UserMenuPage: VerifyUserMenuItems:Expected option: "+expectedUserMenuItems[i]+"ActualOption: "+actualOption);
				
			}
			else {
				System.out.println("UserMenuPage: VerifyUserMenuItems:Expected option: "+expectedUserMenuItems[i]+"ActualOption: "+actualOption);
				isAllOptionsVerified=false;
			}
		}
		return isAllOptionsVerified;
	}
	
	
	public boolean selectUserMenuOption(WebDriver driver, String option) {
		boolean isOptionSelected=false;
	
	//	if(userMenu.isDisplayed()) {
		//	userMenu.click();
		//}
		WebElement userMenuOption = driver.findElement(By.xpath("//*[text()='"+option+"']"));
		if(CommonUtils.waitForElement(driver,userMenuOption)) {
		userMenuOption.click();
		isOptionSelected=true;
		}
		return isOptionSelected;
	
	}
	
	public void selectUserMenu() {
		if(userMenu.isDisplayed()) {
			userMenu.click();
		}
	}
	
	public void selectEditContact(WebDriver driver) {
		if(CommonUtils.waitForElement(driver, EditContactButton)) {
			EditContactButton.click();
		}
	}

	
	public boolean verifyEditContactIframe(WebDriver driver) {
		boolean isIframeLoaded=false;
	
	//	if(userMenu.isDisplayed()) {
		//	userMenu.click();
		//}
	//	WebElement userMenuOption = driver.findElement(By.xpath("//*[text()='"+option+"']"));
		if(CommonUtils.waitForElement(driver,iframeAboutTab)) {
		driver.switchTo().frame(iframeAboutTab);
		if(AboutTab.isDisplayed() && contactTab.isDisplayed()) {
		isIframeLoaded=true;
		}
		}
		return isIframeLoaded;
	}
	
	public boolean verifyLastNameChangeInAboutTab(WebDriver driver,String lastname) {
		boolean isLastNameChanged=false;
		if(AboutTab.isDisplayed()) {
			AboutTab.click();
			AboutTabLastName.clear();
			AboutTabLastName.sendKeys(lastname);
			SaveAllButton.click();
			driver.switchTo().parentFrame();
			if(userProfilePageNameDisplay.isDisplayed()) {
				String actualName=userProfilePageNameDisplay.getText();
				if(actualName.contains(lastname)) {
					isLastNameChanged=true;
				}else {
					System.out.println("Lastname failed to change");
				}
			}
		}
		
		return isLastNameChanged;
	}
	
	
	public boolean verifyCreatePost(WebDriver driver,String message) {
		boolean isPostCreated=false;
		if(postLink.isDisplayed()) {
			postLink.click();
			driver.switchTo().frame(0);
			postTextArea.sendKeys(message);
			driver.switchTo().defaultContent();
			if(shareButton.isDisplayed()) {
				shareButton.click();
				isPostCreated=true;
			}
		}	
		return isPostCreated;
	}
	
	public boolean verifyFileUpload(WebDriver driver,String filepath) {
		boolean isFileUploadSuccess=false;
		if(fileLink.isDisplayed()) {
			fileLink.click();
			if(CommonUtils.waitForElement(driver, UploadFile)) {
				UploadFile.click();
				}
			if(CommonUtils.waitForElement(driver, FileOpen)) {
				FileOpen.sendKeys(filepath);
				shareButton.click();
			if(CommonUtils.waitForElementToDisappear(driver, cancelUpload))		{
				if(verifyFilePostElement.isDisplayed()) {
					isFileUploadSuccess=true;
				}
			}
			}
		}
		
		return isFileUploadSuccess;
	}
	
	
	private void clickOnUpdatePhotoButton(WebDriver driver) {
		CommonUtils.mouseHover(driver, moderatorButton);
		if(updateButton.isDisplayed()) {
			updateButton.click();
		}
		
	}
	public boolean verifyPhotoUpload(WebDriver driver, String photoFilePath) {
		boolean isPhotoUploaded=false;
	this.clickOnUpdatePhotoButton(driver);
		driver.switchTo().frame(photoUploadIFrame);
		if(CommonUtils.waitForElement(driver, uploadPhoto)) {
			uploadPhoto.sendKeys(photoFilePath);
			photoSaveButton.click();
		}
		if(CommonUtils.waitForElementToDisappear(driver, spinnerIcon) && CommonUtils.waitForElement(driver, photoSaveButton2)) {
			photoSaveButton2.click();
			
		if(CommonUtils.waitForElementToDisappear(driver, spinnerWhileCropping)) 
			
			isPhotoUploaded=true;
		}
		driver.switchTo().parentFrame();
		
		return isPhotoUploaded;
}



}
