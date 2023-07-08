import java.util.Locale;
import java.util.Scanner;

public class Bee1010_CalculoSimples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2 ;
		double valorPeca1, valorPeca2, valorTotal;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		valorTotal = valorPeca1 * numeroPeca1 + valorPeca2 * numeroPeca2; 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();

	}

}
