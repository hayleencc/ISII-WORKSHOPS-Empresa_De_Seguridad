package ec.edu.espol.workshops;
import java.util.Scanner;

/**
 * @author ispovala
 *
 */
public class CarInsurance {
	private int age;
    /**
     * SEX OF THE COSTUMER
     */
    private String sex;
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

        

    }
    
    public String getPremium() {
    	
    	
        boolean isOlder = Integer.valueOf(this.age) > 80;
        
        
        int total = 500;
        boolean isYounger = Integer.valueOf(this.age) < 25;
        boolean isMale = "M".equalsIgnoreCase(this.sex);
        if(isOlder || driverLicense.length() != 10) {
        	return "0";
        }
        if (isMale && !this.married && isYounger) {
            total += 1500;
        } else if (!isMale || this.married) {
            total -= 200;
        }
        if (Integer.valueOf(this.age) >= 45 && Integer.valueOf(this.age) < 65) {
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