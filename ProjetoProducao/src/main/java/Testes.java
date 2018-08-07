import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

public class Testes {
	
	private WebDriver driver;
	private DSL dsl;
	private PaginaInicialPage page;
	private String email = "brunomuramatsu@gmail.com";
	private String senha = "1234";
	

	//Procedimentos que serão realizados antes de todos os testes
		@Before
		public void inicializa() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bruno.muramatsu\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://srbarriga.herokuapp.com/login");
		dsl = new DSL(driver);
		page = new PaginaInicialPage(driver);
		
		}
	//Procedimentos que serão realizados depois de todos os testes
		@After
		public void finaliza() {
		driver.quit();
			
		}
	
	//Teste para cadastro de novo usuário
		@Test
		public void novoUsuario() {
			page.newUser();
			page.setNome("Brunooo");
			page.setEmail(dsl.getSaltString()+"@gmail.com");
			page.setSenha("1234");
			page.setCadastro();
			page.sucesso("Usuário inserido com sucesso", "alert alert-success");
		
		}
	
	//Login com uma conta previamente criada
		@Test
		public void login() {
			page.loginEmail(email);
			page.setSenha(senha);
			page.Entrar();
			page.sucesso("Bem vindo, Bruno!", "");
		
		}
	
	//Teste para se adicionar uma nova conta
		@Test
		public void novaConta() {
			login();
			page.adicionarConta("bruno");
			page.sucesso("Conta adicionada com sucesso!", "");
			dsl.clicaCss("span.glyphicon.glyphicon-remove-circle");
			
		}

	//Teste para se adicionar uma conta com o mesmo nome	
		@Test
		public void novaContaMesmoNome() {
			login();
			page.adicionarConta("bruno");
			page.sucesso("Conta adicionada com sucesso!", "");
			page.adicionarConta("bruno");
			page.sucesso("Já existe uma conta com esse nome!", "alert alert-danger");
			dsl.clicaCss("span.glyphicon.glyphicon-remove-circle");
			
		}
}
