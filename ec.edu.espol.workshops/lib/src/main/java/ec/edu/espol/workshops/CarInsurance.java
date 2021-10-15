package ec.edu.espol.workshops;

public class CarInsurance {
	private String age;
	private String sex;
	private String maritalStatus;
	
	final int minimo = 1000;
	
	
	public String getAge() {
	    return age;
	  }
	
	public String getSex() {
	    return sex;
	  }
	
	public String getMaritalStatus() {
	    return maritalStatus;
	  }
	
	public void setAge(String age)
    {
            this.age = age;
    }
	
	public void setSex(String sex)
    {
            this.sex = sex;
    }
	
	public void setMaritalStatus(String maritalStatus)
    {
            this.maritalStatus = maritalStatus;
    }
}


