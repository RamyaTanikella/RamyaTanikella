package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Constants.FileConstants;

public class FileUtils {
 /** To read Login test data file
 * @param key   Provide key to get the value
 * @return value of key passed
 * @throws IOException
 */
public static String readLoginTestData(String key) throws IOException{
	//String str1 =  FileConstants.LOGIN_TESTDATA_FILE_PATH;
	//FileInputStream f=new FileInputStream(str1);
	 
	FileInputStream f=new FileInputStream(FileConstants.LOGIN_TESTDATA_FILE_PATH);
	 //FileInputStream f=new FileInputStream("C:\\Users\\susheel\\eclipse-workspace\\SalesforceAutomation\\src\\main\\resources\\loginTestData.properties");
	 Properties p= new Properties();
	 p.load(f);
	 return p.getProperty(key);
}	 
	 public static String readUserMenuTestData(String key) throws IOException{
			FileInputStream f=new FileInputStream(FileConstants.USERMENU_TESTDATA_FILE_PATH);
			 Properties p= new Properties();
			 p.load(f);
			 return p.getProperty(key); 
 }
}
