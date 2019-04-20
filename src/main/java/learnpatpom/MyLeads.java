package learnpatpom;

import learnpom.ProjectMethods;


public class MyLeads extends ProjectMethods {
	public learnpatpom.crLead clickcLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new learnpatpom.crLead();
	}
}
