package org.exmple.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utilites.Alrts;
import org.example.utilites.BrowserActions;
import org.exmple.pages.CartPage;
import org.exmple.pages.Home;
import org.exmple.pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SignUpStepDefs {
   WebDriver driver=Hooks.driver;
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    Home homepage=new Home(driver);
    ProductPage productPage =new ProductPage(driver);
    CartPage cartPage =new CartPage(driver);
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

    @When("Clicking Catagory Laptops")
    public void clickingCatagory() {
        homepage.clickNotebookCatgoryLink();
    }

    @And("select items {string}")
    public void selectItems(String itemName) {
        if (itemName.equals("Sony vaio i5"))
        {
            homepage.clickProductOnePageLink();
        } else if (itemName.equals("Sony vaio i7")) {
            homepage.clickProductTwoPageLink();
        }
    }

    @And("Add Product To Cart from Product page")
    public void addProductToCartFromProductPage() {

    productPage.clickAddToCartButton();
    }

    @And("Navagite Back")
    public void navagiteBack() {
        new BrowserActions(driver).navagiteBack();
    }

    @When("Accept Alrt")
    public void acceptAlrt() {
        new Alrts(driver).accept();
    }

    @And("Click On Cart Page Link")
    public void clickOnCartPageLink() {
        homepage.clickOnCartLink();
    }

    @Then("Check item {string} name and price to be {string}")
    public void checkItemNameAndPriceToBe(String name, String price) {
        Assert.assertEquals(cartPage.getProductName(name),name);
        Assert.assertEquals(cartPage.getProductPrice(name),price);
    }

    @And("check total calculated amount is equal to {string}")
    public void checkTotalCalculatedAmountIsEqualTo(String expectedPrice) {
        Assert.assertEquals(cartPage.getTotalAmountCalc(),expectedPrice);
    }

    @When("click on place order button")
    public void clickOnPlaceOrderButton() {
        cartPage.clickPlaceOrderButton();
    }


    @Then("check total calculated amount from order form is equal to {string}")
    public void checkTotalCalculatedAmountFromOrderFormIsEqualTo(String excepectedAmount ) {

        Assert.assertEquals(cartPage.getTotalAMountFromOrderForm(),excepectedAmount );
    }

    @When("enter name {string}")
    public void enterName(String name) {
        cartPage.enterName(name);
    }

    @And("enter country {string}")
    public void enterCountry(String country) {
        cartPage.enterCountry(country);

    }

    @And("enter City {string}")
    public void enterCity(String City) {
        cartPage.enterCity(City);

    }

    @And("enter credit card {string}")
    public void enterCreditCard(String credit) {
        cartPage.enterCredit(credit);

    }

    @And("enter year {string}")
    public void enterYear(String year) {
        cartPage.enterYear(year);

    }

    @And("enter month {string}")
    public void enterMonth(String month) {
        cartPage.enterMonth(month);

    }

    @And("click on Purchase Button")
    public void clickOnPurchaseButton() {
        cartPage.clickPurchaseButtonFromOrderForm();

    }

    @Then("A confirmation message should be displayed: {string}")
    public void aConfirmationMessageShouldBeDisplayed(String expectedMessage) {
        Assert.assertEquals(cartPage.getConfirmationMessage(),expectedMessage);
    }
}
