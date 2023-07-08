import java.util.Locale;
import java.util.Scanner;

public class Bee1017_GastoDeCombustivel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo, velocidade, distancia;
		double litros;
		
		tempo = sc.nextInt();
		velocidade = sc.nextInt();
		
		distancia = tempo * velocidade;
		litros = distancia / 12.00;
		
		System.out.printf("%.3f%n", litros);
		
		sc.close();
	}

}
