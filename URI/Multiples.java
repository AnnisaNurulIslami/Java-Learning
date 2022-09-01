import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a%b==0 || b%a==0) {
			System.out.print("Sao Multiplos\n");
		}
		else {
			System.out.print("Nao sao Multiplos\n");
		}
	}
}