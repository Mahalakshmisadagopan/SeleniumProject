package week1.day1;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 5;
		HomeWork H1=new HomeWork();
		int doAdd = H1.doAdd(a, b);
		System.out.println("Addition of two number:"+doAdd);
		int doSub = H1.doSub(a, b);
		System.out.println("Subraction of two number:"+doSub);
		int doMultiply = H1.doMultiply(a,b);
		System.out.println("Multiply of two number:"+doMultiply);
		int doDivide = H1.doDivide(a,b);
		System.out.println("Divide of two number:"+doDivide);
		

	}

}
