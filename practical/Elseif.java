package PratikJava;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("enetr the num :");
		int a = sc.nextInt();
		
		
		if (a>0) {
			System.out.println("positive");
		}else if(a<0){
			System.out.println("negative");
		}else {
			System.out.println("zero");
		}
	}

}
