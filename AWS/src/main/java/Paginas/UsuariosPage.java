package Paginas;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import DSL.DSL;
import Paginas.HomePage;
public class UsuariosPage {

	private DSL dsl;
	private WebDriver driver;
	private HomePage homepage;
	
	public UsuariosPage(WebDriver driver) {
	this.driver = driver;
	dsl = new DSL(driver);
	homepage  = new HomePage(driver);
	
	}
	
	//M�todo para se alterar os dados de um usu�rio espec�fico
	public void buttonAlterar(String texto) {
		dsl.clicaXpath("//tr/td[1][contains(.,'"+texto+"')]//following::button[1][@class='btn btn-primary']");
	}
	
	//M�todo para se modificar a c�lula de um usu�rio
	public void setCelulaUsuario(String texto) {
		dsl.clicaXpath("//div[5]/p-dropdown/div/div[3]/span");
		dsl.clicaXpath("//li[contains(.,'"+texto+"')]");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
	}
	
	//M�todo para se logar como agente
	public void setPerfilAgente() {
		homepage.openMenuUsuarios();
		dsl.clicaXpath("//td[contains(.,'1092')]//following::td[3]/button");
		dsl.clicaXpath("//div[@class='modal-dialog']//div[@class='modal-body']//div[@class='form-group divDropDown padding-top-form-group']//select//option[contains(.,'Agentes')]");
	}
	
	//M�todo para se logar como supervisor
	public void setPerfilSupervisor() {
		
	}
	
	//M�todo para se logar como administrador
	public void setPerfilAdministrador() {
		
	}
	
}