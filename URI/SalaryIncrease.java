import java.util.Scanner;

public class SalaryIncrease {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float s = scan.nextFloat();

		if (s>=0.00 && s<=400.00) {
			System.out.printf("Novo salario: %.2f\n", s+(s*15/100));
			System.out.printf("Reajuste ganho: %.2f\n", s*15/100);
			System.out.printf("Em percentual: 15 %%\n");
		}
		else if (s>=400.01 && s<=800.00) {
			System.out.printf("Novo salario: %.2f\n", s+(s*12/100));
			System.out.printf("Reajuste ganho: %.2f\n", s*12/100);
			System.out.printf("Em percentual: 12 %%\n");
		}
		else if (s>=800.01 && s<=1200.00) {
			System.out.printf("Novo salario: %.2f\n", s+(s*10/100));
			System.out.printf("Reajuste ganho: %.2f\n", s*10/100);
			System.out.printf("Em percentual: 10 %%\n");
		}
		else if (s>=1200.01 && s<=2000.00) {
			System.out.printf("Novo salario: %.2f\n", s+(s*7/100));
			System.out.printf("Reajuste ganho: %.2f\n", s*7/100);
			System.out.printf("Em percentual: 7 %%\n");
		}
		else {
			System.out.printf("Novo salario: %.2f\n", s+(s*4/100));
			System.out.printf("Reajuste ganho: %.2f\n", s*4/100);
			System.out.printf("Em percentual: 4 %%\n");
		}
	}
}