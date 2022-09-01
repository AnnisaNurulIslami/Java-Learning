import java.util.Scanner;

public class BanknotesCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n, restNota, floatMoeda5;
        int nota100, nota50, nota20, nota10, nota5, nota2, rest;
        int moeda1, moeda5, moeda25, moeda10, moeda05, moeda01;

        n = sc.nextFloat();
        nota100 = (int) (n/100);
        rest = (int) (n%100);
        nota50 = rest/50;
        nota20 = (rest%50)/20;
        nota10 = ((rest%50)%20)/10;
        nota5 = (((rest%50)%20)%10)/5;
        nota2 = ((((rest%50)%20)%10)%5)/2;
        restNota = (float) (((((rest%50)%20)%10)%5)%2);

        moeda1 = (int) (restNota/1);
        floatMoeda5 = (float) ((restNota%1)/0.5);
        moeda5 = (int) (floatMoeda5);
        moeda25 = (int) (((restNota%1)%0.5)/0.25);
        moeda10 = (int) ((((restNota%1)%0.5)%0.25)/0.10);
        moeda05 = (int) (((((restNota%1)%0.5)%0.25)%0.10)/0.05);
        moeda01 = (int) ((((((restNota%1)%0.5)%0.25)%0.10)%0.05)/0.01);

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda5 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda05 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");
    }
}