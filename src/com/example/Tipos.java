package com.example;

public class Tipos {
    public static void main(String[] args) {
        // 1. Numéricos:
        // 1.1. Enteros:
        byte byteVar1 = 8;
        short shortVar1 = 16;
        int intVar1 = 32;
        long longVar1 = 64;
        System.out.println(byteVar1);
        System.out.println(shortVar1);
        System.out.println(intVar1);
        System.out.println(longVar1);

        // 1.2. De punto flotante:
        float floatVar1 = 3.14f;
        double doubleVar1 = 3.14159267;
        System.out.println(floatVar1);
        System.out.println(doubleVar1);

        // Boleano
        boolean booleanVar1 = true;
        System.out.println(booleanVar1);

        // Texto
        String stringVar1 = "I am immutable!";
        char charVar1 = '\u0041';
        System.out.println(stringVar1);
        System.out.println(charVar1);
    }
}
