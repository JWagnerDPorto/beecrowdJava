import java.util.Locale;
import java.util.Scanner;

public class Bee1009_SalarioComBonus {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeVendedor;
		double salarioFixo, totalVendas, totalReceber;
		
		nomeVendedor = sc.next();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();
		
		totalReceber = totalVendas * 0.15 + salarioFixo;
		
		System.out.printf("TOTAL = R$ %.2f%n", totalReceber);
		
		
		sc.close();

	}

}
