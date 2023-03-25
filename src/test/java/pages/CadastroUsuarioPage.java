package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumber;

public class CadastroUsuarioPage extends RunCucumber {

    // elementos
    private By campoNome = By.id("user");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("password");
    private By botaoFazerCadastro= By.id("btnRegister");

    // ações / funções / métodos
    public void preencheNome(String email){
         getDriver().findElement(campoNome).sendKeys(email);
    }
    public void preencheEmail(String email){
         getDriver().findElement(campoEmail).sendKeys(email);
    }

    public void preencherSenha(String senha){
        getDriver().findElement(campoSenha).sendKeys(senha);
    }

    public void cadastrarUsuario(){
        getDriver().findElement(botaoFazerCadastro).click();
    }

    public void verificaCadastroSucesso(){
        String textoLoginSucesso = getDriver().findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("Os textos não são iguais!", "Cadastro realizado!", textoLoginSucesso);
    }
}
