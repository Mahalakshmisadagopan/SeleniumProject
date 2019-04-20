package learnpatpom;

import learnpom.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	/*public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
		}*/

	public MyHome clickCRM()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new learnpatpom.MyHome();
	
	}

}