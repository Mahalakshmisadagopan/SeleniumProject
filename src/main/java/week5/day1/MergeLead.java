package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utils.ProjectMethods;

@Test
public class MergeLead extends ProjectMethods{

	public  void Mergelead() throws InterruptedException  {
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(1000); 
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		//Merge lead is a primary windown
		//String Primarywindow = driver.getWindowHandle();
		//System.out.println("Primary Window " + driver.getTitle());
		//Thread.sleep(3000);
		//Click on Icon near from lead 
		driver.findElementByXPath("(//a[@href[contains(.,'LookupLeads')]])[1]").click();
		Thread.sleep(3000);
		
		//Get window handles for from and to window
		Set<String> fromandto = driver.getWindowHandles();
		List<String> ls = new ArrayList<>();
		ls.addAll(fromandto);
		//From lead window
		for (String string : ls)
		{
			System.out.println("Window id " +fromandto);
		}
		
		System.out.println("Primary window at beginning " + driver.getTitle());
		WebDriver FromWindow = driver.switchTo().window(ls.get(1));
		System.out.println("Switching to From Window " + driver.getTitle());
		//driver.findElementByXPath("//input[@name='id']").sendKeys("10324");
		Thread.sleep(1000);
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//div[@unselectable='on'])[16]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@unselectable='on'])[16]").click();
		Thread.sleep(3000);
		
		String FromLead  = driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();
		Thread.sleep(3000);
		
		String ToLead  = driver.findElementByXPath("(//a[@class='linktext'])[7]").getText();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(1000);
		
		driver.findElementByXPath("//span[text()='Name and ID']").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(FromLead);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		
		//click on first resulting lead in From lead
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(ls.get(0));
		System.out.println("Switch to primary window " +driver.getTitle());
		////Click on Icon near to lead 
		//driver.findElementByXPath("//input[@name='id']").clear();
		driver.findElementByXPath("(//a[@href[contains(.,'LookupLeads')]])[2]").click();
		//WebDriver ToWindow = driver.switchTo().window(ls.get(2));
		
		
		ls.clear();
		Set<String> fromandto1 = driver.getWindowHandles();
		List<String> ls1 = new ArrayList<>();
		ls1.addAll(fromandto1);
		for (String string : ls1) 
		{
			System.out.println("Windows id in ls1 "+fromandto1);
		}
		
		WebDriver ToWindow = driver.switchTo().window(ls1.get(1));
		System.out.println("Switching to To Window " + driver.getTitle());
			
		driver.findElementByXPath("//input[@name='id']").sendKeys(ToLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//click on first resulting lead in From lead
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(ls1.get(0));
		
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		//Accept alert
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//driver.switchTo().window(ls1.get(1));
		//driver.switchTo().window(ls1.get(0));
		Thread.sleep(2000);
		System.out.println("Primary Window " + driver.getTitle());
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		//driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(FromLead);
		//driver.findElementByLinkText("//button[text()='Find Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		String Errormessage = driver.findElementByXPath("//div[@class='x-toolbar x-small-editor']/div").getText();
		System.out.println("Error message for from lead " +Errormessage );
		//driver.close();
		
	}

}
