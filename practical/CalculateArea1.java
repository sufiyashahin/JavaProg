package oops;

//import java.util.Scanner;

class Rectangle{
	
	int len ,br;
	
	
	public void Area () {
		int Area = len*br;
		System.out.println(Area);
	}
}

public class CalculateArea1{
	public static void main(String[] args) {
		
		Rectangle p1 = new Rectangle();
		
		p1.len = 20;
		p1.br = 30;
		
		p1.Area();
	}
	
}


