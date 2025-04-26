package org.exmple.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

public class CartPage {
    WebDriver driver;
    WebDriverWait driverWait;
    public CartPage(WebDriver drive){
     this.driver=drive;
     this.driverWait=new WebDriverWait(driver, Duration.ofSeconds(10));


    }
//Cart Base Page
    private static final By ProductOnePrice =new By.ByXPath("//td[text()=\"Sony vaio i5\"]/following-sibling::td");
    private static final By ProductOneName =new By.ByXPath("//td[text()=\"Sony vaio i5\"]");
    private static final By ProductTwoPrice =new By.ByXPath("//td[contains(text(),\"Sony vaio i7\")]/following-sibling::td");
    private static final By ProductTwoName =new By.ByXPath("//td[contains(text(),\"Sony vaio i7\")]");
    private static final By TotalAmountCalc =new By.ById("totalp");
    private static final By placeOrderButton =new By.ByCssSelector("button[data-target=\"#orderModal\"]");
//Place Order Form
    private static final By orderFormTotalAmount=new By.ById("totalm");
    private static final By ordereFormNameField=new By.ById("name");
    private static final By orderFormCountryField=new By.ById("country");
    private static final By orderFormCityField=new By.ById("city");
    private static final By orderFormCreditField=new By.ById("card");
    private static final By orderFormMonthField=new By.ById("month");
    private static final By orderFormYearField=new By.ById("year");
    private static final By purchaseButton=new By.ByCssSelector("button[onclick=\"purchaseOrder()\"]");
    // confirmationpurchase mesage
    private static final By purchaseConfirmationMessage=new By.ByCssSelector("div.sweet-alert h2");
public String getProductName(String product){
    String name="";
    if (product.equals("Sony vaio i5")){
        driverWait.until(ExpectedConditions.presenceOfElementLocated(ProductOneName));
        name= driver.findElement(ProductOneName).getText();
    }
    else if (product.equals("Sony vaio i7")){
        driverWait.until(ExpectedConditions.presenceOfElementLocated(ProductTwoName));
        name= driver.findElement(ProductTwoName).getText();
    }
    return  name;
}
public String getProductPrice(String product){
    String price="";
    if (product.equals("Sony vaio i5")){
        driverWait.until(ExpectedConditions.presenceOfElementLocated(ProductOnePrice));
        price= driver.findElement(ProductOnePrice).getText();
    }
    else if (product.equals("Sony vaio i7")){
        driverWait.until(ExpectedConditions.presenceOfElementLocated(ProductTwoPrice));
        price= driver.findElement(ProductTwoPrice).getText();
    }
    return  price;
}
public String getTotalAmountCalc(){
    return driver.findElement(TotalAmountCalc).getText();

}
public  void clickPlaceOrderButton(){
    driver.findElement(placeOrderButton).click();
}
//order form
    public String getTotalAMountFromOrderForm(){
        driverWait.until(ExpectedConditions.textToBePresentInElementLocated(orderFormTotalAmount, "Total:"));
        return driver.findElement(orderFormTotalAmount).getText().replace("Total: ","");

    }

    public void enterName(String name){
    driver.findElement(ordereFormNameField).sendKeys(name);
    }
    public void enterCity(String city){
    driver.findElement(orderFormCityField).sendKeys(city);
    }
    public void enterCountry(String country){
    driver.findElement(orderFormCountryField).sendKeys(country);
    }
    public void enterCredit(String credit){
    driver.findElement(orderFormCreditField).sendKeys(credit);
    }
    public void enterMonth(String month){
    driver.findElement(orderFormMonthField).sendKeys(month);
    }
    public void enterYear(String year){
    driver.findElement(orderFormYearField).sendKeys(year);
    }
    public  void clickPurchaseButtonFromOrderForm(){
        driver.findElement(purchaseButton).click();
    }
    //Confirmation messsage
    public String getConfirmationMessage(){
    driverWait.until(ExpectedConditions.presenceOfElementLocated(purchaseConfirmationMessage));
    return driver.findElement(purchaseConfirmationMessage).getText();
    }
}

