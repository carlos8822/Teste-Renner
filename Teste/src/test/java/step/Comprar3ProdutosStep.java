package step;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.EfetuarCompra;
import page.Login;
import page.ProdutoTshirt;
import page.ProdutoBikeLight;
import page.ProdutoBackPack;

import java.util.concurrent.TimeUnit;

public class Comprar3ProdutosStep {

    WebDriver robo;
    Login login;
    ProdutoTshirt produto1;
    EfetuarCompra comprar;
    ProdutoBackPack produto2;
    ProdutoBikeLight produto3;

    @Before
    public void Before() {

        robo = new ChromeDriver();
        robo.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        robo.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        login = new Login(robo);
        produto1 = new ProdutoTshirt(robo);
        comprar = new EfetuarCompra(robo);
        produto2 = new ProdutoBackPack(robo);
        produto3 = new ProdutoBikeLight(robo);

    }

    @Dado("que tenha logado no site www.saucedemo.com")

    public void queTenhaLogadoNoSite() {

        login.LoginPage();
        login.UserName();
        login.Senha();
        login.Botao();
        login.ValidacaoLogado();

    }

    @Quando("adicionar o produto BikeLight no carrinho")

    public void adicionarOProdutoBikeLightNoCarrinho() {

        produto3.ViewProduct3();
        produto3.AdcProductInCar3();
        produto3.ValidaçãoCarrinho3();
    }

    @Quando("adicionar o produto BackPack no carrinho")

    public void adicionarOProdutoBackPackNoCarrinho() {

        produto2.ViewProduct2();
        produto2.AdcProductInCar2();
        produto2.ValidaçãoCarrinho2();

    }

    @Quando("adicionar o produto Tshirt no carrinho")

    public void adicionarOProdutoTshirtNoCarrinho() {

        produto1.ViewProduct1();
        produto1.AdcProductInCa1();
        produto1.ValidaçãoCarrinho1();
    }

    @Então("deve ser possivel efetuar o pagamento do produto")

    public void deveSerPossivelEfetuarOPagamentoDoProduto() {

        comprar.Car();
        comprar.BtnCheck();
        comprar.FistName();
        comprar.LastName();
        comprar.CEP();
        comprar.BtnContinue();
        comprar.BtnFinish();
        comprar.ValidaçaoCompraConcluida();

    }

}