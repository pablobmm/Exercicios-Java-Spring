package com.example.Contador.Lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Multiplicacao();
        NumeroPrimo();
        TransformarStrings();
        Palindromo();
        Lista3();
        ListaString();
        Divisao();
    }

    public static void Multiplicacao() {
        Calcular multiplicar = (a, b) -> a * b;
        int resultado = multiplicar.multiplicacao(6, 5);
        System.out.printf("o resultado da multiplicação dos números %d e %d é: %d%n", 6, 5, resultado);
    }

    public static void NumeroPrimo() {
        Numero_Primo numero_primo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(numero_primo.verificar_primo(17));
    }

    public static void TransformarStrings(){
        TransformarStrings StringMaiuscula = texto -> texto.toUpperCase();
        String resultado = StringMaiuscula.transformar("Carro");
        System.out.println(resultado);
    }

    public static void Palindromo(){
        Palindromo palindromo = texto -> texto.equals(new StringBuilder(texto).reverse().toString());
        System.out.println(palindromo.verificarPalindromo("arara"));
        System.out.println(palindromo.verificarPalindromo("casca"));
    }

    public static void Lista3() {
        List<Integer>lista = new ArrayList<>();
        lista.addAll(Arrays.asList(1,3,7,8,7));
        lista.replaceAll(n -> n*3);
        System.out.println(lista);
    }

    public static void ListaString() {
        List<String>lista = Arrays.asList("Vitoria","Julia","Dani","Gabi");
        lista.sort((a,b)->a.compareTo(b));
        System.out.println(lista);
    }

    public static void Divisao() {
        Divisor divisao = (a, b) -> {
          if (b == 0) throw new ArithmeticException("Não é possivel dividir por zero!");
          return a/b;
        };
        try {
            int resultado = divisao.divisao(16,4);
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}