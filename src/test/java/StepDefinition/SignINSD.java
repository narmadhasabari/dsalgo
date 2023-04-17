package StepDefinition;

import java.io.IOException;

import PageObjectModel.BaseClass;

import PageObjectModel.SignINPOM;
import Utility.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignINSD extends BaseClass {

	@Given("The user is on the SignIn page")
    public void the_user_is_on_the_sign_in_page() {
		Sp = new SignINPOM(Helper.getDriver());
	}
	
	@When("The user fills the form with the data from sheet {string} and clicks LoginButton")
	public void the_user_fills_the_form_with_the_data_from_sheet_and_clicks_login_button(String WorkSheetName) throws IOException, InterruptedException {
		Sp.FillSignInForm(WorkSheetName);
	}

	@Then("The user sign in successfully")
	public void the_user_sign_in_successfully() {
	    Sp.checkSuccessMsg();
	}
}