package ec.edu.espol.workshops;

import java.util.ArrayList;
import java.util.Scanner;

public class CarInsurance {

	public class Customer {

		private int age;
		private char sex;
		private boolean married;
		private String driverLicense;

		public int getAge() {
			return this.age;
		}

		public char getSex() {
			return this.sex;
		}

		public boolean isMarried() {
			return this.married;
		}

		public String driverLicense() {
			return this.driverLicense;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setSex(char sex) {
			this.sex = sex;
		}

		public void setMarried(boolean married) {
			this.married = married;
		}

		public void setDriverLicense(String driverLicense) {
			this.driverLicense = driverLicense;
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Premium Car Insurance Calculator");
		System.out.println("Enter customer information");

		System.out.print("Age:");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("Sex [M/F] :");
		char sex = sc.nextLine().charAt(0);

		System.out.print("Is married? [Y/N]:");
		boolean married = String.valueOf(sc.nextLine().charAt(0)).equalsIgnoreCase("y");

		System.out.print("Driving License:");
		String license = sc.nextLine();
		
		System.out.print(CarInsurance.calculateInsurance(age,sex,married,license));

	}

	public static int calculateInsurance(int age, char sex, boolean married, String license) {

		boolean validLicense = true;
		
		if (age > 80 || !validLicense) {
			return -1;
		}
		
		int total = 500;
		
		if ((sex=='m' || sex=='M') && !married && age<25 ) {
			total+=1500;
		}
		else if (sex=='f' || sex=='F' || married) {
			total -=200;
		}
		if (age>45 && age<65) {
			total -=100;
		}

		return total;
	}

}
