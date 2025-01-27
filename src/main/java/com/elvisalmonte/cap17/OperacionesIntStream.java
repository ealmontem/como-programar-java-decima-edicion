package com.elvisalmonte.cap17;

import java.util.stream.IntStream;

public class OperacionesIntStream {
    public static void main(String[] args) {
        int[] valores = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        //Muestra valores originales

        System.out.println("Muestra los valores originales");
        IntStream.of(valores)
                .forEach(System.out::println);

        System.out.println();

        System.out.printf("%nCuenta: %d", IntStream.of(valores)
                .count());
        System.out.printf("%nMin: %d%n", IntStream.of(valores)
                .min().getAsInt());

        System.out.println(IntStream.of(valores)
                .summaryStatistics());




    }

}
