
import org.openqa.selenium.WebDriver;

public class PaginaInicialPage {

private DSL dsl;
	
	public PaginaInicialPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	//M�todos para se fazer o login
		public void loginEmail(String email) {
			dsl.escreve("email", email);
		}
	//M�todo para se clicar em novo usu�rio
		public void newUser() {
			dsl.clicaLink("Novo usu�rio?");		
		}
		
	//M�todo para se entrar com o mome de um novo usu�rio
		public void setNome(String nome) {
			dsl.escreve("nome", nome);
		}
		
	//M�todo para se entrar com o email de um novo usu�rio
		public void setEmail(String email) {
			dsl.escreve("email", email);
		}
		
	//M�todo para se entrar com a senha de um novo usu�rio
		public void setSenha(String senha) {
			dsl.escreve("senha", senha);
		}
	//M�todo para se clicar no bot�o de cadastrar
		public void setCadastro() {
			dsl.clicaCss("input.btn.btn-primary");
		}
		
		//M�todo para se clicar no bot�o de entrar
		public void Entrar() {
			dsl.clicaCss("button.btn.btn-primary");
		}
		
	//M�todo para se validar a mensagem de sucesso de cadastro
		public void sucesso(String esperado, String atual) {
			dsl.comparaCSS(esperado, atual="div.alert.alert-success");
		}
		
	//M�todo para se adicionar uma nova conta
		public void adicionarConta(String texto) {
			dsl.clicaLink("Contas");
			dsl.clicaLink("Adicionar");
			dsl.escreve("nome", texto);
			dsl.clicaCss("button.btn.btn-primary");
		}
	//M�todo para se listar contas existentes
		public void listarContas() {
			dsl.clicaLink("Contas");
			dsl.clicaLink("listar");
		}
		
		
}
