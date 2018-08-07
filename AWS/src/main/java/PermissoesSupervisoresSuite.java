import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import DSL.DSL;
import Paginas.CamposPersonalizadosPage;
import Paginas.CelulasPage;
import Paginas.ConfiguraCelulasPage;
import Paginas.HomePage;
import Paginas.LoginPage;
import Paginas.PausasPage;
import Paginas.PerfisPage;
import Paginas.PermissoesPage;
import Paginas.UsuariosPage;


public class PermissoesSupervisoresSuite {

	private WebDriver driver;
	private LoginPage loginpage;
	private HomePage homepage;
	private CelulasPage celulaspage;
	private ConfiguraCelulasPage configuracelulaspage;
	private CamposPersonalizadosPage campospersonalizadospage;
	private UsuariosPage usuariospage;
	private PausasPage pausaspage;
	private PermissoesPage permissoespage;
	private DSL dsl;
	
	
	@BeforeClass
	public static void beforeClass() {
		PerfisPage.loginAsSupervisor("qa", "6110", "2522");
	}
	
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
		permissoespage = new PermissoesPage(driver);
		dsl = new DSL(driver);
		homepage.fazLogin();

	}

	// Teste para exebição de células para Supervisores (logar como agente)
		@Test()
		public void displayCelulasSupervisores() {
			homepage.openMenuPermissoes();
			permissoespage.displayCelulasSupervisores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuCelulas();

		}
		
		// Teste para exibição de chamadas para Supervisores (logar como agente)
		@Test()
		public void displayChamadasSupervisores() throws IOException {
			homepage.openMenuPermissoes();
			permissoespage.displayChamadasSupervisores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuChamadas();
			dsl.takeScreenShot("teste 1");

		}

		// Teste para exibição de operações para Supervisores (logar como agente)
		@Test()
		public void displayOperacoesSupervisores() {
			homepage.openMenuPermissoes();
			permissoespage.displayOperacoesSupervisores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuOperacoes();

		}

		// Teste para exibição de usuários para Supervisores (logar como agente)
		@Test()
		@Ignore
		public void displayUsuariosSupervisores() {
			homepage.openMenuPermissoes();
			permissoespage.displayUsuariosSupervisores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuUsuarios();
		}

		// Teste para exibição de relatórios para Supervisores (logar como agente)
		@Test()
		public void displayRelatoriosSupervisores() {
			homepage.openMenuPermissoes();
			permissoespage.displayRelatoriosSupervisores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuRelatorios();
		}

		// Teste para exibição de configurações de CTI para Supervisores (logar como agente)
		@Test()
		public void displayConfigCTISupervisores() {
			homepage.openMenuPermissoes();
			permissoespage.displayConfigCTISupervisores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuConfigCTI();
		}

		// Teste para exibição de configurações gerais para Supervisores (logar como agente)
		@Test()
		public void displayConfigGeralSupervisores() {
			homepage.openMenuPermissoes();
			permissoespage.displayConfigGeralSupervisores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuConfigGeral();
		}
		
		// Teste para exibição de motivos de pausa para Supervisores (Logar como agente)
		@Test()
		public void displayMotivosPausaSupervisores() {
			homepage.openMenuPermissoes();
			permissoespage.displayMotivosPausaSupervisores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuMotivosPausa();
			
		}

		@After
		public void finaliza() {
			driver.quit();
		}
	
}
