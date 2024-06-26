package com.biblio;

public class Calculator {

    // Método que soma dois números inteiros e retorna o resultado
    public int add(int a, int b) {
        return a + b;
    }

    // Método principal para testar a funcionalidade
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 10);
        System.out.println("A soma de 2 e 10 é: " + result); // Deve imprimir "A soma de 2 e 3 é: 5"
    }
}

