import java.util.Scanner;

public class Uang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double value = sc.nextDouble();
		int[] notas = {100, 50, 20, 10, 5, 2};
		double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

		double money;
		System.out.println("NOTAS:");
		for (int i = 0; i < notas.length; i++) {
			money = value / notas[i];
			System.out.println((int) money + " nota(s) de R$ " + notas[i] + ",00");
			value = value % notas[i];
		}
		System.out.println("MOEDAS:");
		for (int i = 0; i < notas.length; i++) {
			money = (double) (value / moedas[i]);
			System.out.println((int) money + " moeda(s) de R$ " + String.format("%.2f", moedas[i]));
			value = (double) (value % moedas[i]);
		}
	}
}