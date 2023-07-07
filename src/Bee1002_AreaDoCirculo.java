import java.util.Locale;
import java.util.Scanner;

public class Bee1002_AreaDoCirculo {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, n;
		
		n = 3.14159;
		
		raio = sc.nextDouble();
		
		area = n * raio * raio;
		
		System.out.printf("A= %.4f%n", area);
		
		
		
		
		sc.close();

	}

}
