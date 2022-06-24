package Java;

public class LargestOf4Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		if(a>b && a>c &a>d) {
			System.out.println("a is greatest");
		}
		else if(b>a && b>c && b>d){
			System.out.println("b is greatest");
		}
		else if(c>a && c>b && c>d) {
			System.out.println("c is greatest");
		}
		else {
			System.out.println("d is greatest ");
		}
		

	}

}
