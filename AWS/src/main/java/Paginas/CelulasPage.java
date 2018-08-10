package Paginas;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import DSL.DSL;


public class CelulasPage {

	private DSL dsl;
	public WebDriver driver;

	public CelulasPage(WebDriver driver) {
		this.driver = driver;
		dsl = new DSL(driver);
	}

	public void escreveNome(String texto) {
		dsl.clearXpath("//input[@formcontrolname='nome']");
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
		dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li/span[contains(.,'" + operacao + "')]");
	}

	public void localizaFalhaNome() {
		driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
	}

	public void salvarCelula() {
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
	}

	public void localizaCelulaCriada(String texto) {
		driver.findElement(By.xpath("//td[1][normalize-space(text())='" + texto + "']"));

	}

	public void alterarCelula(String texto) {
		dsl.clicaXpath("//td[1][normalize-space(text())='" + texto + "']//following::td[3]");
	}

	public void salvarAlteracaoCelula() {
		dsl.clicaXpath("//button[contains(.,'Alterar')]");
	}

	public void desativaCelula(String texto) {
		dsl.clicaXpath("//td[1][normalize-space(text())='" + texto + "']//following::td[4]");
		dsl.clicaXpath("//button[contains(.,'Desativar')]");
	}

	public void exibirInativos() {
		dsl.clicaXpath("//span[contains(.,'Inativos')]");
	}
	
	public void novoCampoButton(String nome_celula) {
		dsl.clicaXpath("//td[1][normalize-space(text())='" + nome_celula + "']//following::td[5]");
	}
	
	public void procurarPorNome(String nome) {
		dsl.escreveXpath("(//input[@type='text'])[1]", nome);
		List<WebElement> lista = driver.findElements(By.xpath("//tbody[@class='ui-table-tbody']//tr[@class='text-overflow-table ng-star-inserted'][1]//td[contains(.,'Teste')]"));
		int elementos = lista.size();
		if (elementos > 1) {
			Assert.fail();
		}		
	}
	
	public void validaLimites(String nome, String ordem, String tamanho) {
		dsl.clicaXpath("//button[@ngbtooltip='Novo Campo']");
		dsl.escreveXpath("//input[@formcontrolname='nome']", nome);
		driver.findElement(By.xpath("//div[@class='form-group padding-top-form-group-campos']//span[@class='ng-star-inserted']/strong[contains(.,'Maximo 40 caracteres')]"));
		dsl.escreveXpath("//input[@formcontrolname='ordem']", ordem);
		driver.findElement(By.xpath("//div[@class='form-group padding-top-form-group-campos']//label[@for='ordem-float']//span[@class='ng-star-inserted']/strong[contains(.,'(Máximo 5 dígitos)')]"));
		dsl.escreveXpath("//input[@formcontrolname='tamanho']", tamanho);
		driver.findElement(By.xpath("//div[@class='form-group padding-top-form-group-campos']//label[@for='tamanho-float']//span[@class='ng-star-inserted']/strong[contains(.,'(Máximo 5 dígitos)')]"));
	}
	
	public void validaDadosCorretos(String ordem, String tamanho) {
		dsl.clicaXpath("//button[@ngbtooltip='Novo Campo']");
		dsl.escreveXpath("//input[@formcontrolname='ordem']", ordem);
		driver.findElement(By.xpath("//div[@class='form-group padding-top-form-group-campos']//label[@for='ordem-float']//span[@class='ng-star-inserted']/strong[contains(.,'(Apenas número e máximo 5 dígitos)')]"));
		dsl.escreveXpath("//input[@formcontrolname='tamanho']", tamanho);
		driver.findElement(By.xpath("//div[@class='form-group padding-top-form-group-campos']//label[@for='tamanho-float']//span[@class='ng-star-inserted']/strong[contains(.,'(Apenas número e máximo 5 dígitos)')]"));
	}
	

	
	public void addNovoCampo(String nome, String ordem, String tamanho, int tipo, String obrigatorio) {
		dsl.clicaXpath("//button[@ngbtooltip='Novo Campo']");
		dsl.escreveXpath("//input[contains(@formcontrolname,'nome')]", nome);
		dsl.escreveXpath("//input[contains(@formcontrolname,'ordem')]", ordem);
		dsl.escreveXpath("//input[contains(@formcontrolname,'tamanho')]", tamanho);
		dsl.clicaXpath("//div/div[3]/span");
		dsl.waitSeconds(2000);
        
		switch (tipo) {
		case 1:
		    dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li//span[normalize-space(text())='Texto']");
			break;
		case 2:
			dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li//span[normalize-space(text())='Data']");
			break;
		case 3: 
			dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li//span[normalize-space(text())='Hora']");
			break;
		case 4:
			dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li//span[normalize-space(text())='DataHora']");
			break;
		case 5:
			dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li//span[normalize-space(text())='NumeroInteiro']");
			break;
		case 6:
			dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li//span[normalize-space(text())='NumeroDecimal']");
			break;
		case 7:
			dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li//span[normalize-space(text())='Telefone']");
			break;
		case 8:
			dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li//span[normalize-space(text())='Moeda']");
			break;
		case 9:
			dsl.clicaXpath("//div[@class='ui-dropdown-items-wrapper']//ul//li//span[normalize-space(text())='Booleano']");
			break;
        }
		
		if (obrigatorio == "sim") {
			dsl.clicaXpath("//p-checkbox/div/div[2]");	
		}
		
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
	}
	
	public void localizaCelulaDesativada(String nome_celula) {
		List<WebElement> lista = driver.findElements(By.xpath("//span[@class='ui-paginator-pages']/a"));
		int elementos = lista.size();
		int contador = 1;
		
		//Verifica se só existe uma página para ser realizada a pesquisa
		if (elementos == 1) {
			driver.findElement(By.xpath("//td[1][normalize-space(text())='" + nome_celula + "']"));
		} else {
			//Conta quantas paginas existem e faz o loop de pesquisa em todas elas
			while (contador < elementos) {
				try {
					if (driver.findElement(By.xpath("//td[1][normalize-space(text())='" + nome_celula + "']"))
							.isDisplayed()) {
						break;
					}

				} catch (NoSuchElementException e) {
					contador++;
					dsl.clicaXpath("//span[@class='ui-paginator-pages']/a[" + contador + "]");
				}
			}
		}
	}
}