package ec.edu.espol.workshops;

import java.util.Scanner;

/**
 * @author ispovala
 *
 */
//Clase principal CarInsurance
public class CarInsurance {
/* Subclase Customer que contiene los 4 atributos requeridos
 * la edad, sexo, si esta casado o no, y el numero de licencia.
 */
public class Customer {

	private int age;
	private char sex;
	private boolean married;
	private String driverLicense;

	public int getAge() {
		return this.age;
	}

	private CarInsurance() {
	}

	/**
	 * @author ispovala
	 *
	 */
	public class Customer {

		/**
		 * AGE OF THE COSTUMER
		 */
		private int age;
		/**
		 * SEX OF THE COSTUMER
		 */
		private char sex;
		/**
		 * IS THE COSTUMER MARRIED
		 */
		private boolean married;
		/**
		 * 10 DIGITS DRIVER LICENSE OF THE COSTUMER
		 */
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

		public String getDriverLicense() {
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

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Premium Car Insurance Calculator\n" + "Enter customer information\n" + "Age:");
		String age = sc.nextLine();
		boolean validAge = isNumeric(age);
		while (!validAge) {
			System.out.print("Enter an valid number for age:");
			age = sc.nextLine();
			validAge = isNumeric(age);
		}
		boolean isOlder = Integer.valueOf(age) > 80;
		if (isOlder) {
			System.out.print("sorry, premium car insurance is not available for 80 years older");
			return;
		}

		System.out.print("Sex [M/F] :");
		String sex = sc.nextLine();
		boolean validSex = "M".equalsIgnoreCase(sex) || "F".equalsIgnoreCase(sex);
		while (!validSex) {
			System.out.print("Enter an correct sex [M/F]:");
			sex = sc.nextLine();
			validSex = "M".equalsIgnoreCase(sex) || "F".equalsIgnoreCase(sex);
		}

		System.out.print("Is married? [Y/N]:");
		String yOrN = sc.nextLine();
		boolean validMarried = "Y".equalsIgnoreCase(yOrN) || "N".equalsIgnoreCase(yOrN);
		while (!validMarried) {
			System.out.print("Enter an correct answer for married [Y/N]:");
			yOrN = sc.nextLine();
			validMarried = "Y".equalsIgnoreCase(yOrN) || "N".equalsIgnoreCase(yOrN);
		}
		boolean married = "Y".equalsIgnoreCase(yOrN);

		System.out.print("Driving License [ten digits]:");
		String license = sc.nextLine();
		boolean validLicense = isNumeric(license) && license.length() == 10;
		while (!validLicense) {
			System.out.print("Come on, Driving License [ten digits]:");
			license = sc.nextLine();
			validLicense = isNumeric(license) && license.length() == 10;
		}
		sc.close();

		int total = 500;
		boolean isYounger = Integer.valueOf(age) < 25;
		boolean isMale = "M".equalsIgnoreCase(sex);
		if (isMale && !married && isYounger) {
			total += 1500;
		} else if (!isMale || married) {
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
