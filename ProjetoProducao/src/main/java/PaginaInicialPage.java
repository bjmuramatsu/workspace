
import org.openqa.selenium.WebDriver;

public class PaginaInicialPage {

private DSL dsl;
	
	public PaginaInicialPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	//Métodos para se fazer o login
		public void loginEmail(String email) {
			dsl.escreve("email", email);
		}
	//Método para se clicar em novo usuário
		public void newUser() {
			dsl.clicaLink("Novo usuário?");		
		}
		
	//Método para se entrar com o mome de um novo usuário
		public void setNome(String nome) {
			dsl.escreve("nome", nome);
		}
		
	//Método para se entrar com o email de um novo usuário
		public void setEmail(String email) {
			dsl.escreve("email", email);
		}
		
	//Método para se entrar com a senha de um novo usuário
		public void setSenha(String senha) {
			dsl.escreve("senha", senha);
		}
	//Método para se clicar no botão de cadastrar
		public void setCadastro() {
			dsl.clicaCss("input.btn.btn-primary");
		}
		
		//Método para se clicar no botão de entrar
		public void Entrar() {
			dsl.clicaCss("button.btn.btn-primary");
		}
		
	//Método para se validar a mensagem de sucesso de cadastro
		public void sucesso(String esperado, String atual) {
			dsl.comparaCSS(esperado, atual="div.alert.alert-success");
		}
		
	//Método para se adicionar uma nova conta
		public void adicionarConta(String texto) {
			dsl.clicaLink("Contas");
			dsl.clicaLink("Adicionar");
			dsl.escreve("nome", texto);
			dsl.clicaCss("button.btn.btn-primary");
		}
	//Método para se listar contas existentes
		public void listarContas() {
			dsl.clicaLink("Contas");
			dsl.clicaLink("listar");
		}
		
		
}
