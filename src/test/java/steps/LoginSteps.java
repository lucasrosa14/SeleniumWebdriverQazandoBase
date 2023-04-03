package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;
import runner.RunCucumber;
import support.ScreenshotUtils;

public class LoginSteps extends RunCucumber {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        loginPage.acessarAplicao();
        loginPage.acessarTelaLogin();
    }

    @Quando("^preencho login \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void preencho_login_e_senha(String email, String senha) {
        loginPage.preencheEmail(email);
        loginPage.preencheSenha(senha);
    }

    @Quando("^clico em Login$")
    public void clico_em_Login() {
        loginPage.clicarLogin();
    }

    @Então("^vejo mensagem de login com sucesso$")
    public void vejo_mensagem_login_sucesso() {
        loginPage.verificaLoginSucesso();
    }

    @Então("^vejo mensagem \"([^\"]*)\" de campo não preenchido$")
    public void vejo_mensagem_de_campo_não_preenchido(String message)  {
        loginPage.verificaCampoVazio(message);
    }

    @Quando("^acesso a tela de cadastro de usuário$")
    public void acesso_a_tela_de_cadastro_de_usuário() {
        loginPage.acessarTelaCadastro();
    }

    @Dado("^que estou logado na aplicação com user \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void que_estou_logado_na_aplicação_com_user_e_senha(String email, String senha)  {
        loginPage.acessarAplicao();
        loginPage.acessarTelaLogin();
        loginPage.preencheEmail(email);
        loginPage.preencheSenha(senha);
        loginPage.clicarLogin();
        loginPage.verificaLoginSucesso();
    }

    @After
    public static void afterScenario(Scenario scenario){
        ScreenshotUtils.addScreenshotOnScenario(scenario);
    }
    
}
