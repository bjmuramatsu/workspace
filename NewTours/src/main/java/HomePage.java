import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Random;
import org.junit.Assert;

//CLASSE PAGE REFERENTE AOS ELEMENTOS DA HOMEPAGE
public class HomePage {

private DSL dsl;
	
	public HomePage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	//M�todo para se entrar com username
		public void setName(String texto) {
			dsl.escreveNome("userName", texto);
	}	
	//M�todo para se entrar com password
		public void setSenha(String texto) {
			dsl.escreveNome("password", texto);
		}
	
	//M�todo para se clicar no bot�o de login
		public void buttonLogin() {
			dsl.clicaNome("login");
		}	
		
	//M�todo para se clicar no bot�o de registrar
		public void buttonRegister() {
			dsl.clicaLink("REGISTER");
		}		
		
}		
		

	