package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D01_registerStepDef {
//      P01_register=new P01_register();
    @Given("user go to register page")
    public void user_go_to_register_page() {
        System.out.println("passes");

    }
    @When("user select gender type")
    public void user_select_gender_type() {
        System.out.println("well done");

    }
    @And("user enter first name\"automation\"and last name\"tester\"")
    public void user_enter_first_name_automation_and_last_name_tester() {
    }
    @And("user enter date of birth")
    public void user_enter_date_of_birth() {
    }
    @And("user enter email \"test@example.com\"field")
    public void user_enter_email_test_example_com_field() {
    }
    @And("user fills Password fields {string} {string}")
    public void user_fills_password_fields(String string, String string2) {

    }
    @And("user clicks on register button")
    public void user_clicks_on_register_button() {

    }
    @Then("success message is displayed")
    public void success_message_is_displayed() {

    }





}
