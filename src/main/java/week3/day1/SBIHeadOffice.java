package week3.day1;

public abstract class SBIHeadOffice implements LearnInterface{

	public static void main(String[] args) {
		//SBIHeadOffice obj1=new SBIHeadOffice();
		SBIChennai obj1=new SBIChennai();
		obj1.setminbalance();
		obj1.Location();
		obj1.customer();
		SBITirchy obj2=new SBITirchy();
		obj2.Location();
		obj2.customer();
		
	}
	public abstract void setminbalance();
	public abstract void Method1();
	public abstract void Method2();
	public abstract void Method3();

}
