package Constants;

import utils.CommonUtils;

public class FileConstants {
	
	public static final String LOGIN_TESTDATA_FILE_PATH = System.getProperty("user.dir")+ "\\src\\main\\resources\\loginTestData.properties"; 
	//public static final String LOGIN_TESTDATA_FILE_PATH = "C:\\Users\\susheel\\eclipse-workspace\\SalesforceAutomation\\src\\main\\resources\\loginTestData.properties"; 
	public static final String USERMENU_TESTDATA_FILE_PATH = System.getProperty("user.dir")+ "\\src\\main\\resources\\UserMenuTestData.properties"; 
	public static final String TEST_FILE_PATH = "C:\\Users\\susheel\\Desktop\\JavaHackathon.docx";
	public static final String PHOTO_FILE_PATH = "C:\\Users\\susheel\\Desktop\\IMG_7427.JPG";

	public static final String SCREENSHOTS_FOLDER_PATH =System.getProperty("user.dir")+ "\\src\\test\\resources\\Screenshots"+CommonUtils.getDateAndTimeStamp()+".PNG";
	public static final String REPORTS_FOLDER_PATH =System.getProperty("user.dir")+ "\\src\\test\\resources\\SFDC_"+CommonUtils.getDateAndTimeStamp()+".html";

	//public static void main(String[] args) {
	//	System.out.println(SCREENSHOTS_FOLDER_PATH);
	//}
	
}

