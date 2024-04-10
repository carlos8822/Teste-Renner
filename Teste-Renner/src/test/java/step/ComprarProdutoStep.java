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

import java.util.concurrent.TimeUnit;

public class ComprarProdutoStep {

    WebDriver robo;
    Login login;
    ProdutoTshirt produto1;
    EfetuarCompra comprar;

    @Before
    public void Before(){

        robo = new ChromeDriver();
        robo.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        robo.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        login = new Login(robo);
        produto1 = new ProdutoTshirt(robo);
        comprar = new EfetuarCompra(robo);

    }

    @Dado("que tenha logado no site {string}")

         public void queTenhaLogadoNoSite(String url) {

            login.LoginPage();
            login.UserName();
            login.Senha();
            login.Botao();

    }
    @Quando("adicionar o produto BikeLight no carrinho")

        public void adicionarOProdutoBikeLightNoCarrinho() {
    }

    @Quando("adicionar o produto BackPack no carrinho")

        public void adicionarOProdutoBackPackNoCarrinho() {
    }
    @Quando("adicionar o produto Tshit no carrinho")

        public void adicionarOProdutoNoCarrinho(String Tshirt) {

    }

    @Então("deve ser possivel efetuar o pagamento do produto")

        public void deveSerPossivelEfetuarOPagamentoDoProduto() {



        }
}
