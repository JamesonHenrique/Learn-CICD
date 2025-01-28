package com.jhcs;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int soma = calc.somar(2, 3);
        int subtracao = calc.subtrair(5, 2);
        int multiplicacao = calc.multiplicar(4, 3);
        int divisao = calc.dividir(10, 2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}