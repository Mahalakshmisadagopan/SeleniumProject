package learnpom;

public class vLead extends ProjectMethods {
	
	public vLead verifyFname(String firstName)
	{
		String Firstname = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		if(Firstname.equals(firstName))
			System.out.println("Create lead successfully completed"+Firstname);
		else
			System.out.println("Does not match first name "+firstName);
		return this;
	}
	
	public Editlead editlead()
	{
		driver.findElementByXPath("//a[text()='Edit']").click();
		return new Editlead();
	}
	
}
