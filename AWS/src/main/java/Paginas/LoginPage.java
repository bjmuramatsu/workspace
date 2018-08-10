package Paginas;
import org.openqa.selenium.WebDriver;


import DSL.DSL;

public class LoginPage {
	
	private DSL dsl;
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	this.driver = driver;
	dsl = new DSL(driver);
	
	}
	
	//M�todo para se entrar com um prefixo na p�gina de login
	public void SetPrefixo(String texto) {
		dsl.escreveXpath("//input[@formcontrolname='prefixo']", texto);
	}
	
	//M�todo para se entrar com um c�digo de agente na p�gina de login
	public void setCodigoAgente(String texto) {
		dsl.escreveXpath("//input[@formcontrolname='cod_agente']", texto);		
	}
	
	//M�todo para se entrar com um ramal na p�gina de login
	public void setRamal(String texto) {
		dsl.escreveXpath("//input[@formcontrolname='ramal']", texto);
	}
	
	//M�todo para se clicar no bot�o de login na p�gina de login
	public void buttonLogin() {
		dsl.clicaXpath(("//button[contains(.,'Login')]"));
	}
	
	//M�todo para se clicar no bot�o de logout na p�gina de login
	public void buttonLogout() {
		dsl.clicaXpath(("//button[contains(.,'Logout')]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	//M�todo para se limpar todos os campos da p�gina de login
	public void clearFields() {
		dsl.clearXpath("//input[@formcontrolname='prefixo']");
		dsl.clearXpath("//input[@formcontrolname='cod_agente']");
		dsl.clearXpath("//input[@formcontrolname='ramal']");
	}
}
