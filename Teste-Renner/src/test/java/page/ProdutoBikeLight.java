package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoBikeLight {
    WebDriver robo;

    String BikeLight = "item_0_title_link"; //id
    String AddInCAR = "btn_primary btn_inventory"; //classname

    String BtnContinue = "bto_primary cart_button"; //classname

    public ProdutoBikeLight(WebDriver driver) {

        this.robo = driver;

    }

    public void ViewProduct(){

        robo.findElement(By.id(BikeLight)).click();

    }

    public void AdcProductInCar(){

        robo.findElement(By.className(AddInCAR)).click();

    }



}

