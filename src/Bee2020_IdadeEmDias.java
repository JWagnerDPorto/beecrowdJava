import java.util.Locale;
import java.util.Scanner;

public class Bee2020_IdadeEmDias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, anos, meses, dias, resto;
		
		N = sc.nextInt();
				
		anos = N / 365;
		resto = N % 365;
		
		meses = resto / 30;
		dias = resto % 30;
		
		
		System.out.printf("%d ano(s)%n", anos);
		System.out.printf("%d mes(es)%n", meses);
		System.out.printf("%d dia(s)%n", dias);
		
		
		sc.close();

	}

}
