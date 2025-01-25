package com.elvisalmonte.cap2;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;

        System.out.print("Escriba el primer entero: ");
        numero1 = teclado.nextInt();
        System.out.print("Escriba el segundo entero:");
        numero2 = teclado.nextInt();

        suma = numero1 + numero2;

        System.out.printf("La suma total es:%d%n",suma);
    }
}
