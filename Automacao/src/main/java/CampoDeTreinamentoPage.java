
import org.openqa.selenium.WebDriver;

public class CampoDeTreinamentoPage {

	private DSL dsl;
	
	public CampoDeTreinamentoPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	//Método para se escrever no campo "nome"
	public void setNome(String nome) {
		
		dsl.escreve("elementosForm:nome", nome);
	}
	
	//Método para se escrever no campo "sobrenome"
	public void setSobrenome(String sobrenome) {
		
		dsl.escreve("elementosForm:sobrenome", sobrenome);
		
	}
	
	//Métodos para se escolher entre o sexo masculino e feminino
	
		//sexo masculino
		public void setSexoMasculino() {	
			dsl.clica("elementosForm:sexo:0");	
		}
		//sexo feminino
		public void setSexoFeminino() {	
			dsl.clica("elementosForm:sexo:1");		
		}
	
	//Métodos para se escolher a comida favorita

		//Comida favorita = carne
		public void setComidaCarne() {		
			dsl.clica("elementosForm:comidaFavorita:0");
		}
	
		//Comida favorita = Frango
		public void setComidafrango() {		
			dsl.clica("elementosForm:comidaFavorita:1");
		}
		
		//Comida favorita = Pizza
		public void setComidaPizza() {
			dsl.clica("elementosForm:comidaFavorita:2");
		}
		
		//Comida favorita = vegetariano
		public void setComidaVegetariano() {
			dsl.clica("elementosForm:comidaFavorita:3");
		}
	
}
