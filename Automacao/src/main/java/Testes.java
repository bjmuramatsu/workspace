import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.junit.Test;






import org.junit.Before;
import org.junit.After;



public class Testes {
	
	private WebDriver driver;
	private DSL dsl;
	private CampoDeTreinamentoPage page;
	
	
	//Procedimentos que serão realizados antes de todos os testes
	@Before
	public void inicializa() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\bruno.muramatsu\\geckodriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	dsl = new DSL(driver);
	page = new CampoDeTreinamentoPage(driver);
	
	}
	
	//Procedimentos que serão realizados depois de todos os testes
	@After
	public void finaliza() {
	driver.quit();
		
	}
	
	//Método para se testar o funcionamento do campo nome
	@Test
	public void nome() {
		page.setNome("bruno");
		dsl.compara("bruno", "elementosForm:nome");
	}
	
	//Método para se testar o funcionamento do campo sobrenome
	@Test
	public void sobrenome() {
		page.setSobrenome("muramatsu");
		dsl.compara("muramatsu", "elementosForm:sobrenome");
	}
	
	//Métodos para se testar o funcionamento do campo sexo
	
		//Sexo masculino
		@Test
		public void sexoMasculino() {
			page.setSexoMasculino();
			dsl.comparaClick("elementosForm:sexo:0");
		}
	
		//Sexo feminino
		@Test
		public void sexoFeminino() {
			page.setSexoFeminino();
			dsl.comparaClick("elementosForm:sexo:1");
		}
	
	//Métodos para se testar o funcionamento dos campos comida favorita
		
		//Carne
		@Test
		public void comidaCarne() {
		page.setComidaCarne();
		dsl.comparaClick("elementosForm:comidaFavorita:0");
		}
		
		//Frango
		@Test
		public void comidaFrango() {
			page.setComidafrango();
			dsl.comparaClick("elementosForm:comidaFavorita:1");
		}
	
		//Pizza
		@Test
		public void comidaPizza() {
			page.setComidaPizza();
			dsl.comparaClick("elementosForm:comidaFavorita:2");
		}
		
		//Vegetariano
		@Test
		public void comidaVegetariano() {
			page.setComidaVegetariano();
			dsl.comparaClick("elementosForm:comidaFavorita:3");
		}
}
