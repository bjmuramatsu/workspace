import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import DSL.DSL;
import Paginas.CamposPersonalizadosPage;
import Paginas.CelulasPage;
import Paginas.ConfiguraCelulasPage;
import Paginas.HomePage;
import Paginas.LoginPage;
import Paginas.UsuariosPage;
import junit.framework.Assert;
import Paginas.PausasPage;

public class CelulasSuite {

	private WebDriver driver;
	private LoginPage loginpage;
	private HomePage homepage;
	private CelulasPage celulaspage;
	private ConfiguraCelulasPage configuracelulaspage;
	private CamposPersonalizadosPage campospersonalizadospage;
	private UsuariosPage usuariospage;
	private PausasPage pausaspage;
	private DSL dsl;
	// Método que será executado antes de todos os testes
	@Before()
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.muramatsu\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\bruno.muramatsu\\geckodriver\\geckodriver.exe");
//	driver = new FirefoxDriver();
		driver.get("https://192.168.2.53:4201/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		celulaspage = new CelulasPage(driver);
		configuracelulaspage = new ConfiguraCelulasPage(driver);
		campospersonalizadospage = new CamposPersonalizadosPage(driver);
		usuariospage = new UsuariosPage(driver);
		pausaspage = new PausasPage(driver);
		dsl = new DSL(driver);

//		// Faz o login no sistema com defeito
//		loginpage.clearFields();
//		loginpage.SetPrefixo("qa");
//		loginpage.setCodigoAgente("6110");
//    	loginpage.setRamal("2522");
//		loginpage.buttonLogout();
//		loginpage.buttonLogin();
//		loginpage.buttonLogout();
//		loginpage.buttonLogout();
//		loginpage.buttonLogin();
//		homepage.validalogin();
	
		//faz o login no sistema sem defeito
		loginpage.clearFields();
		loginpage.SetPrefixo("qa");
		loginpage.setCodigoAgente("6110");
		loginpage.setRamal("2522");
	    loginpage.buttonLogout();
	    loginpage.buttonLogin();
	    homepage.validalogin();		
	}

	// Método que será executado depois de todos os testes
	@After
	public void finaliza() {
  //  driver.quit();
 
	}

	// Teste para validação de criação de novas células e exclusão de células
	@Test()
	public void campoNomeLimiteSuperior() {
		homepage.openMenuCelulas();
		celulaspage.addCelula();
		dsl.escreveXpath("//input[@formcontrolname='nome']", DSL.random(151));
		celulaspage.selecionaTipoCelula("ativo/receptivo");
		celulaspage.selecionaOperação("Teste");
		celulaspage.localizaFalhaNome();
		
	}
	
	@Test()
	public void validaCriacaoCelula() {
	    String randomico =  DSL.random(150);
		homepage.openMenuCelulas();
		celulaspage.addCelula();
		celulaspage.escreveNome(randomico);
		celulaspage.selecionaTipoCelula("ativo/receptivo");
		celulaspage.selecionaOperação("Teste");
		celulaspage.salvarCelula();
		celulaspage.localizaCelulaCriada(randomico);
	
	}
	
	@Test()
	public void alterarCelula() {
		homepage.openMenuCelulas();
		celulaspage.addCelula();
		celulaspage.escreveNome("Teste alteração");
		celulaspage.selecionaTipoCelula("ativo");
		celulaspage.selecionaOperação("Teste");
		celulaspage.salvarCelula();
		celulaspage.localizaCelulaCriada("Teste alteração");
		celulaspage.alterarCelula("Teste alteração");
		celulaspage.escreveNome("Teste alteração 1");
		celulaspage.selecionaTipoCelula("receptivo");
		celulaspage.selecionaOperação("Teste");
		celulaspage.salvarAlteracaoCelula();
		celulaspage.localizaCelulaCriada("Teste alteração 1");
	}
	
	@Test
	public void desativaCelula() {
		homepage.openMenuCelulas();
		celulaspage.addCelula();
		celulaspage.escreveNome("teste teste teste");
		celulaspage.selecionaTipoCelula("ativo");
		celulaspage.selecionaOperação("Teste");
		celulaspage.salvarCelula();
		celulaspage.localizaCelulaCriada("teste teste teste");
		celulaspage.desativaCelula("teste teste teste");
		celulaspage.exibirInativos();
		celulaspage.localizaCelulaDesativada("teste teste teste");
		
	}
	
	@Test
	public void criaCampoTexto() {
     	homepage.openMenuCelulas();
		celulaspage.addCelula();
    	celulaspage.escreveNome("Teste");
		celulaspage.selecionaTipoCelula("ativo");
		celulaspage.selecionaOperação("Teste");
		celulaspage.salvarCelula();
		celulaspage.localizaCelulaCriada("Teste");
		celulaspage.novoCampoButton("Teste");
		celulaspage.addNovoCampo("Texto", "10", "10", 1, "sim");
		celulaspage.addNovoCampo("Data", "10", "10", 2, "sim");
		celulaspage.addNovoCampo("Hora", "10", "10", 3, "sim");
		celulaspage.addNovoCampo("DataHora", "10", "10", 4, "sim");
		celulaspage.addNovoCampo("NumeroInteiro", "10", "10", 5, "sim");
		celulaspage.addNovoCampo("NumeroDecimal", "10", "10", 6, "sim");
		celulaspage.addNovoCampo("Telefone", "10", "10", 7, "sim");
		celulaspage.addNovoCampo("Moeda", "10", "10", 8, "sim");
		celulaspage.addNovoCampo("Booleano", "10", "10", 9, "sim");
	
	}
	
	@Test
	public void validaLimitesSuperiores() {
		String randomico =  DSL.random(41);
		homepage.openMenuCelulas();
		celulaspage.novoCampoButton("Célula 1");
		celulaspage.validaLimites(randomico, "111111", "222222");
	}
	
	@Test
	public void validaDadosOrdemTamanho() {
		String randomico = DSL.random(6);
		homepage.openMenuCelulas();
		celulaspage.novoCampoButton("Célula 1");
		celulaspage.validaDadosCorretos(randomico, randomico);
		
	}
	
	@Test
	public void procuraPorNome() {
		String randomico = DSL.random(10);
		String nome = randomico;
		homepage.openMenuCelulas();
		celulaspage.addCelula();
    	celulaspage.escreveNome(nome);
		celulaspage.selecionaTipoCelula("ativo");
		celulaspage.selecionaOperação("Teste");
		celulaspage.salvarCelula();
		celulaspage.localizaCelulaCriada(randomico);
		celulaspage.procurarPorNome(nome);
		
	}
}
