import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;
		
		System.out.println("Digite o primeiro Número Inteiro:");
		A = sc.nextInt();
		System.out.println("Digite o segundo Número Inteiro:");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Os valores são Múltiplos!");
		}
		
		else {
			System.out.println("Os valores não são Múltiplos!");
		}
		
		sc.close();

	}

}
