package com.example.Contador.ColecaoDados;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        NumeroPar();
        Palavras();
        Impar();
        Duplicata();
        ListaPrimos();
        Pessoa();
        Produto();
        Produto2();
    }

    public static void NumeroPar() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream().filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public static void Palavras() {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream().map(p -> p.toUpperCase()).forEach(System.out::println);
    }

    public static void Impar() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream().filter(n -> n % 2 != 0)
                .map(n -> n * 2).forEach(System.out::println);
    }

    public static void Duplicata() {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        palavras.stream().distinct().forEach(System.out::println);
    }

    public static boolean verificarPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void ListaPrimos() {

        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> listaPrimos = listaDeNumeros.stream().flatMap(List::stream)
                .filter(Principal::verificarPrimo).collect(Collectors.toList());
        System.out.println(listaPrimos);
    }

    public static void Pessoa() {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17),
                new Pessoa("Charlie", 19)
        );
        pessoas.stream().filter(pessoa -> pessoa.getIdade() > 18)
                .map(Pessoa::getNome).sorted().forEach(System.out::println);
    }

    public static void Produto() {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );
        List<String> listaEletronicos = produtos.stream().
                filter(p -> p.getCategoria().equals("Eletrônicos"))
                .filter(p -> p.getPreco() < 1000).sorted(Comparator.comparing(Produto::getPreco))
                .map(Produto::getNome).collect(Collectors.toList());
        listaEletronicos.forEach(System.out::println);
    }

    public static void Produto2() {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis"),
                new Produto("Mouse Gamer", 150.0, "Eletrônicos"),
                new Produto("Fone Bluetooth", 450.0, "Eletrônicos"),
                new Produto("Smart TV", 2200.0, "Eletrônicos"),
                new Produto("Luminária", 120.0, "Decoração"),
                new Produto("Câmera DSLR", 3500.0, "Eletrônicos"),
                new Produto("Microfone Condensador", 600.0, "Eletrônicos"),
                new Produto("Estante de Livros", 450.0, "Móveis")
        );
        List<String> listaEletronicos = produtos.stream().
                filter(p -> p.getCategoria().equals("Eletrônicos"))
                .filter(p -> p.getPreco() < 500).sorted(Comparator.comparing(Produto::getPreco)).limit(3)
                .map(Produto::getNome).collect(Collectors.toList());
        listaEletronicos.forEach(System.out::println);
    }
}
