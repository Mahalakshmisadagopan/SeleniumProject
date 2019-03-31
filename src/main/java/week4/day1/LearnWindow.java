package week4.day1;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByLinkText("Contact Us").click();
		
		//take snap
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/img.jpeg");		
		FileUtils.copyFile(src, desc);
		
		Set<String> allWindows = driver.getWindowHandles();
		for (String string : allWindows) {
			System.out.println(string);
		}
		System.out.println(driver.getSessionId());
		List<String> ls = new ArrayList<>();
		ls.addAll(allWindows);
		
		System.out.println(driver.getTitle());
		WebDriver window = driver.switchTo().window(ls.get(1));
		System.out.println(driver.getTitle());
		//WebElement Text1 = driver.findElementByXPath("//p[text()='Barakhamba Road, New Delhi 110001.']");
		WebElement Text1 = driver.findElementByXPath("//p[text()[contains(., 'New Delhi')]]");
		//p[text()[contains(., 'New Delhi')]]
		String S2=Text1.getText();
		if(S2.contains("New Delhi"))
		System.out.println("Text match");
		else
		System.out.println("Not match");
		driver.switchTo().window(ls.get(0));
		driver.quit();
				//driver.quit();
			
	}

}
