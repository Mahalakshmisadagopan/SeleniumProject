package week3.day1;

public class Vechicle {

	public static void main(String[] args) {
		Scooty obj1 = new Scooty();
		obj1.Underseatstorage();
		obj1.Brake();
		TVS obj2=new TVS();
		obj2.moremembers();
		Vechicle obj3 =new Vechicle();
		obj3.Brake();
		obj3.drive();
     }
	public void drive()
    {
   	 System.out.println("Vechicle:-Vechicle is driving now");
    }
	public void Brake()
	{
		System.out.println("Vechicle:-Vechicle is on Brake now");
	}
	
	
		}


