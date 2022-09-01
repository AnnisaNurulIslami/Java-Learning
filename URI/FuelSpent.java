import java.util.Scanner;

public class FuelSpent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		double v = sc.nextDouble();

		double fs = (v * t) / 12;

		System.out.printf("%.3f\n", fs);
	}
}