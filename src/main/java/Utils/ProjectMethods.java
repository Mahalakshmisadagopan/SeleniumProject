package Utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day2.Createexcel;

public class ProjectMethods  {
	public ChromeDriver driver;
	public String datasheet;
	//public List<String> ls1=new ArrayList<>();
	@Parameters({"url","username","password"})
	@BeforeMethod	
	public void startapp(String site,String usr,String pwd) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys(usr);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	
	@DataProvider(name="FetchData")
	public String[][] getData() throws IOException
	{
		Createexcel Cre=new Createexcel();
		return Cre.Readexcel(datasheet);
	}
	
	
}
