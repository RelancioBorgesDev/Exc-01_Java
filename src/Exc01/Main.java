package Exc01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int soma = val1 + val2;
        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
