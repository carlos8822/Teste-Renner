package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoTshirt {
    WebDriver robo;

    String Tshirt = "item_1_title_link"; //id
    String AddInCAR = "btn_primary btn_inventory"; //classname

    String BtnContinue = "bto_primary cart_button"; //classname

    public ProdutoTshirt(WebDriver driver) {

        this.robo = driver;

    }

    public void ViewProduct(){

        robo.findElement(By.id(Tshirt)).click();

    }

    public void AdcProductInCar(){

        robo.findElement(By.className(AddInCAR)).click();

    }



}

