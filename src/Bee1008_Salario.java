import java.util.Locale;
import java.util.Scanner;

public class Bee1008_Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, numeroHoras;
		double valorHora, salarioFuncionario;
		
		numeroFuncionario = sc.nextInt();
		numeroHoras = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salarioFuncionario = numeroHoras * valorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salarioFuncionario);
		
		sc.close();

	}

}
