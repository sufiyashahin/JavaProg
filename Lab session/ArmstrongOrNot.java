package Java;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 153;
		
		int rem = 0;
		int num = n;
		int ans = 0;
		
		while(num !=0) {
			rem = num%10;
			ans = ans + rem*rem*rem;
			num = num/10;
			
		}
		if (ans==n) {
			System.out.println("num is armstrong");
		}
		else {
			System.out.println("not an armstrong");
		}
		
		

	}

}
