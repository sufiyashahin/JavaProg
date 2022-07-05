package oops;

import java.util.Scanner;

class Reactangle1{
	
	Scanner sc = new Scanner(System.in);
private	int l ;
private	int b ;
	
	
	public void setL() {
		System.out.println("enter the lenght  ");
		l = sc.nextInt();
		
	}
	
	public void setB() {
		System.out.println("Enter the breath  ");
		b = sc.nextInt();
	}
	
	public int getL() {
		return l;
	}
	
	public int getB() {
		return b;
	}
	
	public void Area() {
		int area = l*b;
		System.out.println("The area of rectangle is "+area);
		
	
	}
}

public class CalculateArea2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reactangle1 p1 = new Reactangle1();
		
		p1.setL();
		p1.setB();
		
		System.out.println("the length of rectangle is "+p1.getL());
		System.out.println("The breath of rectangle is "+p1.getB());
		
		p1.Area();
		
		
	}

}
