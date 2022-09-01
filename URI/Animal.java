import java.util.Scanner;

public class Animal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		String y = scan.nextLine();
		String z = scan.nextLine();

		if (x.equals("vertebrado") && y.equals("ave") && z.equals("carnivoro")) {
			System.out.println("aguia");
		}
		if (x.equals("vertebrado") && y.equals("ave") && z.equals("onivoro")) {
			System.out.println("pomba");
		}
		if (x.equals("vertebrado") && y.equals("mamifero") && z.equals("onivoro")) {
			System.out.println("homem");
		}
		if (x.equals("vertebrado") && y.equals("mamifero") && z.equals("herbivoro")) {
			System.out.println("vaca");
		}

		//-------------------------------------------------------------------------//
		
		if (x.equals("invertebrado") && y.equals("inseto") && z.equals("hematofago")) {
			System.out.println("pulga");
		}
		if (x.equals("invertebrado") && y.equals("inseto") && z.equals("herbivoro")) {
			System.out.println("lagarta");
		}
		if (x.equals("invertebrado") && y.equals("anelideo") && z.equals("hematofago")) {
			System.out.println("sanguessuga");
		}
		if (x.equals("invertebrado") && y.equals("anelideo") && z.equals("onivoro")) {
			System.out.println("minhoca");
		}
	}
}