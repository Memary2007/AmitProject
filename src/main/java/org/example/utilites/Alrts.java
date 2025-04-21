package org.example.utilites;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Alrts {

    Alert alrt;


    public Alrts(WebDriver driver) {



        this.alrt = driver.switchTo().alert();

    }
    public String getText(){

       return this.alrt.getText();

    }

    public void accept (){

        this.alrt.accept();
    }
}
