package org.exmple.pages;

import org.exmple.stepdefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;
    private static final By addToCartButton =new By.ByCssSelector("a.btn-success");
    public ProductPage(WebDriver driver){
        this.driver=driver;
        wait =new WebDriverWait(this.driver, Duration.ofSeconds(10));

    }
    public void clickAddToCartButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(addToCartButton));
        driver.findElement(addToCartButton).click();
    }
}
