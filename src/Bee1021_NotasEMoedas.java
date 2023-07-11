import java.util.Locale;
import java.util.Scanner;

public class Bee1021_NotasEMoedas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int  notas, moedas;
		double N, resto;
		
		N = sc.nextDouble();
		
		System.out.println("NOTAS:");
		
		notas = (int) (N / 100);
		System.out.printf("%d nota(s) de R$ 100.00%n", notas);
		resto = N % 100;
		
		notas = (int) (resto / 50);
		System.out.printf("%d nota(s) de R$ 50.00%n", notas);
		resto = resto % 50;
		
		notas = (int) (resto / 20);
		System.out.printf("%d nota(s) de R$ 20.00%n", notas);
		resto = resto % 20;
		
		notas = (int) (resto / 10);
		System.out.printf("%d nota(s) de R$ 10.00%n", notas);
		resto = resto % 10;
		
		notas = (int) (resto / 5);
		System.out.printf("%d nota(s) de R$ 5.00%n", notas);
		resto = N % 5;
		
		notas = (int) (resto / 2);
		System.out.printf("%d nota(s) de R$ 2.00%n", notas);
		resto = resto % 2;
		
		System.out.println("MOEDAS:");
		
		resto = resto * 100;
		
		moedas = (int) (resto / 100);
		System.out.printf("%d moeda(s) de R$ 1.00%n", moedas);
		resto = resto % 100;
		
		moedas = (int) (resto / 50);
		System.out.printf("%d moeda(s) de R$ 0.50%n", moedas);
		resto = resto % 50;
		
		moedas = (int) (resto / 25);
		System.out.printf("%d moeda(s) de R$ 0.25%n", moedas);
		resto = resto % 25;
		
		moedas = (int) (resto / 10);
		System.out.printf("%d moeda(s) de R$ 0.10%n", moedas);
		resto = resto % 10;
		
		moedas = (int) (resto / 5);
		System.out.printf("%d moeda(s) de R$ 0.05%n", moedas);
		resto = resto % 5;
		
		moedas = (int) (resto / 1);
		System.out.printf("%d moeda(s) de R$ 0.01%n", moedas);
		
		sc.close();

	}

}
