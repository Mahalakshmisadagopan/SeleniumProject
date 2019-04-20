package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utils.ProjectMethods;

public class CreateLead extends ProjectMethods{

	@Test(invocationCount=10)
	public void CLead() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		//driver.findElementByClassName("companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mahalakshmi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Sadagopan");
		Thread.sleep(5000);
		driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys("xyz@gmail.com");
		WebElement findElementById = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown = new Select(findElementById);
		//dropdown.selectByVisibleText("Finance");
		//dropdown.selectByIndex(5);
		dropdown.selectByValue("IND_FINANCE");
		for (WebElement Listdown : dropdown.getOptions()) {
			String text =Listdown.getText();
			System.out.println(text);
			}
		driver.findElementByName("submitButton").click();
		//String title = driver.getTitle();
		//System.out.println(title);
		//driver.findElementByLinkText("opentaps").click();
		//driver.findElementByClassName("decorativeSubmit").click();
		//driver.close();
		


	}

}
