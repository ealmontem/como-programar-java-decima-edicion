package com.elvisalmonte.cap2;

import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;

        System.out.println("Escriba el primer entero:");
        numero1 = teclado.nextInt();
        System.out.println("Escriba el segundo entero:");
        numero2 = teclado.nextInt();
        suma = numero1 + numero2;

        System.out.printf("La suma es=%d%n",suma);

        if (numero1 == numero2)
            System.out.printf("%d == %d",numero1, numero2);
        if (numero1 != numero2)
            System.out.printf("%d != %d", numero1, numero2);




    }
}
