package CoreJava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		212 , 535, 111, 363, 36665693 <--x
		
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		
		int ans = 0;
		int temp = n;
		while (n != 0) {
			
			int rem = n % 10;
			
			ans = ans*10 + rem;
			
			n = n/10;
		}
		if (ans == temp) {
			System.out.println("palindrome ");
		}else {
			System.out.println("not palindrome");
		}
			
	}

}
