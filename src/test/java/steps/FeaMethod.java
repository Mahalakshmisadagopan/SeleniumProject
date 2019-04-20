package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FeaMethod {
	public ChromeDriver driver;
	WebElement CompanyName;
    String Company;
    
	@Given("Open the Browser")
	public void OpenBrower()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@And("Max the Browser")
	public void Maximize()
	{
		driver.manage().window().maximize();
	}

	@And("Set the Timeouts")
	public void ImplWait()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@And("Load the URL")
	public void getUrl()
	{
		driver.get("http://leaftaps.com/opentaps");
		
	}

	@And("Enter the Username as (.*)")
			public void uName(String uName)
			{
		driver.findElementById("username").sendKeys(uName);
	
		// Write code here that turns the phrase above into concrete actions
		}

	@And("Enter the Password as (.*)")
	public void passWord(String uPwd)
	{
		driver.findElementById("password").sendKeys(uPwd);
		
	}

	@When("Click on the Login Button")
	public void loginClick()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		
	}

	@Then("Verify the login Successfull")
	public void succesLogin()
	{
		System.out.println("Login created successfully");		
		
		
	}

	@Given("Open the Crm link")
	public void openLink() throws InterruptedException
	{
		
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
	}
	
	@And("Click on Create lead")
	public void cCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter Company name as (.*)")
	public void eCompany(String cName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@And("Enter First Name as (.*)")
	public void eFname(String eName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(eName);
	}

	@And("Enter Last Name as (.*)")
	public void lName(String lName)
		{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		}

	@And("Enter Gmail")
	public void eGmail()
	{
		driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys("xyz@gmail.com");
	}

	@When("Click on the Submit Button")
		public void cSubmit()
		{
		driver.findElementByName("submitButton").click();
		}

	@Then("Verify the create id Successfull")
	public void cSuccess()
	{
		System.out.println("Successfully created lead id");
		driver.close();
	}
		
	@And("Click on leads link")
	public void cLead() throws InterruptedException
	{
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(1000); 
	}
	@And("Navigate to Find leads")
	public void fLead() throws InterruptedException
	{
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000); 
	}
	@And("Navigate to Email tab")
	public void fEmail() throws InterruptedException
	{
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(1000);
	}
	@And("Enter your email address as (.*)")
	public void pEmail(String Mailid) throws InterruptedException
	{
		driver.findElementByXPath("//label[text()='Email Address:']/following::input").sendKeys(Mailid);
		Thread.sleep(1000);
	}
	@And("Click on the Find leads button")
	public void CLead() throws InterruptedException
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000); 
	}
	@And("Click on first resulting lead")
		public void sFirstresultinglead()
		{
			WebElement element2 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
			System.out.println("The title is:-" + driver.getTitle());
			element2.click();
		}
	@And("Click on Edit button")
	public void cEdit()
	{
		driver.findElementByXPath("//a[text()='Edit']").click();
		CompanyName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
		Company = CompanyName.getAttribute("value");
	}
	@And("After Edit print Edit values")
	public void pValues()
	{
		CompanyName.clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Infosys");
		System.out.println("Search Results for+ " + Company);
		//Click submit button for update
		driver.findElementByXPath("//input[@name='submitButton']").click();
	}
	@Then("Verify edit successfully completed")
	public void Esuccess()
	{
		System.out.println("Edit successfully completed");
	}

}
