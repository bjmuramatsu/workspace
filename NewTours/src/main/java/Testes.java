
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

public class Testes {

	private WebDriver driver;
	private DSL dsl;
	private HomePage HomePage;
	private RegisterPage RegisterPage;
	
	
	//Método que será executado antes de todos os testes
	@Before
	public void inicializa() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\bruno.muramatsu\\geckodriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	dsl = new DSL(driver);
	HomePage = new HomePage(driver);
	RegisterPage = new RegisterPage(driver);
	
	}
	
	//Método que será executado depois de todos os testes
	@After
	public void finaliza() {
    driver.quit();
		
	}
	
	@Test() //Teste de login
	public void login() {
		HomePage.setName("bruno");
		HomePage.setSenha("1234");
		HomePage.buttonLogin();
	}
	
	@Test(timeout=25000) //Teste de registro
	public void registrar() {
		HomePage.buttonRegister();
		dsl.waitForPage();
		RegisterPage.setPrimeiroNome("Teste");
		RegisterPage.setSobrenome("Testando");
		RegisterPage.setTelefone("+5511999999999");
		RegisterPage.setEmail("teste@teste.com.br");
		RegisterPage.setCidade("São Paulo");
		RegisterPage.setEstado("São Paulo");
		RegisterPage.setCodigoPostal("04431589");
		RegisterPage.setPais("BRAZIL");
		RegisterPage.setUserName("UserNameTest");
		RegisterPage.setPassWord("1234");
		RegisterPage.setConfirmPassword("1234");
		RegisterPage.submit();
		dsl.waitForPage();
		RegisterPage.confirma("Dear Teste Testando,");
	
	}	
	
}
