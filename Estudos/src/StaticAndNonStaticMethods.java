
public class StaticAndNonStaticMethods {

	public static void main(String args[]) {
		
		nome("billy");
		xingamento("filho da puta");
		dormir(); //Erro pois não é um método estático, para usar este método eu tenho que criar um objeto dele mesmo
		
		
	}
	
	//Método estático
			public static void nome(String nome) {
				System.out.println("Ola meu nome é " + nome);
			}
			
	//Método estático 2 
			public static void xingamento(String xingamento) {
				System.out.println("Você é um " + xingamento);
			}
	
	//Método não estático
			public void dormir() {
				System.out.println("Estou dormindo");
			}
}
