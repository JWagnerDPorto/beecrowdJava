import java.util.Locale;
import java.util.Scanner;

public class Bee1159_SomaParesConsecutivos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X, soma = 0;
		
		X = sc.nextInt();
		
		while (X != 0) {
			
			
			if (X % 2 != 0) {
				X = X + 1;
			}
			
		
			soma = X + X + 2 + X + 4 + X + 6 + X + 8; 
			System.out.println(soma);
			
			X = sc.nextInt();
		}
		
	
		
		sc.close();

	}

}
