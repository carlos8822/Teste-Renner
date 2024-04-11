package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class EfetuarCompra {
    WebDriver robo;

    String ShoppingCart = "shopping_cart_container"; //classname
    String BtnCheckUot = "//*[@class='btn_action checkout_button']"; //Xpath
    String FistName = "//*[@id='first-name']"; //Xpath
    String LastName = "last-name"; //id
    String CEP = "postal-code"; //id
    String BtnContinue = "//*[@class='btn_primary cart_button']"; //Xpath
    String BtnFinish = "//*[@class='btn_action cart_button']";  //xpath
    String ValidacaoComprado = "//*[@class='complete-header']";

    public EfetuarCompra(WebDriver driver) {

        this.robo = driver;

    }

    public void Car(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        robo.findElement(By.className(ShoppingCart)).click();

    }

    public void BtnCheck(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        robo.findElement(By.xpath(BtnCheckUot)).click();

    }

    public void FistName(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        robo.findElement(By.xpath(FistName)).sendKeys("Carlos");

    }

    public void LastName(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        robo.findElement(By.id(LastName)).sendKeys("Ferreira");

    }

    public void CEP(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        robo.findElement(By.id(CEP)).sendKeys("61932-250");

    }

    public void BtnContinue(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        robo.findElement(By.xpath(BtnContinue)).click();

    }

    public void BtnFinish(){

        robo.findElement(By.xpath(BtnFinish)).click();


    }

    public void ValidaçaoCompraConcluida(){


        String Comprado = robo.findElement(By.xpath(ValidacaoComprado)).getText();
        Assert.assertEquals("THANK YOU FOR YOUR ORDER",Comprado);
        System.out.println("3° Produto comprado com sucesso!");
        robo.quit();

    }

}

