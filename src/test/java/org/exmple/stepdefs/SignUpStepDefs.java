package org.exmple.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utilites.Alrts;
import org.exmple.pages.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SignUpStepDefs {
   WebDriver driver=Hooks.driver;
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    Home homepage=new Home(driver);
    //sign Up page
    @Given("Clicking Sign up button in the Header")
    public void ClickSignUpButtonInTheHeader(){
        homepage.clickOnHomeSignUpButton();

    }
    @When("Fill in the username {string}")
    public void fillInTheUsername(String userName) {
        homepage.enterUserNameSignUp(userName);
    }
    @And("Fill in the Password {string}")
    public void fillInThePassword(String password) {
        homepage.enterPasswordSignUp(password);
    }
    @And("Clicking Sign up button")
    public void clickingSignUpButton()
    {
        homepage.clickSignUpButton();
    }
    @Then("A success message should be displayed: {string}")
    public void aSuccessMessageShouldBeDisplayed(String successMessage) {
        wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(new Alrts(driver).getText(),successMessage);
    }

//login page
    @Given("Clicking Log In button in the Header")
    public void clickingLogInButtonInTheHeader() {
        homepage.clickOnHomeLogInButton();
    }

    @When("Fill in the username In Login Form {string}")
    public void fillInTheUsernameInLoginForm(String username) {
        homepage.enterUserNameLogIn(username);
    }

    @And("Fill in the Password In Login Form{string}")
    public void fillInThePasswordInLoginForm(String password) {
        homepage.enterPasswordLogIn(password);
    }

    @And("Clicking Log In button")
    public void clickingLogInButton() {

        homepage.clickLoginButton();
    }

    @Then("The account should open successfully: {string}")
    public void theAccountShouldOpenSuccessfully(String logedInUserName) {
        Assert.assertEquals(homepage.getLogedInUserName(),"Welcome "+logedInUserName);
    }
}
