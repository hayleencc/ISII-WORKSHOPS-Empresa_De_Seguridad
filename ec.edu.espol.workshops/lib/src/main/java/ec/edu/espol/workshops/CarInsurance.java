package ec.edu.espol.workshops;
import java.util.Scanner;

/**
 * @author ispovala
 *
 */
public class CarInsurance {
	private static int age;
    /**
     * SEX OF THE COSTUMER
     */
    private static String sex;
    /**
     * IS THE COSTUMER MARRIED
     */
    private static boolean married;
    /**
     * 10 DIGITS DRIVER LICENSE OF THE COSTUMER
     */
    private static String driverLicense;

    public int getAge() {
        return this.age;
    }

    public String getSex() {
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

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
    
    public CarInsurance() {
    }

    /**
     * @author ispovala
     *
     */
    public class Customer {

        /**
         * AGE OF THE COSTUMER
         */
        
    }

    /**
     * @param args
     */
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Premium Car Insurance Calculator\n" + "Enter customer information\n" + "Age:");
        String age2 = sc.nextLine();
        boolean validAge = isNumeric(age2);
        while (!validAge) {
            System.out.print("Enter an valid number for age:");
            age2 = sc.nextLine();
            validAge = isNumeric(age2);
        }
        age=Integer.valueOf(age2);
        boolean isOlder = Integer.valueOf(age) > 80;
        if (isOlder) {
            System.out.print("sorry, premium car insurance is not available for 80 years older");
            return;
        }

        System.out.print("Sex [M/F] :");
        String sex2 = sc.nextLine();
        boolean validSex = "M".equalsIgnoreCase(sex2) || "F".equalsIgnoreCase(sex2);
        while (!validSex) {
            System.out.print("Enter an correct sex [M/F]:");
            sex2 = sc.nextLine();
            validSex = "M".equalsIgnoreCase(sex2) || "F".equalsIgnoreCase(sex2);
        }
        sex=sex2;

        System.out.print("Is married? [Y/N]:");
        String yOrN = sc.nextLine();
        boolean validMarried = "Y".equalsIgnoreCase(yOrN) || "N".equalsIgnoreCase(yOrN);
        while (!validMarried) {
            System.out.print("Enter an correct answer for married [Y/N]:");
            yOrN = sc.nextLine();
            validMarried = "Y".equalsIgnoreCase(yOrN) || "N".equalsIgnoreCase(yOrN);
        }
        boolean married2 = "Y".equalsIgnoreCase(yOrN);
        married=married2;

        System.out.print("Driving License [ten digits]:");
        String license2 = sc.nextLine();
        boolean validLicense = isNumeric(license2) && license2.length() == 10;
        while (!validLicense) {
            System.out.print("Come on, Driving License [ten digits]:");
            license2 = sc.nextLine();
            validLicense = isNumeric(license2) && license2.length() == 10;
        }
        sc.close();
        driverLicense=license2;
        if (validLicense){
        	String total=getPremium();
        	System.out.println("");
            System.out.println("Premium Car Insurance:");
            System.out.println("$"+total);
            System.out.println("");
        	 
        }

        

    }
    
    public static String getPremium() {
    	
    	
        boolean isOlder = Integer.valueOf(age) > 80;
        
        
        int total = 500;
        boolean isYounger = Integer.valueOf(age) < 25;
        boolean isMale = "M".equalsIgnoreCase(sex);
        if(isOlder || driverLicense.length() != 10) {
        	return "0";
        	//total= 0;
        }
        if (isMale && !married && isYounger) {
            total += 1500;
        } else if (!isMale || married) {
            total -= 200;
        }
        if (Integer.valueOf(age) >= 45 && Integer.valueOf(age) < 65) {
            total -= 100;
        }
        

        return String.valueOf(total);
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