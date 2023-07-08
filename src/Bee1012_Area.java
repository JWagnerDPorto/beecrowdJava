import java.util.Locale;
import java.util.Scanner;

public class Bee1012_Area {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, trianguloRetangulo, circulo, trapezio, quadrado, retangulo, pi;
		
		pi = 3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		trianguloRetangulo = (A * C) / 2;
		circulo = pi * C * C;
		trapezio = ((A + B) / 2) * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		
		sc.close();
	}

}
