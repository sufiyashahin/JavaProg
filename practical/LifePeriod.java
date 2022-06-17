package PratikJava;

public class LifePeriod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 30;
		
		if(age>=1 && age<=10) {
			System.out.println("childhood");
		}
		else if(age>=11 && age<=16) {
			System.out.println("Adolenscence");
		}
		else if (age>=17 && age<=19) {
			System.out.println("Teenager");
		}
		else if(age>=20 && age<24) {
			System.out.println("young adult");
		}
		else if (age>=25 && age<=35) {
			System.out.println("adult");
		}
		else if(age>=36 && age<=45) {
			System.out.println("Middle age");
		}
		else if(age>=46 && age<=60) {
			System.out.println("Late Adult");
		}
		else {
			System.out.println("Senior citizen");
		}
		

	}

}
