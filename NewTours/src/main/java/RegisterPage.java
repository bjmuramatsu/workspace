import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//CLASSE PAGE REFERENTE AOS ELEMENTOS DA P�GINA DE REGISTRO DE USU�RIO
public class RegisterPage {
	
	private DSL dsl;
	public RegisterPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	                 //M�TODOS DE LOCALIZA��O//
	
	//M�todo para se preencher o primeiro nome
	public void setPrimeiroNome(String texto) {
		dsl.escreveNome("firstName", texto);
	}

	//M�todo para se preencher o sobrenome
	public void setSobrenome(String texto) {
		dsl.escreveNome("lastName", texto);
	}
	
	//M�todo para se preencher o telefone
	public void setTelefone(String texto) {
		dsl.escreveNome("phone", texto);
	}
	
	//M�todo para se preencher o email
	public void setEmail(String texto) {
		dsl.escreveNome("userName", texto);
	}
	
	//M�todo para se preencher o endere�o
	public void setEndereco(String texto) {
		dsl.escreveNome("address1", texto);
	}
	
	//M�todo para se preencher a cidade
	public void setCidade(String texto) {
		dsl.escreveNome("city", texto);
	}
	
	//M�todo para se preencher o estado
	public void setEstado(String texto) {
		dsl.escreveNome("state", texto);
	}
	
	//M�todo para se preencher o c�digo postal
	public void setCodigoPostal(String texto) {
		dsl.escreveNome("postalCode", texto);
	}
	
	//M�todo para se escolher o pa�s
	public void setPais(String texto) {
		dsl.selecionaLista("country", texto);
	}
	
	//M�todo para se preencher o user name
	public void setUserName(String texto) {
		dsl.escreveId("email", texto);
	}
	
	//M�todo para se preencher o password
	public void setPassWord(String texto) {
		dsl.escreveNome("password", texto);
	}
	
	//M�todo para se confirmar o password
	public void setConfirmPassword(String texto) {
		dsl.escreveNome("confirmPassword", texto);
	}
	
	//M�todo para dar submit
	public void submit() {
		dsl.clicaNome("register");
	}
	
	//M�todo para se confirmar que o cadastro foi feito com sucesso
	public void confirma(String esperado) {
		dsl.comparaTag(esperado, "b");
	}
	
}
