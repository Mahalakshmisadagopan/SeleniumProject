package week1.day2;

public class Looping {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		String[] name=new String[4];
		name[0]="A";
		name[1]="B";
		name[2]="C";
		name[3]="D";
		for(int i=0;i<name.length;i++)
		{
			if((i%2)!=0)
			System.out.println("Name printed " +name[i]);
			//i=i+2;
			//i+=2;
		}

	}
	

}
