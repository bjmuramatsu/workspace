package Paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import DSL.DSL;

//SubPágina da Página de células
public class CamposPersonalizadosPage {

	private WebDriver driver;
	private DSL dsl;
	
	public CamposPersonalizadosPage(WebDriver driver) {
		this.driver = driver;
		dsl = new DSL(driver);
	}
	
	//Método para se clicar no botão de adicionar um novo campo
	public void buttonAddCampo() {
		dsl.clicaXpath("//button[contains(.,'NOVO CAMPO')]");
	}
	
	//Método para se escrever o nome do campo
	public void setNomeCampo(String texto) {
		dsl.clearXpath("//input[@formcontrolname='nome']");
		dsl.escreveXpath("//input[@formcontrolname='nome']", texto);
	}
	
	//Método para se selecionar o tipo do campo
	public void setTipo(int opcao) {
		Select multicombo = new Select(driver.findElement(By.xpath("//select")));
		switch (opcao){
		case 1: multicombo.selectByIndex(0); //Texto
		break;
		case 2: multicombo.selectByIndex(1); //Data
		break;
		case 3: multicombo.selectByIndex(2); //Hora
		break;
		case 4: multicombo.selectByIndex(3); //Data hora
		break;
		case 5: multicombo.selectByIndex(4); //Número inteiro
		break;
		case 6: multicombo.selectByIndex(5); //Número decimal
		break;
		case 7: multicombo.selectByIndex(6); //Telefone
		break;
		case 8: multicombo.selectByIndex(7); //Moeda
		break;
		case 9: multicombo.selectByIndex(8); //Booleano
		break;	
		}
	}
	
	//Método para se preencher o campo order
	public void setOrdem(String texto) {
		dsl.clearXpath("//input[@formcontrolname='ordem']");
		dsl.escreveXpath("//input[@formcontrolname='ordem']", texto);
	}
	
	//Método para se preencher o campo tamanho
	public void setTamanho(String texto) {
		dsl.clearXpath("//input[@formcontrolname='tamanho']");
		dsl.escreveXpath("//input[@formcontrolname='tamanho']", texto);
	}
	
	//Método para selecionar campo obrigatório
	public void setObrigatório() {
		dsl.clicaXpath("//label[contains(.,'Obrigatório?')]");
	}
	
	//Método para se clicar no botão de criar
	public void buttonCriar() {
		dsl.clicaXpath("//button[contains(.,'CRIAR')]");
	}
	
	//Método para se clicar no botão de fechar
	public void buttonFechar() {
		dsl.clicaXpath("//button[@class='btn btn-primary']");
	}

	//Método para validar se o campo foi criado com sucesso
	public void validaCriacaoCampo (String nome, String tipo, String ordem, String tamanho, String obrigatorio) {
		WebDriverWait wait = new WebDriverWait(driver, 480);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[contains(.,'Campos Personalizados - Teste célula')]")));
		dsl.encontraXpth("//tr//following::td[1][contains(.,'"+nome+"')]");
		dsl.encontraXpth("//tr//following::td[3][contains(.,'"+tipo+"')]");
		dsl.encontraXpth("//tr//following::td[4][contains(.,'"+ordem+"')]");
		dsl.encontraXpth("//tr//following::td[5][contains(.,'"+tamanho+"')]");
		
		if (obrigatorio=="sim") {
			dsl.encontraXpth("//td[contains(.,'teste')]//following::td/span[@class='oi oi-check']");
		} else {
		
		}
	
	}	
}
