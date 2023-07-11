import java.util.Locale;
import java.util.Scanner;

public class Bee1013_OMaior {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B, C, maiorAB, maiorN;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		maiorAB = (A + B + Math.abs(A - B)) / 2;
		maiorN = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
		
		System.out.printf("%d eh o maior%n", maiorN);
		
		sc.close();
		
	}

}
