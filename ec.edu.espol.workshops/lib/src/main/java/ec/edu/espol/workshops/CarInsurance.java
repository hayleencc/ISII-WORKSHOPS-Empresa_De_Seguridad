package ec.edu.espol.workshops;

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
		String age = sc.nextLine();
		boolean validAge = isNumeric(age);
		while (!validAge) {
			System.out.print("Enter an valid number for age:");
			age = sc.nextLine();
			validAge = isNumeric(age);
		}
		if (Integer.valueOf(age) > 80) {
			System.out.print("sorry, premium car insurance is not available for 80 years older");
			return;
		}
		

		System.out.print("Sex [M/F] :");
		String sex = sc.nextLine();
		boolean validSex = sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("F");
		while (!validSex) {
			System.out.print("Enter an correct sex [M/F]:");
			sex = sc.nextLine();		
			validSex = sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("F");
		}
		

		System.out.print("Is married? [Y/N]:");
		String yOrN = sc.nextLine();
		boolean validMarried = yOrN.equalsIgnoreCase("Y") || yOrN.equalsIgnoreCase("N");
		while (!validMarried) {
			System.out.print("Enter an correct answer for married [Y/N]:");
			yOrN =  sc.nextLine();
			validMarried = yOrN.equalsIgnoreCase("Y") || yOrN.equalsIgnoreCase("N");
		}
		boolean married =  yOrN.equalsIgnoreCase("Y");
		

		System.out.print("Driving License [ten digits]:");
		String license = sc.nextLine();
		boolean validLicense = isNumeric(license) && license.length() == 10;
		while (!validLicense) {
			System.out.print("Come on, Driving License [ten digits]:");
			license = sc.nextLine();
			validLicense = isNumeric(license) && license.length() == 10;
		}
		

		int total = 500;
		if (sex.equalsIgnoreCase("m") && !married && Integer.valueOf(age) < 25) {
			total += 1500;
		} else if (sex.equalsIgnoreCase("f") || married) {
			total -= 200;
		}
		if (Integer.valueOf(age) > 45 && Integer.valueOf(age) < 65) {
			total -= 100;
		}
		System.out.print(total);

	}

	private static boolean isNumeric(String license) {
		try {
			Long.parseLong(license);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

}
