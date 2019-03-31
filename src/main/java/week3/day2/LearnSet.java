package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {

		Set<String> Employees = new HashSet<>();
		Employees.add("Sasi");
		Employees.add("Maha");
		Employees.add("Karthick");
		Employees.add("Sai");
		Employees.add("Surya");

		//Removing the first entry of the list
		boolean remove = Employees.remove("Sasi");
		System.out.println(remove);
		System.out.println("Employee:-" +Employees );
		System.out.println("Employee name starts with S:-");
		for (String Employees1 : Employees) {

			boolean startsWith = Employees1.startsWith("S");
			if (startsWith==true)
				System.out.println(Employees1);

		}


	}




}
