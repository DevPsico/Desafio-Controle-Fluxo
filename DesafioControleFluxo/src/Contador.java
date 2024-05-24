import java.util.Iterator;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();

		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();

		try {

				contar(numero1, numero2);
				
		} catch (ParametrosInvalidosException e) {
			
		}
	}

	public static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
		
		if(numero1 < numero2) {
		int resultado = numero2 - numero1; 
		
		for (int i = 0; i < resultado; i++) {
			
			System.out.println("Imprimindo o número: "+ (i + 1));
		}
		}else {
			System.out.println("O segundo número digitado deve ser maior que o primeiro.");
		}
	}
}