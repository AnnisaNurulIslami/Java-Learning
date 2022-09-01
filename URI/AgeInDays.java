import java.util.Scanner;

public class AgeInDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int rest;

		System.out.printf("%d ano(s)\n", age / 365);
		rest = age % 365;

		System.out.printf("%d mes(es)\n", rest / 30);
		rest = rest % 30;

		System.out.printf("%d dia(s)\n", rest);
	}
}