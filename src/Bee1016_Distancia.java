import java.util.Locale;
import java.util.Scanner;

public class Bee1016_Distancia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia, minutos;
		
		distancia = sc.nextInt();
		
		minutos = distancia * 2;
		
		System.out.printf("%d minutos%n", minutos);
		
		sc.close();

	}

}
