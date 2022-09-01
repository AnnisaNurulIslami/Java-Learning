import java.util.Scanner;

public class TheGreatest {
	public static void main(String[] args) {
		int a, b, c, tg;

		a = new Scanner(System.in).nextInt();
		b = new Scanner(System.in).nextInt();
		c = new Scanner(System.in).nextInt();
		
		tg = a;
		if (a < b || a < c) {
			if (b < c) {
				tg = c;
			}
			else {
				tg = b;
			}
		}
		System.out.printf("%d eh o maior\n", tg);
	}
}