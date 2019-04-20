package learnpom;

public class MyLeads extends ProjectMethods
{
	
	public crLead clickcLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new crLead();
	}
}