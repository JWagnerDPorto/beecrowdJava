import java.util.Locale;
import java.util.Scanner;

public class Bee1061_TempoDeUmEvento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int W1, X1, Y1, Z1, W2, X2, Y2, Z2, dias, duracao, horas, minutos, segundos, resto;
		String texto;
		
		texto = sc.next();
		W1 = sc.nextInt();
		X1 = sc.nextInt();
		texto = sc.next();
		Y1 = sc.nextInt();
		texto = sc.next();
		Z1 = sc.nextInt();
		
		texto = sc.next();
		W2 = sc.nextInt();
		X2 = sc.nextInt();
		texto = sc.next();
		Y2 = sc.nextInt();
		texto = sc.next();
		Z2 = sc.nextInt();
		
		duracao = (24 * 3600 - (X1 * 3600 + Y1 * 60 + Z1)) + (X2 * 3600 + Y2 * 60 + Z2) + ((W2 - W1) - 1) * (24 * 3600);

		dias = duracao / (24 * 3600);
		resto = duracao % (24 * 3600);
		horas = resto / 3600;
		resto = resto % 3600;
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");
		
		
		
		sc.close();

	}

}
