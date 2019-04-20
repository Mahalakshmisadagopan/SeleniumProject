package learnpatpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import learnpom.ProjectMethods;

public class topleadpage extends ProjectMethods{
	public topleadpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='My Home']")
	WebElement elehome;
	@FindBy(how=How.XPATH,using="//a[text()='Leads']")
	WebElement elelead;
	@FindBy(how=How.XPATH,using="//a[text()='Contacts']")
	WebElement elecontact;
	@FindBy(how=How.XPATH,using="//a[text()='Accounts']")
	WebElement eleAccounts;
	@FindBy(how=How.LINK_TEXT,using="Cases")
	WebElement eleCases;
	@FindBy(how=How.LINK_TEXT,using="Activities")
	WebElement eleActivities;
	@FindBy(how=How.LINK_TEXT,using="Opportunities")
	WebElement eleOpportunities;
	@FindBy(how=How.LINK_TEXT,using="Quotes")
	WebElement eleQuotes;
	@FindBy(how=How.LINK_TEXT,using="Orders")
	WebElement eleOrders;
	@FindBy(how=How.LINK_TEXT,using="Forecasts")
	WebElement eleForecasts;
	@FindBy(how=How.LINK_TEXT,using="Marketing")
	WebElement eleMarketing;
	@FindBy(how=How.LINK_TEXT,using="Partners")
	WebElement elePartners;
	@FindBy(how=How.LINK_TEXT,using="Teams")
	WebElement eleTeams;
	@FindBy(how=How.LINK_TEXT,using="Reports")
	WebElement eleReports;
	@FindBy(how=How.LINK_TEXT,using="opentaps")
	WebElement eleopentaps;
	
	void MyHome()
	{elehome.click();
	}	
	public void Leads()
	{elelead.click();
	}
	public void Contacts()
	{elecontact.click();
	}
	public void Accounts()
	{eleAccounts.click();
	}
	public void Cases()
	{eleCases.click();
	}
	public void Activities()
	{eleActivities.click();
	}
	public void Opportunities()
	{eleOpportunities.click();
	}
	public void Quotes()
	{eleQuotes.click();
	}
	public void Orders()
	{eleOrders.click();
	}
	public void Forecasts()
	{eleForecasts.click();
	}
	public void Marketing()
	{eleMarketing.click();
	}
	public void partners()
	{elePartners.click();
	}
	public void teams()
	{eleTeams.click();		
	}
	public void Reports()
	{eleReports.click();
	}
	public void opentaps()
	{eleopentaps.click();
	}
		
	}
	


