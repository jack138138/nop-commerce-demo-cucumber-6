package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {

    @Given("i am on homepage")
    public void iAmOnHomepage() {
    }


    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the Registration Link")
    public void iShouldSeeTheRegistrationLink() {
        new RegisterPage().verifyRegisterText();
    }

    @When("I click  on REGISTER button")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }



    @Then("I should see the error message that {string}")
    public void iShouldSeeTheErrorMessageThat(String firstNameError) {
        Assert.assertEquals(new RegisterPage().verifyFirstNameError(),"First name is required.", "FirstName not verified" );

    }

    @And("I should see the error message that is {string}")
    public void iShouldSeeTheErrorMessageThatIs(String lastName) {
        Assert.assertEquals(new RegisterPage().verifyLastNameError(), "Last name is required.", "LastNAme not verified");

    }


    @And("I should see the error message thatE {string}")
    public void iShouldSeeTheErrorMessageThatE(String EmailError) {
       Assert.assertEquals(new RegisterPage().verifyEmailError(),"Email is required.", "Email not Verified" );
    }



    @And("I should see the error message thatpw  {string}")
    public void iShouldSeeTheErrorMessageThatpw(String passwordError) {
     Assert.assertEquals(new RegisterPage().verifyPasswordError(),"Password is required.", "Password not verified" );
    }

    @And("I should see the error message thatpwr {string}")
    public void iShouldSeeTheErrorMessageThatpwr(String ConfirmPWError) {
        Assert.assertEquals(new RegisterPage().verifyConfirmPasswordError(),"Password is required.", "confirm password not verified" );

    }


    @When("I select gender {string}")
    public void i_select_gender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I enter firstname {string}")
    public void iEnterFirstname(String firstName) {
        new RegisterPage().enterFirstName(firstName);

    }

    @And("I enter lastname {string}")
    public void iEnterLastname(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("I select date of birth day {string}")
    public void iSelectDateOfBirthDay(String dateOfBirth) {
      new  RegisterPage().dateOfBirthDay(dateOfBirth);
    }

    @And("I select date of birth month {string}")
    public void iSelectDateOfBirthMonth(String dateOfMonth) {
        new RegisterPage().dateOfBirthMonth(dateOfMonth);
    }

    @And("I select date of birth year {string}")
    public void iSelectDateOfBirthYear(String dateOfYear) {
        new RegisterPage().dateOfBirthYear(dateOfYear);
    }

    @And("I enter the email address {string}")
    public void iEnterTheEmailAddress(String email) {
        new RegisterPage().enterEmail(email);

    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter the confirm password {string}")
    public void iEnterTheConfirmPassword(String confirmPW) {
        new RegisterPage().enterConfirmPassword(confirmPW);
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String registrationComplate) {
        new RegisterPage().verifyRegistrationCompleteMessage();

    }



}


//    @And("I enters following users details")
//    public void iEntersFollowingUsersDetails(DataTable dataTable) {
//        List<List<String>> userList = dataTable.asLists(String.class);
//        for (List<String> user : userList) {
//            System.out.println(user);
//        }
//  }



