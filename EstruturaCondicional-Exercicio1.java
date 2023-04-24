import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;
		
		System.out.println("Digite um Número Inteiro:");
		x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("Este Número é Positivo!");
		}
		
		else if (x == 0) {
			System.out.println("Este Número é Neutro!");
		}
		
		else {
			System.out.println("Este Número é Negativo!");
		}
		
		
		sc.close();

	}

}
