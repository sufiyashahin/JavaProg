package array;

import java.util.Scanner;

public class TwoDArrayInputUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int row ;
		int col;
	
		System.out.println("enter the no of rows ");
		row = sc.nextInt(); 
		
		System.out.println("enter the no of col");
		col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		int i ,j ;
		System.out.println("Enter the values of rows and columns");
		for( i = 0; i<row; i++) {
			for( j = 0; j<col; j++) {
		
				arr[i][j] = sc.nextInt();
				
			}
	
		}
		
				
		for(i = 0; i<row ; i++) {
			for(j = 0; j<col; j++) {
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.println();
		}
		

	}

}
