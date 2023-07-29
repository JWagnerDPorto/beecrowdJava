import java.util.Locale;
import java.util.Scanner;

public class Bee1046_TempoDeJogo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal, duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = (24 - horaInicial) + horaFinal;
		}
		
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
		
		
		
		sc.close();
		
	}

}
