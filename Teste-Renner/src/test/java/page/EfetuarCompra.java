package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EfetuarCompra {
    WebDriver robo;

    String ShoppingCart = "shopping_cart_container"; //classname
    String BtnCheckUot = "btn_action checkout_button"; //classname
    String Fistname = "fist_name"; //id
    String Lastname = "last_name"; //id
    String Cep = "postal_code"; //id

    public EfetuarCompra(WebDriver driver) {

        this.robo = driver;

    }

    public void Car(){

        robo.findElement(By.className(ShoppingCart)).click();

    }

    public void Btncheck(){

        robo.findElement(By.className(BtnCheckUot)).click();

    }

    public void Fistname(){

        robo.findElement(By.id(Fistname)).sendKeys("Carlos");

    }

    public void Lastname(){

        robo.findElement(By.id(Lastname)).sendKeys("Ferreira");

    }

    public void Cep(){

        robo.findElement(By.id(Cep)).sendKeys("61932-250");

    }

}

