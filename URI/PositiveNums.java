import java.util.Scanner;

public class PositiveNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] input = new double[6];
		int positive = 0;
		int ave;
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextDouble();
			if (input[i]>0) {
				positive++;
			}
			
		}
		System.out.println(positive + " valores positivos");
	}
}