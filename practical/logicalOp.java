package PratikJava;

public class logicalOp {

	public static void main(String[] args) {

//		Logical operator
//		AND --> &&
//		OR  --> ||
//		NOT --> !\
		
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a<b && ++a<c);// if the first condition is true then only the second condition evalues
		System.out.println(a);
		System.out.println(a<b && b<c);
		
//		Logical OR
		System.out.println(a>b || a<c);
		System.out.println(a>b || ++a>c);// evaluates in any condition 
		System.out.println(a);
		
//		Logical Not 
		System.out.println(!(a<b)); // just reverse the value 
		
		
	}

}
