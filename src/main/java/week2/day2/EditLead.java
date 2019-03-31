package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			Thread.sleep(3000);
			driver.findElementByXPath("//a[text()='Leads']").click();
			Thread.sleep(1000); 
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			Thread.sleep(3000); 
			driver.findElementByXPath("//span[text()='Email']").click();
			Thread.sleep(1000);
			driver.findElementByXPath("//label[text()='Email Address:']/following::input").sendKeys("xyz3@gmail.com");
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
		//	driver.findElementByXPath("//input[@class='smallSubmit'][1]").click();					
			
		//	Thread.sleep(2000); 
			//String text2 = driver.findElementById("viewLead_companyName_sp").getText();
			//String[] split = text2.split(" ");
			System.out.println("Search Results for+ " + Company);
			//driver.close();

	}

}
