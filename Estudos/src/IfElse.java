import java.util.Scanner;
public class IfElse {

	static Scanner ler = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		
	
		
		System.out.println("digite um número\n");
		int numero = ler.nextInt();
		
		if (numero >= 0 && numero <10) {
		System.out.println("Seu numero está entre 0 e 10");
		}
		if (numero >=10 && numero <100) {
			System.out.println("Seu numero está entre 10 e 100");
		}else {
			System.out.println("vai tomar no cu");
		}
		
		
	}
	
}
