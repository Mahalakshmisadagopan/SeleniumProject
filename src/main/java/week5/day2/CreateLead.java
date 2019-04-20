package week5.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ProjectMethods;


public class CreateLead extends ProjectMethods{
	public String Firstname;

	@Test(dataProvider="FetchData")
	public  void Createlead(String CName,String fname,String lname,String gmail) throws InterruptedException {
		driver.findElementByLinkText("Create Lead").click();
		//driver.findElementByClassName("companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_companyName").sendKeys(CName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
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
		driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys(gmail);
		driver.findElementByName("submitButton").click();
		System.out.println();
		Firstname = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		//System.out.println("Create lead successfully completed"+Firstname);
		//String title = driver.getTitle();
		//System.out.println(title);
		//driver.findElementByLinkText("opentaps").click();
		//driver.findElementByClassName("decorativeSubmit").click();
	
			
	}
	//To be printed common try it out
	/*@AfterTest
	public void print()
	{	
		System.out.println("Create lead successfully completed"+Firstname);
	}*/
		
	@BeforeTest
	public void setData()
	{
		datasheet="Maha";
	}

	}
	


