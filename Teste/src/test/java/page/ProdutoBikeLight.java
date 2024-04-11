package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ProdutoBikeLight {
    WebDriver robo;

    String BikeLight = "//*[@id='item_0_title_link']"; //id
    String AddInCAR = "//*[@class='btn_primary btn_inventory']"; //classname

    String BtnContinue = "bto_primary cart_button"; //classname

    public ProdutoBikeLight(WebDriver driver) {

        this.robo = driver;

    }

    public void ViewProduct3(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        robo.findElement(By.xpath(BikeLight)).click();

    }


    public void AdcProductInCar3(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        robo.findElement(By.xpath(AddInCAR)).click();

    }

    public void ValidaçãoCarrinho3() {

        String AddInCar = robo.findElement(By.xpath("//*[@class='btn_secondary btn_inventory']")).getText();
        Assert.assertEquals("REMOVE", AddInCar);
        System.out.println("2° Produto adicionado ao carinho de compras com sucesso!");

    }

}

