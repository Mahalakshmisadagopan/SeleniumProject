package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement frameElement = driver.findElementByXPath("//iframe[@id='iframeResult']");
		driver.switchTo().frame(frameElement);
		driver.findElementByXPath("//button[text()='Try it']").click();
		//String text1 = driver.switchTo().alert().getText();
		//System.out.println("Text Before" +text1);
		String S1="Mahalakshmi";
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(S1);
		alert.accept();
	//	String text2 = alert.getText();
		//WebElement findElementByXPath = driver.findElementByXPath("//p[text()='Hello Mahalakshmi! How are you today?']");
	//	System.out.println("Text After" +text2);
		String text3 = driver.findElementById("demo").getText();
		if (text3.contains(S1))
				System.out.println("Text in Frame " + text3);
				
		else 
			System.out.println("Name not contains");
		driver.close();
				}
	

	}


