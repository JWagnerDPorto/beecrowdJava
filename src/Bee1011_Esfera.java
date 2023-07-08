import java.util.Locale;
import java.util.Scanner;

public class Bee1011_Esfera {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, pi, volume;
		
		pi = 3.14159;
		R = sc.nextDouble();
		
		volume = (4 / 3.0) * pi * (R * R * R);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();

	}

}
