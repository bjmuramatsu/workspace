import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {

	public WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//M�todo para escrever em um campo
	public void escreve(String id_campo, String texto) {
		
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	//M�todo para clicar em um radiobox
	public void clica(String id_campo) {
		
		driver.findElement(By.id(id_campo)).click();
	}
	
	//M�todo para comparar resultados
	public void compara(String esperado, String id_campo) {
	
	Assert.assertEquals(esperado , driver.findElement(By.id(id_campo)).getAttribute("value"));
	
	}
	
	//M�todo para saber se um radiobox est� clicado
	public void comparaClick(String id_campo) {
		
		Assert.assertTrue(driver.findElement(By.id(id_campo)).isSelected());
	
	}
}
