package Paginas;
import org.openqa.selenium.WebDriver;
import DSL.DSL;

//SubP�gina da P�gina de c�lulas
public class ConfiguraCelulasPage  {

	public WebDriver driver;
	private DSL dsl;
	
	public ConfiguraCelulasPage(WebDriver driver) {
		this.driver = driver;
		dsl = new DSL(driver);
	
		}
	
	//M�todo para se editar o campo "URL Formu�rio"
		public void setURLFormulario(String texto) {
			dsl.clearXpath("//input[@formcontrolname='url_formulario']");
			dsl.escreveXpath("//input[@formcontrolname='url_formulario']", texto);
		}
		
	//M�todo para se editar o campo "URL Agendamento"
		public void setURLAgendamento(String texto) {
			dsl.clearXpath("//input[@formcontrolname='url_agendamento']");
			dsl.escreveXpath("//input[@formcontrolname='url_agendamento']", texto);
		}
		
	//M�todo para se editar o campo "Endere�o CTI"
		public void setEnderecoCTI(String texto) {
			dsl.clearXpath("//input[@formcontrolname='endereco_cti']");
			dsl.escreveXpath("//input[@formcontrolname='endereco_cti']", texto);
		}
		
	//M�todo para se editar o campo "Login CTI"
		public void setLoginCTI(String texto) {
			dsl.clearXpath("//input[@formcontrolname='login_cti']");
			dsl.escreveXpath("//input[@formcontrolname='login_cti']", texto);
		}
		
	//M�todo para se editar o campo "Senha CTI"
		public void setSenhaCTI(String texto) {
			dsl.clearXpath("//input[@formcontrolname='senha_cti']");
			dsl.escreveXpath("//input[@formcontrolname='senha_cti']", texto);
		}
		
	//M�todo para se editar o campo "Tipo de campanha"
		public void setTipoCampanha(String texto) {
			dsl.clearXpath("//input[@formcontrolname='tipo_campanha']");
			dsl.escreveXpath("//input[@formcontrolname='tipo_campanha']", texto);
		}
		
	//M�todo para se editar o campo "M�ximo de segundos inativo"
		public void setMaxSegundosInativo(String texto) {
			dsl.clearXpath("//input[@formcontrolname='max_segundos_inativo']");
			dsl.escreveXpath("//input[@formcontrolname='max_segundos_inativo']", texto);
		}	
		
	//M�todo para se editar o campo "M�ximo de segundos inativo ap�s aviso"
		public void setMaxSegundosInativoAviso(String texto) {
			dsl.clearXpath("//input[@formcontrolname='max_segundos_inativo_apos_aviso']");
			dsl.escreveXpath("//input[@formcontrolname='max_segundos_inativo_apos_aviso']", texto);
		}
		
	//M�todo para se editar o campo "Limite de minutos em pausa"
		public void setLimiteMinutosPausa(String texto) {
			dsl.clearXpath("//input[@formcontrolname='limite_minutos_em_pausa']");
			dsl.escreveXpath("//input[@formcontrolname='limite_minutos_em_pausa']", texto);
		}
		
	//M�todo para se editar o campo "Tipo CTI"
		public void setTipoCTI(String texto) {
			dsl.clearXpath("//input[@formcontrolname='tipo_cti']");
			dsl.escreveXpath("//input[@formcontrolname='tipo_cti']", texto);
		}
	
	//M�todo para se clicar no bot�o de salvar
		public void buttonSalvar() {
			dsl.clicaXpath("//button[contains(.,'SALVAR')]");
		}
	
	//M�todo para se clicar no bot�o de voltar
		public void buttonVoltar() {
			dsl.clicaXpath("//button[contains(.,'VOLTAR')]");
		}
}
