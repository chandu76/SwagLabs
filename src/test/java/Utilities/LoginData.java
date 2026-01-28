package Utilities;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;

import org.testng.annotations.DataProvider;

import TestBase.BaseTest;

public class LoginData extends BaseTest {
@DataProvider(name="LoginData")
String[][] getdata() throws IOException
{
	String path=p.getProperty("loginData_path");
	Excel_Utilities xlutil=new Excel_Utilities(path);
	int total_rows=xlutil.GetRowCount("Loginsheet");
	int total_column=xlutil.GetCellCount("LoginSheet", 1);
	String login_data[][]=new String [total_rows][total_column];
	for(int i=1;i<total_rows;i++)
	{
		for(int j=0;j<total_column;j++)
		{
			login_data[i-1][j]=xlutil.GetCellData("login_page",i, j);
		}
	}
	return null;
}

}
