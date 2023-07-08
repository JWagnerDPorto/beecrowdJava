import java.util.Locale;
import java.util.Scanner;

public class Bee1014_Consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, S, maior;
		
		A = sc.nextInt();
		B = sc.nextInt();
		S = sc.nextInt();
		
		maior = (A + B + A * B * S +(A - B)) / 2;
		
		System.out.println(maior + "eh o maior");
		
		
		sc.close();

	}

}
