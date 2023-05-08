package file_utiles_Poorna;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import constants_Poorna.File_constants_Poorna;

public class Properties_Files_Utils_Poorna {
	
public static String readPropertiesFile(String sfilePath, String sKey) throws IOException
{
	String sValue ="";
	FileInputStream fis=new FileInputStream(new File(sfilePath));
	Properties p=new Properties();
	p.load(fis);
	sValue=p.getProperty(sKey);
	return sValue;
}
public static String readUserMenuTestData(String sKey) throws IOException
{
	String sValue ="";
	FileInputStream fis=new FileInputStream(new File(File_constants_Poorna.USER_MENU_TEST_DATA_FILE_PATH));
	Properties p=new Properties();
	p.load(fis);
	sValue=p.getProperty(sKey);
	return sValue;
}

public static String readContacts_testdata(String skey) throws IOException {
	String sValue="";
	FileInputStream fis=new FileInputStream(new File(File_constants_Poorna.CONTACTS_PAGE_LASTNAME_UPDATE));
	Properties p=new Properties();
	p.load(fis);
	sValue=p.getProperty(skey);
	return sValue;
}

public static String readLeads_testdata(String skey) throws IOException {
	String sValue="";
	FileInputStream fis=new FileInputStream(new File(File_constants_Poorna.LEADS_MENU_TEST_DATA_FILE_PATH));
	Properties p=new Properties();
	p.load(fis);
	sValue=p.getProperty(skey);
	return sValue;
}

public static String readListData(String sfilePath, String sKey) throws IOException
{
	String sValue ="";
	FileInputStream fis=new FileInputStream(new File(sfilePath));
	Properties p=new Properties();
	p.load(fis);
	sValue=p.getProperty(sKey);
	return sValue;
}


public static String readLeads_testdata2(String skey, String sKey2) throws IOException {
	String sValue="";
	FileInputStream fis=new FileInputStream(new File(File_constants_Poorna.LEADS_MENU_TEST_DATA_FILE_PATH));
	Properties p=new Properties();
	p.load(fis);
	sValue=p.getProperty(skey);
	return sValue;
}
}
