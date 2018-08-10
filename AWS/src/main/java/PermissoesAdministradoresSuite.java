import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Paginas.*;
import DSL.DSL;

public class PermissoesAdministradoresSuite {

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
	public static void beforeClass() throws InterruptedException {
		PerfisPage.loginAsAdministrador("qa", "6110", "2522");
	}
	
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
			permissoespage = new PermissoesPage(driver);
			dsl = new DSL(driver);
			homepage.fazLogin();
			
		}
		
		// Teste para exebi��o de c�lulas para Administradores (logar como agente)
		@Test()
		public void displayCelulasAdministradores() {
			homepage.openMenuPermissoes();
			permissoespage.displayCelulasAdministradores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuCelulas();

		}
		
		// Teste para exibi��o de chamadas para Administradores (logar como agente)
		@Test()
		public void displayChamadasAdministradores() {
			homepage.openMenuPermissoes();
			permissoespage.displayChamadasAdministradores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuChamadas();

		}

		// Teste para exibi��o de opera��es para Administradores (logar como agente)
		@Test()
		public void displayOperacoesAdministradores() {
			homepage.openMenuPermissoes();
			permissoespage.displayOperacoesAdministradores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuOperacoes();

		}

		// Teste para exibi��o de usu�rios para Administradores (logar como agente)
		@Test()
		@Ignore
		public void displayUsuariosAdministradores() {
			homepage.openMenuPermissoes();
			permissoespage.displayUsuariosAdministradores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuUsuarios();
		}

		// Teste para exibi��o de relat�rios para Administradores (logar como agente)
		@Test()
		public void displayRelatoriosAdministradores() {
			homepage.openMenuPermissoes();
			permissoespage.displayRelatoriosAdministradores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuRelatorios();
		}

		// Teste para exibi��o de configura��es de CTI para Administradores (logar como agente)
		@Test()
		public void displayConfigCTIAdministradores() {
			homepage.openMenuPermissoes();
			permissoespage.displayConfigCTIAdministradores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuConfigCTI();
		}

		// Teste para exibi��o de configura��es gerais para Administradores (logar como agente)
		@Test()
		public void displayConfigGeralAdministradores() {
			homepage.openMenuPermissoes();
			permissoespage.displayConfigGeralAdministradores();
			dsl.waitSeconds(5000);
			homepage.logout();
			homepage.fazLogin();
			homepage.openMenuConfigGeral();
		}
		
		// Teste para exibi��o de motivos de pausa para Administradores (Logar como agente)
		@Test()
		public void displayMotivosPausaAdministradores() {
			homepage.openMenuPermissoes();
			permissoespage.displayMotivosPausaAdministradores();
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
