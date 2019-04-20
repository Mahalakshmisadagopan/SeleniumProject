package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProjectDay1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai ");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Click the journey link

		driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();

		Thread.sleep(4000);
		
		//Zoom out the window to choose the element		
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='60%'");
		Thread.sleep(3000);*/
		
		//Select the element
		
		WebElement webElement = driver.findElementByXPath("//div[text()[contains(.,'Kodambakkam')]]");
		int y = webElement.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", webElement);
		js.executeScript("javascript:window.scrollBy(0,'"+y+"')");
	    //Actions act=new Actions(driver);
	    //act.moveToElement(webelement, xOffset, yOffset)
		
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Next']").click();

		Thread.sleep(4000);
		//Click on tomorrow's date
		driver.findElementByXPath("//div[text()='Mon']").click();

		//Get the date and compare it 
		String First = driver.findElementByXPath("//div[@class='day picked low-price']").getText().replaceAll("\\D", "");

		driver.findElementByXPath("//button[text()='Next']").click();

		//WebElement findElementByXPath = driver.findElementByXPath("(//div[text()[contains(.,'1')]])[1]/div");
		Thread.sleep(4000);
		String Second = driver.findElementByXPath("//div[@class='day picked low-price']").getText().replaceAll("\\D", "");

		if(First.equals(Second))
			System.out.println("Date Matched");
		else 
			System.out.println("Date not matched");

		driver.findElementByXPath("//button[text()='Done']").click();

		Thread.sleep(5000);
		//Print all the option Car and its value:-
		List<WebElement> Count = driver.findElementsByXPath("//div[@class='details']/h3");
		System.out.println("Results of all the cars highest value" + Count.size()); 

		List<WebElement> price = driver.findElementsByXPath("//div[@class='price']");

		List<Integer> ls =new ArrayList<>();
		for (WebElement eachPrice : price) {
			String replaceAll = eachPrice.getText().replaceAll("\\D", "");
			int parseInt = Integer.parseInt(replaceAll);
			System.out.println(parseInt);
			ls.add(parseInt);
		}
		Integer max = Collections.max(ls);
		System.out.println(max);
		String Carname = driver.findElementByXPath("(//div[contains(text(),'"+max+"')])/../../preceding-sibling::div/h3").getText();
		System.out.println("Highest company of car" +Carname);
		//Highest value and its brand name
		//driver.findElementByXPath("//div[text()=' Price: High to Low ']").click();
		//Thread.sleep(2000);
       driver.findElementByXPath("//div[contains(text(),'"+max+"')]/following::button").click();
       System.out.println("Clicked on Book now for " +Carname);
       driver.close();

	}

}
