package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
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
