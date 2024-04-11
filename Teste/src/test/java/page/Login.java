package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Login {
    WebDriver robo;

    String USERNAME = "user-name";
    String SENHA = "password";
    String URL = "https://www.saucedemo.com/v1/";
    String BOTAO = "login-button";

    public Login(WebDriver driver) {

        this.robo = driver;

    }


    public void LoginPage(){


        robo.get(URL);
        robo.manage().window().maximize();
        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void UserName(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        robo.findElement(By.id(USERNAME)).sendKeys("standard_user");

    }

    public void Senha(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        robo.findElement(By.id(SENHA)).sendKeys("secret_sauce");

    }

    public void Botao(){

        robo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        robo.findElement(By.id(BOTAO)).click();

    }

    public void ValidacaoLogado() {

        String logado = robo.findElement(By.className("product_label")).getText();
        Assert.assertEquals("Products",logado);
        System.out.println("1° Login efetuado com sucesso!");

    }

}

