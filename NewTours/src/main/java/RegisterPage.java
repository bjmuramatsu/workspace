import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//CLASSE PAGE REFERENTE AOS ELEMENTOS DA PÁGINA DE REGISTRO DE USUÁRIO
public class RegisterPage {
	
	private DSL dsl;
	public RegisterPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	                 //MÉTODOS DE LOCALIZAÇÃO//
	
	//Método para se preencher o primeiro nome
	public void setPrimeiroNome(String texto) {
		dsl.escreveNome("firstName", texto);
	}

	//Método para se preencher o sobrenome
	public void setSobrenome(String texto) {
		dsl.escreveNome("lastName", texto);
	}
	
	//Método para se preencher o telefone
	public void setTelefone(String texto) {
		dsl.escreveNome("phone", texto);
	}
	
	//Método para se preencher o email
	public void setEmail(String texto) {
		dsl.escreveNome("userName", texto);
	}
	
	//Método para se preencher o endereço
	public void setEndereco(String texto) {
		dsl.escreveNome("address1", texto);
	}
	
	//Método para se preencher a cidade
	public void setCidade(String texto) {
		dsl.escreveNome("city", texto);
	}
	
	//Método para se preencher o estado
	public void setEstado(String texto) {
		dsl.escreveNome("state", texto);
	}
	
	//Método para se preencher o código postal
	public void setCodigoPostal(String texto) {
		dsl.escreveNome("postalCode", texto);
	}
	
	//Método para se escolher o país
	public void setPais(String texto) {
		dsl.selecionaLista("country", texto);
	}
	
	//Método para se preencher o user name
	public void setUserName(String texto) {
		dsl.escreveId("email", texto);
	}
	
	//Método para se preencher o password
	public void setPassWord(String texto) {
		dsl.escreveNome("password", texto);
	}
	
	//Método para se confirmar o password
	public void setConfirmPassword(String texto) {
		dsl.escreveNome("confirmPassword", texto);
	}
	
	//Método para dar submit
	public void submit() {
		dsl.clicaNome("register");
	}
	
	//Método para se confirmar que o cadastro foi feito com sucesso
	public void confirma(String esperado) {
		dsl.comparaTag(esperado, "b");
	}
	
}
