package week5.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.ProjectMethods;

public class DuplicateLead extends ProjectMethods{

	@Test
	public void Duplicatelead() throws InterruptedException 
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
		System.out.println("First Resulting Lead" + element2.getText());
		element2.click();
		
		//Get first name of the lead
		WebElement FirstName = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
		System.out.println("First name of the lead is " +FirstName.getText());
		
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		System.out.println("Title of the page:-" +driver.getTitle());
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
		WebElement DuplicateName = driver.findElementById("viewLead_firstName_sp");
		System.out.println("First name after duplicate lead is " +DuplicateName.getText());
		System.out.println("Duplicate Lead completed");

	}

}
