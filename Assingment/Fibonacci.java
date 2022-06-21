package CoreJava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0,1,1,2,3,5,8,13
		
		Scanner sc = new Scanner(System.in);
		int  n  = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int f = 1;
		
		int i = 1;
		while(i<=n) {
			
			System.out.println(a);
			f = a +b;
			a =b;
			b = f;
			i++;
		}

	}

}
