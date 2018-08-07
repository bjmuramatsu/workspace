import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {

	public WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Método para se criar uma string aleatória para se criar um e-mail novo
	protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	//Método para escrever em um campo
	public void escreve(String id_campo, String texto) {		
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	//Método para clicar em elementos localizados por link text
	public void clicaLink(String linktext_campo) {
		driver.findElement(By.linkText(linktext_campo)).click();
	}
	
	//Método para se clicar em elementos localizados por cssSelector
	public void clicaCss(String cssSelector_campo) {
		driver.findElement(By.cssSelector(cssSelector_campo)).click();
	}

	//Método para se comparar textos via CSS
	public void comparaCSS(String esperado, String atual) {
		Assert.assertEquals(esperado, driver.findElement(By.cssSelector(atual)).getText());
	}
}
