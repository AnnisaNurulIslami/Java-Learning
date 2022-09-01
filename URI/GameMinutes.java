import java.util.Scanner;

public class GameMinutes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int shour, sminu, ehour, eminu, m = 0, h = 0;
		shour = sc.nextInt();
		sminu = sc.nextInt();
		ehour = sc.nextInt();
		eminu = sc.nextInt();

		if (shour==ehour && sminu==eminu && shour==eminu) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		else {
			if (shour>ehour) {
				h = 24 - shour + ehour;
			}
			else if (shour<ehour) {
				h = ehour - shour;
			}
			if (sminu>eminu) {
				m = 60 + eminu - sminu;
				if (shour == ehour) {
					h = 24 + h -1;
				}
				else {
					h = h - 1;
				}
			}
			else {
				m = eminu - sminu;
			}
			System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
		}
	}
}