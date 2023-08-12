package com.example;

public class Operadores {
    public static void main(String[] args) {
        int currVal = 2;
        int operand;
        int result;

        // 1. Aritméticos
        System.out.println("Operadores aritméticos:");
        // Suma
        operand = 3;
        result = currVal + operand;
        System.out.format("Suma: %d + %d = %d%n", currVal, operand, result);
        currVal = result;

        // Resta
        operand = 9;
        result = currVal - operand;
        System.out.format("Resta: %d - %d = %d%n", currVal, operand, result);
        currVal = result;

        // Multiplicación
        operand = -2;
        result = currVal * operand;
        System.out.format("Multiplicación: %d × %d = %d%n", currVal, operand, result);
        currVal = result;

        // División
        operand = 2;
        result = currVal / operand;
        System.out.format("División: %d ÷ %d = %d%n", currVal, operand, result);
        currVal = result;

        // Módulo o residuo de división
        operand = 3;
        result = currVal % operand;
        System.out.format("Residuo de: %d ÷ %d = %d%n", currVal, operand, result);

        // 2. Post-incremento, pre-incremento, post-decremento y pre-decremento
        System.out.println("\nOperadores de incremento (++) y decremento (--):");
        System.out.format("Valor inicial: %d%n", currVal);
        System.out.format("Durante la llamada del post-incremento: %d++ = %d%n", currVal, currVal++);
        System.out.format("Después del post-incremento y antes del pre-incremento: %d%n", currVal);
        System.out.format("Durante la llamada al pre-incremento: ++%d = %d%n", currVal, ++currVal);
        System.out.format("Después del pre-incremento y antes del post-decremento: %d%n", currVal);
        System.out.format("Durante la llamada del post-decremento: %d-- = %d%n", currVal, currVal--);
        System.out.format("Después del post-decremento y antes del pre-decremento: %d%n", currVal);
        System.out.format("Durante la llamada del pre-decremento: --%d = %d%n", currVal, --currVal);
        System.out.format("Después del pre-decremento: %d%n", currVal);

        // 3. Boleanos y comparación
        System.out.println("\nOperadores boleanos y de comparación:");
        operand = 7;
        boolean boolResult = currVal == operand;
        System.out.printf("Igualdad: [es] %d == [igual que] %d? Resultado: %b%n", currVal, operand, boolResult);

        boolResult = currVal > operand;
        System.out.printf("Mayor que: [es] %d > [mayor que] %d? Resultado: %b%n", currVal, operand, boolResult);

        boolResult = currVal >= operand;
        System.out.printf("Mayor o igual que: [es] %d >= [mayor o igual que] %d? Resultado: %b%n", currVal, operand, boolResult);
        operand = currVal;
        boolResult = currVal >= operand;
        System.out.printf("Mayor o igual que: [es] %d >= [mayor o igual que] %d? Resultado: %b%n", currVal, operand, boolResult);
        operand = -9;
        boolResult = currVal >= operand;
        System.out.printf("Mayor o igual que: [es] %d >= [mayor o igual que] %d? Resultado: %b%n", currVal, operand, boolResult);

        operand = 7;
        boolResult = currVal < operand;
        System.out.printf("Menor que: [es] %d < [menor que] %d? Resultado: %b%n", currVal, operand, boolResult);
        boolResult = currVal <= operand;
        System.out.printf("Menor o igual que: [es] %d <= [menor o igual que] %d? Resultado: %b%n", currVal, operand, boolResult);
        operand = currVal;
        boolResult = currVal <= operand;
        System.out.printf("Menor o igual que: [es] %d <= [menor o igual que] %d? Resultado: %b%n", currVal, operand, boolResult);
        operand = -9;
        boolResult = currVal <= operand;
        System.out.printf("Menor o igual que: [es] %d <= [menor o igual que] %d? Resultado: %b%n", currVal, operand, boolResult);
        System.out.printf("Negación: !%b = %b y !%b = %b%n", boolResult, !boolResult, !boolResult, boolResult);

        // 3.bis. Ternario
        System.out.println("\nOperador ternario => {condición a evaluar} ? {resultado si la condición evalúa a verdadero} : {resultado si la condición evalúa a falso};");
        operand = 7;
        String stringResult1 = currVal > operand ? String.format("%d es mayor que %d", currVal, operand) : String.format("%d no es mayor que %d", currVal, operand);
        System.out.printf("Ternario: %d > %d ? \"%d es mayor que %d\" : \"%d no es mayor que %d\" = %s%n", currVal, operand, currVal, operand, currVal, operand, stringResult1);
        String stringResult2 = currVal < operand ? String.format("%d es menor que %d", currVal, operand) : String.format("%d no es menor que %d", currVal, operand);
        System.out.printf("Ternario: %d < %d ? \"%d es menor que %d\" : \"%d no es menor que %d\" = %s%n", currVal, operand, currVal, operand, currVal, operand, stringResult2);
    }
}
