package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement MyDrag = driver.findElementByXPath("//p[text()='Drag me to my target']");
		WebElement MyDrop = driver.findElementByXPath("//p[text()='Drop here']");
		Actions builder =new Actions(driver);
		builder.clickAndHold(MyDrag).dragAndDrop(MyDrag, MyDrop).perform();

	}

}
