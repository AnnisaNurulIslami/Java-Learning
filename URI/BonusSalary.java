import java.util.Scanner;
 
public class BonusSalary {
 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String name = scan.nextLine();
    double salary = scan.nextDouble();
    double sold = scan.nextDouble();
    double total = salary + sold*0.15;

    System.out.printf("TOTAL = R$ %.2f\n", total);
  }
}