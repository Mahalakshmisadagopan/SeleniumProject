package week1.day1;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var1 = 20;
		int var2 =33;
		int var3 =0;

		if ((var1>=var2) && (var1>=var3))
		{
			System.out.println("Var1 " +var1 + " is greatest");
		}

		else if ((var2>=var1) && (var2>=var3))
		{
			System.out.println("Var2 " +var2 + " is greatest");
		}

		else
		{
			System.out.println("Var3 " +var3 + " is greatest");
		}


	}

}
