package week1.day2;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Country="india&china&japan&canada";
String[] split = Country.split("&");
for (String eachCountry: split) {
	if (eachCountry.startsWith("c")) 
		System.out.println(eachCountry);
		
	}

	}

}
