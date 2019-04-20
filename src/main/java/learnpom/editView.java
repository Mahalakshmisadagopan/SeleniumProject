package learnpom;

import org.openqa.selenium.WebElement;

public class editView extends ProjectMethods{
	WebElement CompanyName2;
	String Company2;
	//String S3;
	//print after editcompany
		public editView paeCompanyname()
		{
			CompanyName2 = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
			Company2 = CompanyName2.getText();
			System.out.println(Company2);
			System.out.println("After edit the company name is "+Company2.substring(0,3));
			return this;
		}
}