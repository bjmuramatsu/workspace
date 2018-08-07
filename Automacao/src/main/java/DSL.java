import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {

	public WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Método para escrever em um campo
	public void escreve(String id_campo, String texto) {
		
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	//Método para clicar em um radiobox
	public void clica(String id_campo) {
		
		driver.findElement(By.id(id_campo)).click();
	}
	
	//Método para comparar resultados
	public void compara(String esperado, String id_campo) {
	
	Assert.assertEquals(esperado , driver.findElement(By.id(id_campo)).getAttribute("value"));
	
	}
	
	//Método para saber se um radiobox está clicado
	public void comparaClick(String id_campo) {
		
		Assert.assertTrue(driver.findElement(By.id(id_campo)).isSelected());
	
	}
}
