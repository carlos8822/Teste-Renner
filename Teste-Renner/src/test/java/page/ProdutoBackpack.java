package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoBackpack {
    WebDriver robo;

    String Backpack = "item_4_img_link"; //id
    String AddInCAR = "btn_primary btn_inventory"; //classname

    String BtnContinue = "bto_primary cart_button"; //classname

    public ProdutoBackpack(WebDriver driver) {

        this.robo = driver;

    }

    public void ViewProduct(){

        robo.findElement(By.id(Backpack)).click();

    }

    public void AdcProductInCar(){

        robo.findElement(By.className(AddInCAR)).click();

    }



}

