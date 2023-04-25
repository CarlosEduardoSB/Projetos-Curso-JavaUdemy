import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigoItem, quantidadeItem;
		double valorTotal;

		System.out.println("CÓDIGO  |      ITEM      |    VALOR    ");
		System.out.println("1         Hot Dog              R$ 4.00 ");
		System.out.println("2         X-Salada             R$ 4.50 ");
		System.out.println("3         X-Bacon              R$ 5.00 ");
		System.out.println("4         Torrada Simples      R$ 2.00 ");
		System.out.println("5         Refrigerante         R$ 1.50 ");
		
		System.out.println();
		System.out.println();

		System.out.println("Digite o Código do Item Desejado:");
		codigoItem = sc.nextInt();
		System.out.println("Digite a Quantidade do Item:");
		quantidadeItem = sc.nextInt();
		
		if (codigoItem == 1) {
			valorTotal = quantidadeItem * 4.00;
			System.out.printf("Valor Total do Pedido: R$ %.2f %n", valorTotal);
		}
		
		else if (codigoItem == 2) {
			valorTotal = quantidadeItem * 4.50;
			System.out.printf("Valor Total do Pedido: R$ %.2f %n", valorTotal);
		}
		
		else if (codigoItem == 3) {
			valorTotal = quantidadeItem * 5.00;
			System.out.printf("Valor Total do Pedido: R$ %.2f %n", valorTotal);
		}
		
		else if (codigoItem == 4) {
			valorTotal = quantidadeItem * 2.00;
			System.out.printf("Valor Total do Pedido: R$ %.2f %n", valorTotal);
		}
		 
		else if (codigoItem == 5) {
			valorTotal = quantidadeItem * 1.50;
			System.out.printf("Valor Total do Pedido: R$ %.2f %n", valorTotal);
		}
		
		else {
			System.out.println("Código de Item inexistente, escolha entre 1 a 5 !");
		}
		
		sc.close();

	}

}
