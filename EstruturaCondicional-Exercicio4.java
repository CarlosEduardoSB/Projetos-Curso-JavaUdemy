import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal, duracaoJogo;

		System.out.println("Digite o Horário Inicial do Jogo:");
		horaInicial = sc.nextInt();
		System.out.println("Digite o Horário Final do Jogo:");
		horaFinal = sc.nextInt();

		if (horaInicial == horaFinal) {
			duracaoJogo = 24;
			System.out.printf("O Jogo durou %d Horas!", duracaoJogo);
		}

		else if (horaInicial < horaFinal) {
			duracaoJogo = horaFinal - horaInicial;
			System.out.printf("O Jogo durou %d Horas!", duracaoJogo);

		}

		else {
			duracaoJogo = (24 - horaInicial) + horaFinal;
			System.out.printf("O Jogo durou %d Horas!", duracaoJogo);
		}

		sc.close();

	}

}
