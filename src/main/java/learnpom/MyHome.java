package learnpom;

public class MyHome extends ProjectMethods{
	
	public MyLeads clickLead()
	{
		driver.findElementByXPath("//a[text()='Leads']").click();
		//driver.findElementByLinkText("Create Lead").click();
		return new MyLeads();
	}
}
