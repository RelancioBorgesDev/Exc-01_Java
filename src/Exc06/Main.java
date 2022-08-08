package Exc06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B ,C, PI;
        double ATriangulo, ACirculo, ATrapezio, AQuadrado, ARetangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        PI = 3.14159;

        ATriangulo = B * A / 2;
        ACirculo = PI * Math.pow(C, 2);
        ATrapezio = (A + B) /C * 2;
        AQuadrado = B * B;
        ARetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", ATriangulo);
        System.out.printf("CIRCULO: %.3f%n", ACirculo);
        System.out.printf("TRAPEZIO: %.3f%n", ATrapezio);
        System.out.printf("QUADRADO: %.3f%n", AQuadrado);
        System.out.printf("RETANGULO: %.3f%n", ARetangulo);

        sc.close();
    }
}
