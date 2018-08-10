package Paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import DSL.DSL;
import Paginas.LoginPage;
public class HomePage {
	
	private DSL dsl;	
	public WebDriver driver;
	private LoginPage loginpage;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		dsl = new DSL(driver);
		loginpage = new LoginPage(driver);

	}
	
	//Método para se fazer login
	public void fazLogin(String prefixo, String codigo_agente, String ramal) {
		loginpage.clearFields();
		loginpage.SetPrefixo(prefixo);
		loginpage.setCodigoAgente(codigo_agente);
		loginpage.setRamal(ramal);
		loginpage.buttonLogout();
		boolean erro1 =  driver.findElements(By.xpath("//div[contains(.,'Erro finalizando sessao, sessao do agente 6110 nao encontrada')]")).size() >0;
	    boolean erro2 =  driver.findElements(By.xpath("//div[contains(.,'Sessao do agente 6110 ja existe')]")).size() >0;
	    System.out.println(erro1);
	    if (erro1 = true) {
			loginpage.buttonLogin();
		} else if (erro2 = true) {
			loginpage.buttonLogout();
			loginpage.buttonLogin();
		}


		
		loginpage.buttonLogin();
		validalogin();
	}
	
	//Método para se validar o login
	public void validalogin() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(.,'Aguardando chamada...')]")));
	}
	
	//Método para se abrir o menu de células
	public void openMenuCelulas() {
		dsl.clicaXpath("//span[contains(@class,'oi oi-menu')]");
		dsl.clicaXpath("//a[contains(.,'Células')]");
	}
	
	//Método para se abrir o menu de usuários
	public void openMenuUsuarios() {
		dsl.clicaXpath("//span[contains(@class,'oi oi-menu')]");
		dsl.clicaXpath("//a[contains(.,'Usuários')]");
	}
	
	//Método para se abrir o menu de permissões
	public void openMenuPermissoes() {
		dsl.clicaXpath("//span[contains(@class,'oi oi-menu')]");
		dsl.clicaXpath("//a[contains(.,'Permissões')]");		
	}
	
	//Método para se abrir o menu de operações
	public void openMenuOperacoes() {
		dsl.clicaXpath("//span[contains(@class,'oi oi-menu')]");
		dsl.clicaXpath("//a[contains(.,'Operações')]");
	}
	
	//Método para se abrir o menu de chamadas
	public void openMenuChamadas() {
		dsl.clicaXpath("//span[contains(@class,'oi oi-menu')]");
		dsl.clicaXpath("//a[contains(.,'Chamadas')]");
	}
	
	//Método para se abrir o menu de tabulações
	public void openMenuTabulacoes() {
		dsl.clicaXpath("//span[contains(@class,'oi oi-menu')]");
		dsl.clicaXpath("//a[contains(.,'Tabulações')]");
	}
	
	//Método para se abrir o menu de relatórios
	public void openMenuRelatorios() {
		dsl.clicaXpath("//span[contains(@class,'oi oi-menu')]");
		dsl.clicaXpath("//a[contains(.,'Relatórios')]");
	}
	
	//Método para se abrir o menu de configurações CTI
	public void openMenuConfigCTI() {
		dsl.clicaXpath("//span[contains(@class,'oi oi-menu')]");
		dsl.clicaXpath("//a[contains(.,'Configuração CTI')]");
	}
	
	//Método para se abrir o menu de configurações gerais
	public void openMenuConfigGeral() {
		dsl.clicaXpath("//span[contains(@class,'oi oi-menu')]");
		dsl.clicaXpath("//a[contains(.,'Configuração Geral')]");		
	}
	
	//Método para se abrir o menu de motivos de pausa
	public void openMenuMotivosPausa() {
		dsl.clicaXpath("//span[contains(@class,'oi oi-menu')]");
		dsl.clicaXpath("//a[contains(.,'Motivos de Pausa')]");
	}
	
	//Método para se fazer o logout do sistema
	public void logout() {
		dsl.clicaCss("button.btn.btn-danger");
		dsl.waitSeconds(5000);
		

	}
	
}
