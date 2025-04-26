package org.exmple.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home {
    WebDriver driver;
    WebDriverWait wait;
    private static final By homePageSignUpButton = new By.ById("signin2");
    private static final By signUpUserFiled = new By.ById("sign-username");
    private static final By SignUpPasswordFiled = new By.ById("sign-password");
    private static final By SignUpButtonClickable = new By.ByCssSelector("button[onclick=\"register()\"]");
    private static final By homePageLogInButton = new By.ById("login2");
    private static final By LogInUserFiled = new By.ById("loginusername");
    private static final By LogInPasswordFiled = new By.ById("loginpassword");
    private static final By LogInButtonClickable = new By.ByCssSelector("Button[onclick='logIn()']");
    private static final By userProfileLink = new By.ById("nameofuser");
    private static final By notebookCatgoryLink = new By.ByCssSelector("a[onclick=\"byCat('notebook')\"]");
    private static final By productOnePage = new By.ByLinkText("Sony vaio i5");
    private static final By productTwoPage = new By.ByLinkText("Sony vaio i7");
    private  static  final By cartPageLink =new By.ById("cartur");

    public Home(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //signup Action
    public void enterUserNameSignUp(String userName) {
        wait.until(ExpectedConditions.elementToBeClickable(signUpUserFiled));
        driver.findElement(signUpUserFiled).sendKeys(userName);
    }

    public void clickOnHomeSignUpButton() {
        driver.findElement(homePageSignUpButton).click();
    }

    public void enterPasswordSignUp(String password) {
        driver.findElement(SignUpPasswordFiled).sendKeys(password);
    }

    public void clickSignUpButton() {

        driver.findElement(SignUpButtonClickable).click();

    }

    //login Action
    public void enterUserNameLogIn(String userName) {
        wait.until(ExpectedConditions.elementToBeClickable(LogInUserFiled));
        driver.findElement(LogInUserFiled).sendKeys(userName);
    }

    public void clickOnHomeLogInButton() {
        driver.findElement(homePageLogInButton).click();
    }

    public void enterPasswordLogIn(String password) {
        driver.findElement(LogInPasswordFiled).sendKeys(password);
    }

    public void clickLoginButton() {

        driver.findElement(LogInButtonClickable).click();

    }

    public String getLogedInUserName() {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(userProfileLink, "Welcome"));
        return driver.findElement(userProfileLink).getText();

    }
    //CatagoryMethod

    public void clickNotebookCatgoryLink() {
        driver.findElement(notebookCatgoryLink).click();

    }

    public void clickProductOnePageLink() {
        driver.findElement(productOnePage).click();
    }

    public void clickProductTwoPageLink() {
        driver.findElement(productTwoPage).click();
    }
    public void clickOnCartLink(){
        driver.findElement(cartPageLink).click();
    }
}
