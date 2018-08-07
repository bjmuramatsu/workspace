package DSL;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {


	public WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;

   
		
	}
	
	//M�todo para escrever em um campo lozalizado por id
	public void escreveId(String id_campo, String texto) {		
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	//M�todo para escrever em um campo localizado por nome
	public void escreveNome(String id_campo, String texto) {
		driver.findElement(By.name(id_campo)).sendKeys(texto);
	}
	
	//M�todo para escrever em um campo localizado por xpath
	public void escreveXpath(String id_campo, String texto) {
		driver.findElement(By.xpath(id_campo)).sendKeys(texto);
	}
	
	//M�todo para clicar em elementos localizados por link text
	public void clicaLink(String id_campo) {
		driver.findElement(By.linkText(id_campo)).click();
	}
	
	//M�todo para clicar em elementos localizados por nome
	public void clicaNome(String id_campo) {
		driver.findElement(By.name(id_campo)).click();
	}
	
	//M�todo para se clicar em elementos localizados por cssSelector
	public void clicaCss(String cssSelector_campo) {
		driver.findElement(By.cssSelector(cssSelector_campo)).click();
	}
	
	//M�todo para se clicar em elementos localizados por xpath
		public void clicaXpath(String id_campo) {
			driver.findElement(By.xpath(id_campo)).click();
	}
 
	//M�todo para se comparar textos via CSS
	public void comparaCSS(String esperado, String atual) {
		Assert.assertEquals(esperado, driver.findElement(By.cssSelector(atual)).getText());
	}
	
	//M�todo para se comparar textos via tag
	public void comparaTag(String esperado, String atual) {
		Assert.assertEquals(esperado, driver.findElement(By.tagName(atual)).getText());
	}
	
	//M�todo para se comparar textos via xpath
	public void comparaXpath(String esperado, String atual) {
		Assert.assertEquals(esperado, driver.findElement(By.xpath(atual)).getText());
	}
	
	//M�todo para se selecionar elemento dentro de lista
	public void selecionaLista(String id_campo, String opcao) {
		Select multicombo = new Select(driver.findElement(By.name(id_campo)));
		multicombo.selectByVisibleText(opcao);
	}
	
	//M�todo para esperar a p�gina ser carregada
	public void waitForPage() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	//M�todo para se limpar campos lozalizados por xpath
	public void clearXpath(String id_campo) {
		driver.findElement(By.xpath(id_campo)).clear();
	}
	
	//M�todo para se alterar foco para o alerta
	public void alerta() {
	driver.switchTo().alert();
	}
	
	//M�todo para se esperar segundos
	public void waitSeconds(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//M�todo para se encontrar texto por xpath
	public void encontraXpth(String texto) {
		driver.findElement(By.xpath(texto));
	}
	
	//M�todo para mandar ENTER
	public void sendKeysEnter(String id_campo) {
		driver.findElement(By.xpath(id_campo)).sendKeys(Keys.ENTER);
	}

	//M�todo para saber se um elemento est� presente na p�gina
	public void checkElementPresence(String id_campo1, String id_campo2) {
		if(driver.findElements(By.xpath(id_campo1)).size() != 0){
		System.out.println("c�lula j� desmarcada!");
			}else{
			driver.findElement(By.xpath(id_campo2)).click();
			}
	}
	
	//M�todo para se contar elementos de uma lista
	public void countElementsList(String id_campo) {

		List<WebElement> dropdown = driver.findElements(By.xpath(id_campo));
		int count = dropdown.size();
		if (count > 2) {
		Assert.fail();
		}
	}
	
	//M�todo para se tirar screenshots
	public void takeScreenShot(String id_teste) throws IOException {
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(scrFile, new File("C:\\Users\\bruno.muramatsu\\Desktop\\Evid�ncias\\"+id_teste+".png"));
	}

	
	    public static String random(int quantidade) {

	        String result = RandomStringUtils.random(0, false, true);

	        // Creates a 64 chars length of random alphabetic string.
	        result = RandomStringUtils.randomAlphabetic(quantidade);
	       return result;

	    }
}
