import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seconds = sc.nextInt();
		int hours = seconds / 3600;
		seconds = seconds - (hours * 3600);

		int minutes = seconds / 60;
		seconds = seconds - (minutes * 60);

		System.out.printf("%d : %d : %d\n", hours, minutes, seconds);
	}
}