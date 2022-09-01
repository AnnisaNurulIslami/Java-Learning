import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();

		if ((float)(b+c)>a && (float)(a+c)>b && (float)(a+b)>c) {
			float perimeterTri = a+b+c;
			System.out.printf("Perimetro = %.1f\n", perimeterTri);
		}
		else {
			float areaTrapezium = ((a+b)*c)/2;
			System.out.printf("Area = %.1f\n", areaTrapezium);
		}
	}
}