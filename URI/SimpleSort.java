import java.util.*;

public class SimpleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] min = {a, b, c};
		int[] array = {a, b, c};
		Arrays.sort(min);

		for (int d : min) {
			System.out.println(d);
		}
		System.out.println();
		
		for (int e : array) {
			System.out.println(e);
		}
	}
}