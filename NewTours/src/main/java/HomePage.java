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
	
	//Método para se entrar com username
		public void setName(String texto) {
			dsl.escreveNome("userName", texto);
	}	
	//Método para se entrar com password
		public void setSenha(String texto) {
			dsl.escreveNome("password", texto);
		}
	
	//Método para se clicar no botão de login
		public void buttonLogin() {
			dsl.clicaNome("login");
		}	
		
	//Método para se clicar no botão de registrar
		public void buttonRegister() {
			dsl.clicaLink("REGISTER");
		}		
		
}		
		

	