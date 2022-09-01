import java.io.IOException;
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) throws IOException {
        double a, b, c, tempA, tempB, tempC;
        Scanner input =new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        tempA = Math.max(a, Math.max(b, c));
        tempB = 0;
        tempC = 0;
  
        if (tempA == a) {
          tempB = Math.max(b, c);
          tempC = Math.min(b, c);
        }
        if (tempA == b) {
          tempB = Math.max(a, c);
          tempC = Math.min(a, c);
        }
        if (tempA == c) {
          tempB = Math.max(b, a);
          tempC = Math.min(b, a);
        }
        //------------------------------
        if (tempA >= (tempB + tempC)) {
          System.out.print("NAO FORMA TRIANGULO\n");
        }
        else if (tempA*tempA > ((tempB*tempB)+(tempC*tempC))) {
          System.out.print("TRIANGULO OBTUSANGULO\n");
        }
        if (tempA*tempA == ((tempB*tempB)+(tempC*tempC))) {
          System.out.print("TRIANGULO RETANGULO\n");
        }
        if (tempA*tempA < ((tempB*tempB)+(tempC*tempC))) {
          System.out.print("TRIANGULO ACUTANGULO\n");
        }
        if ((tempA == tempB) &&(tempA == tempC)) {
          System.out.print("TRIANGULO EQUILATERO\n");
        }
        if (((tempA == tempB) &&(tempA != tempC)) || ((tempA == tempC) &&(tempA != tempB)) || ((tempB == tempC) &&(tempB != tempA)) ) {
          System.out.print("TRIANGULO ISOSCELES\n");
        }
    }
}