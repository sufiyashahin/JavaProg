package Java;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n =33;
	
		int a =0;
		for(int i =2 ; i<n/2; i++) {
			if (n % i==0) {
				a =1;
				break;
			}
		}
		if(a==0) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
	}
}