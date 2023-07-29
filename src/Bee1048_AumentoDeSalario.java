import java.util.Locale;
import java.util.Scanner;

public class Bee1048_AumentoDeSalario {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int percentual;
	double salario, novosalario, reajuste;
	
	salario = sc.nextDouble();
	
	if (salario <= 400.00) {
		
		novosalario = salario * 1.15;
		reajuste = novosalario - salario;
		percentual = 15;	
		
	} else if (salario <= 800.00 ) {
		novosalario = salario * 1.12;
		reajuste = novosalario - salario;
		percentual = 12;
		
	} else if (salario <= 1200.00 ) {
		novosalario = salario * 1.10;
		reajuste = novosalario - salario;
		percentual = 10;
		
	} else if (salario <= 2000.00 ) {
		novosalario = salario * 1.07;
		reajuste = novosalario - salario;
		percentual = 7;
		
	} else {
		novosalario = salario * 1.04;
		reajuste = novosalario - salario;
		percentual = 4;
		
	}
	
	System.out.printf("Novo salario: %.2f%n", novosalario);
	System.out.printf("Reajuste ganho: %.2f%n", reajuste);
	System.out.println("Em percentual: " + percentual + " %");
				
		
	sc.close();
	}

}
