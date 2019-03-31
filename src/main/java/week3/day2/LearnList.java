package week3.day2;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnList {
public static void main(String[] args) {
	
	List<String> Names = new ArrayList<>();
	Names.add("Maha");
	Names.add("Karthick");
	Names.add("Mani");
	Names.add("Sasi");
	Names.add("Gautam");
	Names.add("Pravin");
	Names.add("Mani");
	Names.add("Banu");
	Names.add("Mani");
	Names.add("Mani");
	System.out.println("Before Printing"+Names);	
	Set<String> Names1=new LinkedHashSet<>(Names);
	//Names1.addAll(Names);
	System.out.println("After duplicates" +Names1);
}
}
