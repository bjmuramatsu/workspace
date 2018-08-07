package Paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DSL.DSL;


public class PausasPage {

	private DSL dsl;
	private WebDriver driver;
	
	public PausasPage(WebDriver driver) {
	this.driver = driver;
	dsl = new DSL(driver);
	
	}
	
	//Método para se adicionar uma nova pausa
	public void setNovaPausa(String codigo, String motivo) {
		WebDriverWait wait = new WebDriverWait(driver, 480);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(.,'Células')]")));
		dsl.clicaXpath("//button[@class='btn btn-primary btnAdd']");
		dsl.escreveXpath("//input[@name='codigo']", codigo);
		dsl.escreveXpath("//input[@name='nome']", motivo);
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
	}
}
