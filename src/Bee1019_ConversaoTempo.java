import java.util.Scanner;

public class Bee1019_ConversaoTempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, horas, minutos, segundos, resto;
		
		N = sc.nextInt();
		
		horas = N / 3600;
		resto = N % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}

}
