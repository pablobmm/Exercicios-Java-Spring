package com.example.Contador.service;
import com.example.Contador.Avaliacao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class MenuPrincipal {
    public void mostrarMenu() {
        /*
        Exercicio 1
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número para a contagem: ");
		var numero = scanner.nextInt();
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
		/*
		Exercicio 3
		Tarefa tarefa = new Tarefa("limpar o quarto",false,
		"Roberta");

		Exercicio 4
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("tarefa.json"),tarefa);
		System.out.println("Dados foram salvos em tarefa.json");

		Exercicio 5
		Tarefa tarefaLida = mapper.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println(tarefaLida);
		 */

		//Exercicio 6
		try {
			Avaliacao<String> avalProduto = new Avaliacao<>("Celular", 9.5, "Excelente câmera");
			Avaliacao<String> avalServico = new Avaliacao<>("Manutenção do carro", 10.0, "Ótimo serviço");
			Avaliacao<String> avalAssinatura = new Avaliacao<>("Spotify", 8.5, "Bom preço");

			List<Avaliacao<String>> listaAvaliacoes = new ArrayList<>();
			listaAvaliacoes.add(avalProduto);
			listaAvaliacoes.add(avalServico);
			listaAvaliacoes.add(avalAssinatura);

			System.out.println("Lista de Avaliações Formatada:");
			listaAvaliacoes.forEach(System.out::println);

			System.out.printf("%nA média das avaliações: %.2f%n", Avaliacao.calcularMedia(listaAvaliacoes));

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

    }
}
