package week5.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utils.ProjectMethods;

public class CreateLead extends ProjectMethods {

	@Test
	public void Createlead() throws InterruptedException 
	{
		driver.findElementByLinkText("Create Lead").click();
		//invocationCount=5
		//driver.findElementByClassName("companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mahalakshmi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Sadagopan");
		WebElement findElementById = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown = new Select(findElementById);
		//dropdown.selectByVisibleText("Finance");
		//dropdown.selectByIndex(5);
		dropdown.selectByValue("IND_FINANCE");
		/*for (WebElement Listdown : dropdown.getOptions()) {
			String text =Listdown.getText();
			System.out.println(text);
		}*/
		Thread.sleep(3000);
		driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys("xyz@gmail.com");
		driver.findElementByName("submitButton").click();
		System.out.println();
		String Firstname = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		System.out.println("Create lead successfully completed"+Firstname);
		//String title = driver.getTitle();
		//System.out.println(title);
		//driver.findElementByLinkText("opentaps").click();
		//driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("CreateLead completed");
		
	}
	
	}
