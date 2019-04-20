package learnpom;

import org.openqa.selenium.WebElement;

public class Editlead extends ProjectMethods{
	WebElement CompanyName1;
	String Company1;
	
		
	//Print before edit company name
	public Editlead pbeCompanyname()
	{
		CompanyName1 = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
		Company1 = CompanyName1.getAttribute("value");
		System.out.println("Before edit the company name is "+Company1);
		return this;
	}

	public editView editCompany()
	{
		CompanyName1.clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Infosys");
		driver.findElementByXPath("//input[@class='smallSubmit'][1]").click();
		return new editView();

    }
	
}
