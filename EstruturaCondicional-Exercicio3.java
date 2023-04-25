import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;
		
		System.out.println("Digite o primeiro Número Inteiro:");
		a = sc.nextInt();
		System.out.println("Digite o segundo Número Inteiro:");
		b = sc.nextInt();
		
		if (a % b == 0 || a % b == 0) {
			System.out.println("Os valores são Múltiplos!");
		}
		
		else {
			System.out.println("Os valores não são Múltiplos!");
		}
		
		sc.close();

	}

}
