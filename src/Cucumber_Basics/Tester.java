package Cucumber_Basics;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tester {
	
	@Given("^Iam a \"([a-zA-Z]{1,})\" tester$")
	public void Iam_a_Manual_tester(String testerType, DataTable table){
		System.out.println("-------------------------------");
		 List<Map<String, String>> data = table.asMaps(String.class, String.class);
		//List<Map<String,String>> data = 
		System.out.println("@Given--Iam a "+testerType+" tester "+ " current location: " +data.get(0).get("Location")+ "  current position: " + data.get(1).get("Position"));
	}
	
	@When("^I apply for a job$")
	public void I_apply_for_a_job(){
		System.out.println("@When--I apply for a job");
	}
	
	@Then("^I got a \"([a-zA-Z]{1,})\" paid job$")
	public void I_got_a_less_paid_job(String salaryType){
		System.out.println("@Then--I got a "+salaryType+" paid job");
	}
	
	@And("^Iam \"([a-zA-Z]{1,})\" satisfied with my salary$")
	public void Iam_not_satisfied_with_my_salary(String satisfactionType){
		System.out.println("@And--Iam "+satisfactionType +" satisfied with my salary");
	}
	
	@But("^My parents are \"([a-zA-Z]{1,})\" satisfied$")
	public void My_parents_are_fairly_satisfied(String parentsView){
		System.out.println("@But - My parents are "+parentsView +" satisfied ");
	}
}
