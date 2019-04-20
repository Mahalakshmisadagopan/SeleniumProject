package learnpatpom;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import learnpom.ProjectMethods;


public class Testcase1  extends ProjectMethods{
	
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
		.clickCRM()
		.clickLead()
		.clickcLead()
		.eCompany(ecomp)
		.eFirstname(efname)
		.eLastName(elname)
		.eGmail(email)
		.cSubmit()
		.verifyFname(efname);
						
		//.enterUserName(userName)
		//.enterPassword(password)
		//.clickLogin()
		//.clickLogout()
		//.clickCRM()
		//.clickLead()
		//.clickcLead()
		//.eCompany(ecomp)
		//.eFirstname(efname)
		//.eLastName(elname)
		//.eGmail(email)
		//.cSubmit()
		//.verifyFname(efname)
		//.editlead();
		//.pbeCompanyname()
		//.editCompany()
		//.paeCompanyname();
	}
}

