package array;

import java.util.Scanner;

public class ElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element ");
		int element = sc.nextInt();
		
		int arr[] = {1,2,3,4,5};
		for (int i = 0; i<arr.length; i++) {
			if(element == arr[i]) {
				System.out.println("element is there ");
			}
		}

	}

}
