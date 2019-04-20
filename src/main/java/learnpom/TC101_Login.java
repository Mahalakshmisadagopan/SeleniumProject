package learnpom;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC101_Login extends ProjectMethods{

	@BeforeTest
	public void setData() {
		dataSheetName = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void logIn(String userName,String password,String ecomp,String efname,String elname,String email) {		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		//.clickLogout()
		.clickCRM()
		.clickLead()
		.clickcLead()
		.eCompany(ecomp)
		.eFirstname(efname)
		.eLastName(elname)
		.eGmail(email)
		.cSubmit()
		.verifyFname(efname)
		.editlead()
		.pbeCompanyname()
		.editCompany()
		.paeCompanyname();
	}
}
