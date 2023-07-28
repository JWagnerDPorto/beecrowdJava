import java.util.Locale;
import java.util.Scanner;

public class Bee1035_TesteDeSelecao1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		if (B > C && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		
		sc.close();

	}

}
