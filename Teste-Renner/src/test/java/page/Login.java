package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Set;

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

    }

    public void UserName(){

        robo.findElement(By.id(USERNAME)).sendKeys("standard_user");

    }

    public void Senha(){

        robo.findElement(By.id(SENHA)).sendKeys("secret_sauce");

    }

    public void Botao(){

        robo.findElement(By.id(BOTAO)).click();

    }

}

