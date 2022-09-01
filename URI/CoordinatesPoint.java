import java.util.Scanner;

public class CoordinatesPoint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float x = scan.nextFloat();
		float y = scan.nextFloat();

		if (x==0 && y==0) {
			System.out.print("Origem\n");
		}
		else if (x>0 && y>0) {
			System.out.print("Q1\n");
		}
		else if (x<0 && y>0) {
			System.out.print("Q2\n");
		}
		else if (x<0 && y<0) {
			System.out.print("Q3\n");
		}
		else if (y==0) {
			System.out.print("Eixo X\n");
		}
		else if (x==0) {
			System.out.print("Eixo Y\n");
		}
		else { 
			System.out.print("Q4\n");
		}
	}
}