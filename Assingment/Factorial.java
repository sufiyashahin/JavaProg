package PratikJava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the Number  ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		int i = 1;
		int factorial = 1;
		
		while(i<=n) {
			factorial = factorial*i;
			i++;
		}
		System.out.println(factorial);
	}

}
