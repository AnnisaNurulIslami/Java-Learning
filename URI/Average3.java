import java.util.Scanner;
import java.io.IOException;

public class Average3 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		float n1 = scan.nextFloat();
		float n2 = scan.nextFloat();
		float n3 = scan.nextFloat();
		float n4 = scan.nextFloat();
		float ave = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;

		if (ave >= 7.0) {
			System.out.printf("Media: %.1f\n", ave);
			System.out.print("Aluno aprovado.\n");
		}
		else if (ave >= 5.0 && ave <= 6.9) {
			System.out.printf("Media: %.1f\n", ave);
			System.out.print("Aluno em exame.\n");
			float n5 = scan.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", n5);
			float ave2 = (ave+n5)/2;

			if (ave2 >= 5.0) {
				System.out.print("Aluno aprovado.\n");
			}
			else {
				System.out.print("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", ave2);
		}
		else if (ave < 5.0) {
			System.out.printf("Media: %.1f\n", ave);
			System.out.print("Aluno reprovado.\n");
		}
	}
}