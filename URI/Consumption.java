import java.util.Scanner;

public class Consumption {
	public static void main(String[] args) {
		double x, y;

		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();

		System.out.printf("%.3f km/l\n", x / y);
	}
}