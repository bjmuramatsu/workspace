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
	// M�todo que ser� executado antes de todos os testes
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

		// Faz o login no sistema
		loginpage.clearFields();
		loginpage.SetPrefixo("qa");
		loginpage.setCodigoAgente("6110");
		loginpage.setRamal("2522");
		loginpage.buttonLogout();
		loginpage.buttonLogin();
		loginpage.buttonLogout();
		loginpage.buttonLogout();
		loginpage.buttonLogin();
		homepage.validalogin();

	}

	// M�todo que ser� executado depois de todos os testes
	@After
	public void finaliza() {
	driver.quit();
 
	}

	// Teste para valida��o de cria��o de novas c�lulas e exclus�o de c�lulas
	@Test()
	public void campoNomeLimiteSuperior() {
		homepage.openMenuCelulas();
		celulaspage.addCelula();
		dsl.escreveXpath("//input[@formcontrolname='nome']", DSL.random(151));
		celulaspage.selecionaTipoCelula("ativo/receptivo");
		celulaspage.selecionaOpera��o("Teste");
		celulaspage.localizaFalhaNome();
		
	}
	
	@Test()
	public void validaCriacaoCelula() {
	    String randomico =  DSL.random(150);
		homepage.openMenuCelulas();
		celulaspage.addCelula();
		celulaspage.escreveNome(randomico);
		celulaspage.selecionaTipoCelula("ativo/receptivo");
		celulaspage.selecionaOpera��o("Teste");
		celulaspage.salvarCelula();
		celulaspage.localizaCelulaCriada(randomico);
	
	}
}
