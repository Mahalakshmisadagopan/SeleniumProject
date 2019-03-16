package week1.day1;

public class Mobile {

	//Create two different variables
	public String OsVersion="Android9";
	public boolean IsAndroid=true;
	//Create a three different methods
	
	public void doGet(){	
	System.out.println("My mobile details");
	}
	
	public String getBrandname() {
		return "Mi";		
	}
	public int getNumber() {
		return 875449925;
	}
	public String  getMobileColor(String whom)
	{
		if (whom.equalsIgnoreCase("Son"))
				return "Blue";
		else if (whom.equalsIgnoreCase("Wife"))
				return "pink";
				else if (whom.equalsIgnoreCase("Me"))
						return "White";
						else
							return "Black";
	}
}
