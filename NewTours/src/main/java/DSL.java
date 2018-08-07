import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

	public WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Método para escrever em um campo lozalizado por id
	public void escreveId(String id_campo, String texto) {		
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	//Método para escrever em um campo localizado por nome
	public void escreveNome(String id_campo, String texto) {
		driver.findElement(By.name(id_campo)).sendKeys(texto);
	}
	
	//Método para clicar em elementos localizados por link text
	public void clicaLink(String id_campo) {
		driver.findElement(By.linkText(id_campo)).click();
	}
	
	//Método para clicar em elementos localizados por nome
	public void clicaNome(String id_campo) {
		driver.findElement(By.name(id_campo)).click();
	}
	
	//Método para se clicar em elementos localizados por cssSelector
	public void clicaCss(String cssSelector_campo) {
		driver.findElement(By.cssSelector(cssSelector_campo)).click();
	}

	//Método para se comparar textos via CSS
	public void comparaCSS(String esperado, String atual) {
		Assert.assertEquals(esperado, driver.findElement(By.cssSelector(atual)).getText());
	}
	
	//Método para se comparar textos via tag
	public void comparaTag(String esperado, String atual) {
		Assert.assertEquals(esperado, driver.findElement(By.tagName(atual)).getText());
	}
	
	//Método para se selecionar elemento dentro de lista
	public void selecionaLista(String id_campo, String opcao) {
		Select multicombo = new Select(driver.findElement(By.name(id_campo)));
		multicombo.selectByVisibleText(opcao);
	}
	
	//Método para esperar a página ser carregada
	public void waitForPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
}
