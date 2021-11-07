package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class StepsDefs {
	private String actualAnswer;	
	private int m_age=18;
	
	public CarInsurance carInsurance = new CarInsurance();
	
	
	@Given("The customer has 21 years old, is single and female, and her license is 1904002349")
	public void good_age() {
		carInsurance.setAge(21);
		carInsurance.setMarried(false);
		carInsurance.setSex("F");
		carInsurance.setDriverLicense("1904002349");
	}
		
	@When("We Calculate the premium car insurance")
	public void calculate_premium1() {
		actualAnswer = carInsurance.getPremium();
	}
	@Then("We should receive: Premium Car Insurance: $300")
	public void receive1() {
		assertEquals("300", actualAnswer);
	}
	
	
		
	@Given("The customer has 81 years old, is single and female, and her license is 1904002349")
	public void advanced_age() {
		carInsurance.setAge(81);
		carInsurance.setMarried(false);
		carInsurance.setSex("F");
		carInsurance.setDriverLicense("1904002349");
	}
		
	@When("The customer gives her age")
	public void calculate_premium2() {
		actualAnswer = carInsurance.getPremium();
	}
	@Then("We should receive: I should be told sorry, premium car insurance is not available for 80 years older ")
	public void receive2() {
		assertEquals("0", actualAnswer);
	}
	
	
	

	@Given("The customer has 50 years old, is single and female, and her license is 190400234")
	public void good_age3() {
		carInsurance.setAge(50);
		carInsurance.setMarried(false);
		carInsurance.setSex("F");
		carInsurance.setDriverLicense("190400234");
	}
		
	@When("The customer Enter driver’s license number")
	public void calculate_premium3() {
		actualAnswer = carInsurance.getPremium();
	}
	@Then("I should be told Come on, Driving License [ten digits]: ")
	public void receive3() {
		assertEquals("0", actualAnswer);
	}
	
	
	
	
	@Given("The customer has 24 years old, is single and male, and his license is 1904002345")
	public void good_age4() {
		carInsurance.setAge(24);
		carInsurance.setMarried(false);
		carInsurance.setSex("M");
		carInsurance.setDriverLicense("1904002345");
	}
		
	@When("The customer Calculates the premium car insurance")
	public void calculate_premium4() {
		actualAnswer = carInsurance.getPremium();
	}
	@Then("I should be told Premium Car Insurance: $2000 ")
	public void receive4() {
		assertEquals("2000", actualAnswer);
	}

}