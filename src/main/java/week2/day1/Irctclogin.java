package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctclogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.findElementByClassName("fa fa-align-justify").click();
		//driver.findElementByClassName("search_btn").click();
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("xmsnf");
		driver.findElementById("userRegistrationForm:password").sendKeys("Gautam123456");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Gautam123456");
		WebElement findElementByClassName = driver.findElementById("userRegistrationForm:securityQ");
		Select dropdown=new Select(findElementByClassName);
		dropdown.selectByValue("0");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Maha");	
		WebElement findElementById = driver.findElementById("userRegistrationForm:prelan");
		Select dropdown1 =new Select(findElementById);
		dropdown1.selectByValue("en");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Maha");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Lakshmi");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Sadagopan");
		driver.findElementByXPath("//input[@value='F']").click();
		driver.findElementByXPath("//label[text()=' Married']").click();
		WebElement findElementById1 = driver.findElementById("userRegistrationForm:dobDay");
		Select dropdown2 =new Select(findElementById1);
		dropdown2.selectByValue("07");
		WebElement findElementById2 = driver.findElementById("userRegistrationForm:dobMonth");
		Select dropdown3 =new Select(findElementById2);
		dropdown3.selectByValue("06");
		WebElement findElementById3 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dropdown4 =new Select(findElementById3);
		dropdown4.selectByValue("1984");
		WebElement findElementById5 = driver.findElementById("userRegistrationForm:occupation");
		Select dropdown5 =new Select(findElementById5);
		dropdown5.selectByValue("2");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456");
		driver.findElementById("userRegistrationForm:idno").sendKeys("ASM5909G");
		WebElement findElementById6 = driver.findElementById("userRegistrationForm:countries");
		Select dropdown6 =new Select(findElementById6);
		dropdown6.selectByValue("94");
		driver.findElementById("userRegistrationForm:email").sendKeys("mahasrinipravin@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8754499251");
		
		WebElement findElementById7 = driver.findElementById("userRegistrationForm:nationalityId");
		Select dropdown7 =new Select(findElementById7);
		dropdown7.selectByValue("94");
			
		
	driver.findElementById("userRegistrationForm:address").sendKeys("116");
	driver.findElementById("userRegistrationForm:street").sendKeys("Amudham colony");
	driver.findElementById("userRegistrationForm:area").sendKeys("Amudham colony");
	driver.findElementById("userRegistrationForm:pincode").sendKeys("603202",Keys.TAB);
	Thread.sleep(2000);
	WebElement findElementById8 = driver.findElementById("userRegistrationForm:cityName");
	Select dropdown8 =new Select(findElementById8);
	dropdown8.selectByVisibleText("Kanchipuram");
	
	Thread.sleep(3000);
	WebElement findElementById9 = driver.findElementById("userRegistrationForm:postofficeName");
	Select dropdown9 =new Select(findElementById9);
	dropdown9.selectByVisibleText("Guduvanchery S.O");
	driver.findElementById("userRegistrationForm:landline").sendKeys("8754499251");
	}
	


}
