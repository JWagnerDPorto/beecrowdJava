import java.util.Locale;
import java.util.Scanner;

public class Bee1154_Idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, cont = 0;
		int idade = sc.nextInt();
		
		while ( idade >= 0) {
			soma += idade;
			cont ++;
			idade = sc.nextInt();
		}
		
		double media = (double) soma / cont;
		
		System.out.printf("%.2f%n", media);
		
		sc.close();

	}

}
