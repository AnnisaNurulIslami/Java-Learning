import java.util.Scanner;

public class BhaskaraFormula {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double r1 = ((-b + Math.sqrt((b*b) - (4*a*c))) / (2*a));
		double r2 = ((-b - Math.sqrt((b*b) - (4*a*c))) / (2*a));

		if ( ((b*b) - (4*a*c)) < 0 || a==0 ) {
			System.out.print("Impossivel calcular\n");
		}
		else {
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
	}
}