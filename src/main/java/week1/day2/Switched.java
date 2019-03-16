package week1.day2;

public class Switched {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone = getPhone("Mi");
		System.out.println(phone);
	}

	static String getPhone(String S1)
	{
		switch(S1)
		{
		case "Mi": return "Blue";
        
		case "Samsung": return "Red";

		default: return "No match";

		}

	}

}


