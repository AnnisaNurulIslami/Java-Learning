import java.util.Scanner;

public class DistanceTwoPoint {
	public static void main(String[] args) {
		/* dik. vx = 60 km/h
		vy = 90 km/h
		1 km every 2 minutes
		dit. t = ...?
		*/

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = s * 2;

		System.out.printf("%d minutos\n", t);
	}
}