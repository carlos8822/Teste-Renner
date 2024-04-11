package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ProdutoBackPack {
    WebDriver robo;

    String BackPack = "//*[@id='item_4_title_link']";; //id
    String AddInCAR = "//*[@class='btn_primary btn_inventory']"; //xpath

    public ProdutoBackPack(WebDriver driver) {

        this.robo = driver;

    }

    public void ViewProduct2(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        robo.findElement(By.xpath(BackPack)).click();

    }

    public void AdcProductInCar2(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        robo.findElement(By.xpath(AddInCAR)).click();

    }

    public void ValidaçãoCarrinho2() {

        String AddInCar = robo.findElement(By.xpath("//*[@class='btn_secondary btn_inventory']")).getText();
        Assert.assertEquals("REMOVE", AddInCar);
        System.out.println("2° Produto adicionado ao carinho de compras com sucesso!");

    }

}

