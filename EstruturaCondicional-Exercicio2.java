import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;
		
		System.out.println("Digite um Número Inteiro:");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Este Número é Par!");
		}
		
		else {
			System.out.println("Este Número é Ímpar!");
		}
		
		
		sc.close();

	}

}
