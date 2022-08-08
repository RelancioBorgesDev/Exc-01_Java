package Exc05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int peca1, peca2, nPeca1, nPeca2;
        double val1, val2;

        peca1 = sc.nextInt();
        nPeca1 = sc.nextInt();
        val1 = sc.nextDouble();

        peca2 = sc.nextInt();
        nPeca2 = sc.nextInt();
        val2 = sc.nextDouble();

        double valorAPagar = (val1 * nPeca1) + (val2 * nPeca2);

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", valorAPagar);

        sc.close();
    }
}
