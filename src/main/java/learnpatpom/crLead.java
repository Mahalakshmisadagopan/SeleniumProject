package learnpatpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import learnpom.ProjectMethods;
import learnpom.vLead;

public class crLead extends ProjectMethods {
	
	public crLead()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using ="createLeadForm_firstName")
	WebElement eleFirst;
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement eleLast;
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement eleCompany;
	@FindBy(how=How.XPATH,using="(//input[@name='primaryEmail'])[4]")
	WebElement eleemail;
	
	public crLead eFirstname(String eFirst) {
		
		//driver.findElementByName("USERNAME").clear();
		eleFirst.sendKeys(eFirst);
		String Data1 = eleFirst.getAttribute("value");
		System.out.println(Data1);
		return this;
	}
	
	public crLead eLastName(String eLast) {
		//driver.findElementById("password").clear();
		//driver.findElementById("createLeadForm_lastName").sendKeys(eLast);
		eleLast.sendKeys(eLast);
		String Data2=eleLast.getAttribute("value");
		System.out.println(Data2);
		return this;
	}
	
	public crLead eCompany(String cName)
	{
		//driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		eleCompany.sendKeys(cName);
		String Data3 = eleCompany.getAttribute("value");
		System.out.println(Data3);
		return this;
	}
		
	public crLead eGmail(String Gmail)
	{
		//driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys(Gmail);
		eleemail.sendKeys(Gmail);
		String Data4 = eleemail.getAttribute("value");
		System.out.println(Data4);
		return this;
	}
	public learnpatpom.vLead cSubmit()
	{
		driver.findElementByName("submitButton").click();
		return new learnpatpom.vLead();
	}
	
		}

