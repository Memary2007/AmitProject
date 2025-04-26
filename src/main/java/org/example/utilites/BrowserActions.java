package org.example.utilites;

import org.openqa.selenium.WebDriver;

public class BrowserActions {
    WebDriver driver;

    public BrowserActions (WebDriver driver){
        this.driver=driver;


    }

    public void  navagiteTo(String URL){
      driver.navigate().to(URL);

    }

    public void navagiteBack(){
       driver.navigate().back();

    }
}
