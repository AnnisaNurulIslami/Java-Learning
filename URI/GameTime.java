import java.util.Scanner;

public class GameTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		if (start>end) {
			System.out.print("O JOGO DUROU "  + (24+end-start) + " HORA(S)\n");
		}
		else if (start<end) {
			System.out.print("O JOGO DUROU "  + (end-start) + " HORA(S)\n");
		}
		else {
			System.out.print("O JOGU DUROU 24 HORA(S)\n");
		}
	}
}