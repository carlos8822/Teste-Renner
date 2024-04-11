package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ProdutoTshirt {
    WebDriver robo;

    String Tshirt = "item_1_title_link"; //id
    String AddInCAR = "//*[@class='btn_primary btn_inventory']"; //classname

    String BtnContinue = "btn_primary cart_button"; //classname

    public ProdutoTshirt(WebDriver driver) {

        this.robo = driver;

    }

    public void ViewProduct1(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        robo.findElement(By.id(Tshirt)).click();

    }

    public void AdcProductInCa1(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        robo.findElement(By.xpath(AddInCAR)).click();

    }

    public void ValidaçãoCarrinho1() {

        String AddInCar = robo.findElement(By.xpath("//*[@class='btn_secondary btn_inventory']")).getText();
        Assert.assertEquals("REMOVE", AddInCar);
        System.out.println("2° Produto adicionado ao carinho de compras com sucesso!");

    }

}

