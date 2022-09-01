import java.util.Scanner;

public class Snack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		if (x==1) {
			double z = (y*4.00);
			System.out.printf("Total: R$ %.2f", z);
		}
		else if (x==2) {
			double z = (y*4.50);
			System.out.printf("Total: R$ %.2f", z);
		}
		else if (x==3) {
			double z = (y*5.00);
			System.out.printf("Total: R$ %.2f", z);
		}
		else if (x==4) {
			double z = (y*2.00);
			System.out.printf("Total: R$ %.2f", z);
		}
		else {
			double z = (y*1.50);
			System.out.printf("Total: R$ %.2f", z);
		}
	}
}