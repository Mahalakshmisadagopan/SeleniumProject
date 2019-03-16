package week1.day1;

public class MyMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile1  = new Mobile();
		mobile1.doGet();
		String brandname = mobile1.getBrandname();
		System.out.println(brandname);
		int number = mobile1.getNumber();
		System.out.println(number);
		System.out.println(mobile1.OsVersion);
		boolean isAndroid = mobile1.IsAndroid;
		System.out.println(isAndroid);
		String mobileColor = mobile1.getMobileColor("me");
		System.out.println(mobileColor);
	}

}


