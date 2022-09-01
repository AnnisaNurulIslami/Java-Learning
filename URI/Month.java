import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		String[] m = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

		if (month>=1 && month<=12) {
			System.out.println(m[month-1]);
		}
		else {
			System.out.println("Months of the year only up to 12");
		}

		/* another way use switch-case
		switch (month) {
			case 1: System.out.println("January"); break;
			case 2: System.out.println("February"); break;
			case 3: System.out.println("March"); break;
			case 4: System.out.println("April"); break;
			case 5: System.out.println("May"); break;
			case 6: System.out.println("June"); break;
			case 7: System.out.println("July"); break;
			case 8: System.out.println("August"); break;
			case 9: System.out.println("September"); break;
			case 10: System.out.println("October"); break;
			case 11: System.out.println("November"); break;
			case 12: System.out.println("December"); break;
			default: break;
		}
		*/
	}
}