
public class StaticAndNonStaticMethods {

	public static void main(String args[]) {
		
		nome("billy");
		xingamento("filho da puta");
		dormir(); //Erro pois n�o � um m�todo est�tico, para usar este m�todo eu tenho que criar um objeto dele mesmo
		
		
	}
	
	//M�todo est�tico
			public static void nome(String nome) {
				System.out.println("Ola meu nome � " + nome);
			}
			
	//M�todo est�tico 2 
			public static void xingamento(String xingamento) {
				System.out.println("Voc� � um " + xingamento);
			}
	
	//M�todo n�o est�tico
			public void dormir() {
				System.out.println("Estou dormindo");
			}
}
