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
	
	//Método para se alterar os dados de um usuário específico
	public void buttonAlterar(String texto) {
		dsl.clicaXpath("//tr/td[1][contains(.,'"+texto+"')]//following::button[1][@class='btn btn-primary']");
	}
	
	//Método para se modificar a célula de um usuário
	public void setCelulaUsuario(String texto) {
		dsl.clicaXpath("//div[5]/p-dropdown/div/div[3]/span");
		dsl.clicaXpath("//li[contains(.,'"+texto+"')]");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
	}
	
	//Método para se logar como agente
	public void setPerfilAgente() {
		homepage.openMenuUsuarios();
		dsl.clicaXpath("//td[contains(.,'1092')]//following::td[3]/button");
		dsl.clicaXpath("//div[@class='modal-dialog']//div[@class='modal-body']//div[@class='form-group divDropDown padding-top-form-group']//select//option[contains(.,'Agentes')]");
	}
	
	//Método para se logar como supervisor
	public void setPerfilSupervisor() {
		
	}
	
	//Método para se logar como administrador
	public void setPerfilAdministrador() {
		
	}
	
}