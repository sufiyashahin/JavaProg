package array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {10,20,30,40,50};
		int b [] = {60,70,80,90,95};
		
		int c [] = new int[a.length];
		
		for (int i = 0; i<a.length; i++) {
			c[i] = a[i]+b[i];
			
			System.out.println(c[i]);
		}

	}

}
