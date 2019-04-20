package week5.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils.ProjectMethods;

public class EditLead extends ProjectMethods
{

	//PackageName.ClassName.MethodName-->Depends on Methods
	@Test(dependsOnMethods= {"week5.day1.CreateLead.Createlead","week5.day1.DeleteLead.Deletelead"})
	public void Editlead() throws InterruptedException 
	{	
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(1000); 
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000); 
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//label[text()='Email Address:']/following::input").sendKeys("xyz@gmail.com");
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000); 

		//Click on first resulting lead item
		WebElement element2 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		System.out.println("The title is:-" + driver.getTitle());
		element2.click();
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement CompanyName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
		String Company = CompanyName.getAttribute("value");

		//Printing company name before Edit
		//System.out.println("Company name before update" +Company);
		CompanyName.clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Infosys");
		driver.findElementByXPath("//input[@class='smallSubmit'][1]").click();					

		//	Thread.sleep(2000); 
		//String text2 = driver.findElementById("viewLead_companyName_sp").getText();
		//String[] split = text2.split(" ");
		System.out.println("Search Results for+ " + Company);
		System.out.println("Edit lead completed");
	}

}

