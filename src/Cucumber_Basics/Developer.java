package Cucumber_Basics;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Developer {
	
	
	@Given("^Iam a \"([a-zA-Z]{1,})\" developer$")
	public void Iam_a_CoreJava_developer(String developerType){
		System.out.println("-------------------------------");
		System.out.println("@Given--Iam a "+developerType+" developer");
	
	}
		
	@When("^I started development$")
	public void When_I_started_development(){
		System.out.println("@When--I started development");
			
	}
	
	@Then("^I created \"([a-zA-Z]{1,})\" Java program$")
	public void I_created_simple_Java_program(String codeType){
		
		System.out.println("@Then--I created "+codeType+" program");	
	}
	
	@And("^Iam \"([a-zA-Z]{1,})\" experienced$")
	public void Iam_not_experienced(String experienceLevel){
		System.out.println("@And--Iam "+experienceLevel+" experienced");
	}
	
	@But("^My boss is \"([a-zA-Z]{1,})\" satisfied$")
	public void My_boss_is_still_satisfied(String satisfactionType){
		System.out.println("My boss is "+satisfactionType+" satisfied");
	}
	
	
	

}




