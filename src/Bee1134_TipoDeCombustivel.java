import java.util.Scanner;

public class Bee1134_TipoDeCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo =0,
		alcool = 0,
		gasolina = 0,
		diesel = 0;
		
		
		while(codigo != 4 ){
			
			codigo = sc.nextInt();
			
			if (codigo < 0 || codigo > 4) {
				codigo = sc.nextInt();
			} 
			else if (codigo == 1) {
				alcool ++;
			}
			else if (codigo == 2) {
				gasolina ++;
			}
			else {
				diesel ++;
			}
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();

	}

	
		
}


