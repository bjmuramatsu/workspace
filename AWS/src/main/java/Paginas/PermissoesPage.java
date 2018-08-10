package Paginas;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DSL.DSL;

public class PermissoesPage {

	private DSL dsl;
	private WebDriver driver;

	public PermissoesPage(WebDriver driver) {
		this.driver = driver;
		dsl = new DSL(driver);

	}

	// M�todo para se habilitar a vis�o de c�lulas para agentes
	public void displayCelulasAgentes() {
		dsl.clicaXpath(
				"//td[1][contains(.,'C�lulas')]//following::td[1]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de chamadas para agentes
	public void displayChamadasAgentes() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Chamadas')]//following::td[1]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de usu�rios para agentes
	public void displayUsuariosAgentes() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Usu�rios')]//following::td[1]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de relat�rios para agentes
	public void displayRelatoriosAgentes() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Relat�rios')]//following::td[1]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de permiss�es para agentes
	public void displayPermissoesAgentes() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Permiss�es')]//following::td[1]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de opera��es para agentes
	public void displayOperacoesAgentes() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Opera��es')]//following::td[1]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de configura��es CTI para agentes
	public void displayConfigCTIAgentes() {
		dsl.clicaXpath(
				"//td[1][contains(.,'CTI')]//following::td[1]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// m�todo para se habilitar a vis�o de configura��es gerais para agentes
	public void displayConfigGeralAgentes() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Configura��o Geral')]//following::td[1]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}
	
	//M�todo para se habilitar a vis�o de motivos de pausa para agentes
	public void displayMotivosPausaAgentes() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Motivos de Pausa')]//following::td[1]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");	
	}

	// M�todo para se habilitar a vis�o de c�lulas para supervisores
	public void displayCelulasSupervisores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'C�lulas')]//following::td[2]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de chamadas para supervisores
	public void displayChamadasSupervisores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Chamadas')]//following::td[2]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de usu�rios para supervisores
	public void displayUsuariosSupervisores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Usu�rios')]//following::td[2]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de relat�rios para supervisores
	public void displayRelatoriosSupervisores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Relat�rios')]//following::td[2]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de permiss�es para supervisores
	public void displayPermissoesSupervisores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Permiss�es')]//following::td[2]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de opera��es para supervisores
	public void displayOperacoesSupervisores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Opera��es')]//following::td[2]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de configura��o CTI para supervisores
	public void displayConfigCTISupervisores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'CTI')]//following::td[2]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de configura��es gerais para supervisores
	public void displayConfigGeralSupervisores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Configura��o Geral')]//following::td[2]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	//M�todo para se habilitar a vis�o de pausas para supervisores
	public void displayMotivosPausaSupervisores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Motivos de Pausa')]//following::td[2]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");	
	}
	// M�todo para se habilitar a vis�o de c�lulas para administradores
	public void displayCelulasAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'C�lulas')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}
	
	//M�todo para se habilitar a vis�o de opera��es para administradores
	public void displayOperacoesAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Opera��es')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de chamadas para administradores
	public void displayChamadasAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Chamadas')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de usu�rios para administradores
	public void displayUsuariosAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Usu�rios')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de tabula��es para administradores
	public void displayTabulacoesAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Tabula��es')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de relat�rios para administradores
	public void displayRelatoriosAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Relat�rios')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de permiss�es para administradores
	public void displayPermissoesAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Permiss�es')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de opera��es para administradores
	public void displaysOperacoesAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Opera��es')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�o de configura��o CTI para administradores
	public void displayConfigCTIAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'CTI')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}

	// M�todo para se habilitar a vis�i de configura��es gerais para administradores
	public void displayConfigGeralAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Configura��o Geral')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");
	}
	
	public void displayMotivosPausaAdministradores() {
		dsl.clicaXpath(
				"//td[1][contains(.,'Motivos de Pausa')]//following::td[3]//p-checkbox[@class='ng-untouched ng-pristine ng-valid']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");
		dsl.clicaXpath("//button[contains(.,'Confirmar')]");	
	}

	// M�todo para se desmarcar todas as op��es marcadas nos agentes
	public void unselectAllSelectdPermissionsAgentes() {

		dsl.checkElementPresence(
				"//td[1][contains(.,'C�lulas')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'C�lulas')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Chamadas')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Chamadas')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Usu�rios')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Usu�rios')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Tabula��es')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Tabula��es')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Relat�rios')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Relat�rios')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Permiss�es')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Permiss�es')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Opera��es')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Opera��es')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'CTI')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'CTI')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Configura��o Geral')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Configura��o Geral')]//following::td[1]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");

	}

	// M�todo para se desmarcar todas as opera��es marcadas nos supervisores
	public void unselectAllSelectedPermissionsSupervisores() {

		dsl.checkElementPresence(
				"//td[1][contains(.,'C�lulas')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'C�lulas')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Chamadas')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Chamadas')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Usu�rios')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Usu�rios')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Tabula��es')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Tabula��es')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Relat�rios')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Relat�rios')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Permiss�es')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Permiss�es')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Opera��es')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Opera��es')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'CTI')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'CTI')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Configura��o Geral')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Configura��o Geral')]//following::td[2]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");

	}

	// M�todo para se desmarcar todas as opera��es marcadas nos administradores
	public void unselectAllSelectedPermissionsAdministradores() {

		dsl.checkElementPresence(
				"//td[1][contains(.,'C�lulas')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'C�lulas')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Chamadas')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Chamadas')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Usu�rios')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Usu�rios')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Tabula��es')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Tabula��es')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Relat�rios')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Relat�rios')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Permiss�es')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Permiss�es')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Opera��es')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Opera��es')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'CTI')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'CTI')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.checkElementPresence(
				"//td[1][contains(.,'Configura��o Geral')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable']",
				"//td[1][contains(.,'Configura��o Geral')]//following::td[3]/p-checkbox/div/div[2]/span[@class='ui-chkbox-icon ui-clickable pi pi-check']");
		dsl.clicaXpath("//button[contains(.,'Salvar')]");

	}

	// M�todo para se contar o n�mero de permiss�es mostradas na lista
	public void countPermissoesDisponiveis() {
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//li[@class='nav-item dropdown']"))
				.click();
		dsl.countElementsList("//div[@class='collapse navbar-collapse']//li[1]//div[@class='dropdown-menu show']/a");

	}

}
