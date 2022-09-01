import java.util.Scanner;

public class Taxes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float t = scan.nextFloat();
		float tax = 0;

		if (t>=0.00 && t<=2000.00) {
			System.out.println("Isento");
		}
		else if (t>=2000.01 && t<=3000.00) {
			tax += (t-2000.00)*8/100;
			System.out.printf("R$ %.2f\n", tax);
		}
		else if (t>=3000.01 && t<=4500.00) {
			tax += 1000.00*8/100;
			tax += (t-3000)*18/100;
			System.out.printf("R$ %.2f\n", tax);
		}
		else {
			tax += 1000.00*8/100;
			tax += 1500.00*18/100;
			tax += (t-4500.00)*28/100;
			System.out.printf("R$ %.2f\n", tax);
		}
	}
}