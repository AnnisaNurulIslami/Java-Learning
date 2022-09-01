import java.util.Scanner;

public class Banknotes {
	public static void main(String[] args) {
		int value, rest;

		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();

		System.out.printf("%d\n", value);
		System.out.printf("%d nota (s) de R$ 100,00\n", value / 100);
		rest = value % 100;

		System.out.printf("%d nota (s) de R$ 50,00\n", rest / 50);
		rest = rest % 50;

		System.out.printf("%d nota (s) de R$ 20,00\n", rest / 20);
		rest = rest % 20;

		System.out.printf("%d nota (s) de R$ 10,00\n", rest / 10);
		rest = rest % 10;

		System.out.printf("%d nota (s) de R$ 5,00\n", rest / 5);
		rest = rest % 5;

		System.out.printf("%d nota (s) de R$ 2,00\n", rest / 2);
		rest = rest % 2;

		System.out.printf("%d nota (s) de R$ 1,00\n", rest / 1);
	}
}