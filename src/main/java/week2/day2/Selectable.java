package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		Actions builder = new Actions(driver);
		WebElement Item2 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement Item6 = driver.findElementByXPath("//li[text()='Item 6']");
		builder.sendKeys(Keys.CONTROL).click(Item2).click(Item6).perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
