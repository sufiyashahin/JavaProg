package array;

import java.util.Scanner;

public class Double2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//taking input from user 
		Scanner sc = new Scanner(System.in);
		int row1,col1,row2,col2;
		
		//taking input the rows 1
		System.out.println("Enter the Rows ");
		row1= sc.nextInt();
		
		//taking input the col 1
		System.out.println("Enter the Cols ");
		col1 = sc.nextInt();
		
		//taking input for row 2
		System.out.println("enter the no of rows for 2nd array ");
		row2= sc.nextInt();
		
		//taking input for col 2
		System.out.println("enter the no col for 2nd array ");
		col2 = sc.nextInt();
		
		//initializing array size 
		int arr[][] = new int[row1][col1];
		
		//initializing the size of array2
		int arr1[][] = new int [row2][col2];
		
		//taking input values of array1
		System.out.println("enter the values for 1st array");
		for(int i = 0; i<row1 ; i++) {
			for(int j = 0; j<col1; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		//taking input values of array 2
		System.out.println("enter the value for 2nd array");
		for(int p = 0; p<row2 ; p++) {
			for(int s =0 ; s<col2; s++) {
				arr1[p][s] = sc.nextInt();
				
			}
		}
		//Giving output
		for(int i = 0; i<row1; i++) {
			for(int j = 0; j<col1; j++) {
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.println();
		}
		System.out.println();
		for(int p = 0; p<row2 ; p++) {
			for(int s = 0; s<col2; s++) {
				System.out.print(arr1[p][s]+ " ");
				
			}
			System.out.println();
			
		}
		
		
	}

}
