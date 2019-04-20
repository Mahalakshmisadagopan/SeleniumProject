package learnpatpom;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

import learnpom.HomePage;
import learnpom.ProjectMethods;

	public class LoginPage extends ProjectMethods{
		
		public LoginPage()
		{
		PageFactory.initElements(driver,this);
		}
		
		@FindBy(how=How.NAME,using="USERNAME")
		WebElement eleusername;
		@FindBy(how=How.ID,using="password")
		WebElement elepassword;
		@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
		WebElement elesubmit;
		
		public LoginPage enterUserName(String userName) {
			eleusername.clear();
			//driver.findElementByName("USERNAME").sendKeys(userName);
			eleusername.sendKeys(userName);
			return this;
		}
		
		public LoginPage enterPassword(String password) {
			//driver.findElementById("password").clear();
			elepassword.clear();
			elepassword.sendKeys(password);
			//driver.findElementById("password").sendKeys(password);
			return this;
		}
		
		public learnpatpom.HomePage clickLogin() {
			//driver.findElementByClassName("decorativeSubmit").click();
			elesubmit.click();
			return new learnpatpom.HomePage();
		}
	}
	
			
	

