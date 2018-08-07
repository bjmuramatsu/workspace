package Paginas;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DSL.DSL;

public class CelulasPage {
	
	private DSL dsl;
	public WebDriver driver;
	
	public CelulasPage(WebDriver driver) {
		this.driver = driver;
		dsl = new DSL(driver);
	}
	
	public void escreveNome(String texto) {
		dsl.escreveXpath("//input[@formcontrolname='nome']", texto);
		
	}
	
	public void selecionaTipoCelula(String tipo) {
			
		dsl.clicaXpath("//div[2]/p-dropdown/div/div[3]/span");
		if (tipo == "ativo") {
			dsl.clicaXpath("//div[2]/ul/li//span[./text()='Ativo']");
		} else if (tipo == "receptivo") {
			dsl.clicaXpath("//div[2]/ul/li//span[./text()='Receptivo']");
		} else if (tipo == "ativo/receptivo") {
			dsl.clicaXpath("//div[2]/ul/li//span[./text()='Ativo/Receptivo']");
		}
	}
	
	public void addCelula() {
		dsl.clicaXpath("//button[contains(@ngbtooltip,'Nova Operação')]");
	}
	
	public void selecionaOperação(String operacao) {
		dsl.clicaXpath("//div[3]/p-dropdown/div/div[3]/span");
		dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li/span[contains(.,'"+operacao+"')]");
	}
	
	public void localizaFalhaNome() {
		driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
	}
	
	public void salvarCelula() {
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
	}
	
	public void localizaCelulaCriada(String texto) {
		driver.findElement(By.xpath("//td[1][contains(.,'"+texto+"')]"));	
	}
}
