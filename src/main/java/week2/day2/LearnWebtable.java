package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("CBE",Keys.TAB);
		WebElement selected = driver.findElementById("chkSelectDateOnly");
		if (selected.isSelected())
		{
			driver.findElementById("chkSelectDateOnly").click();
		}
		Thread.sleep(3000);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
		List<WebElement> columns =rows.get(i).findElements(By.tagName("td"));
		//System.out.println("rows count " +rows.size());
		//System.out.println("Train names are ");
		//List<WebElement> firstcolumn= driver.findElementsByXPath("//div [@id='divTrainsList']/table[1]/tbody[1]/tr[1]/td[2]");	
			boolean startsWithS = columns.get(1).getText().startsWith("S");
			if (startsWithS==true)
			{
				
				System.out.println(columns.get(1).getText() +"\t"+ columns.get(0).getText());
			}
		}

		driver.close();
	}

}

