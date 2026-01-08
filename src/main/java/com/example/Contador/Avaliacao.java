package com.example.Contador;

import java.util.List;

public class Avaliacao<T> {
    private T item;
    private Double nota;
    private String comentario;

    public Avaliacao(T item, Double nota, String comentario) {
        if (nota<0||nota>10){
            throw new IllegalArgumentException("A nota precisa ser entre 0 e 10");
        }

        if (comentario == null || comentario.isBlank()) {
            throw new IllegalArgumentException("O comentário não pode estar vazio");
        }
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }

    public T getItem() {
        return item;
    }

    public Double getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setNota(Double nota) {
        if (nota<0||nota>10){
            throw new IllegalArgumentException("A nota precisa ser entre 0 e 10");
        }
        this.nota = nota;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public static <T> double calcularMedia(List<Avaliacao<T>> avaliacoes){
        double soma = 0;
        for (Avaliacao<T> avaliacao: avaliacoes){
            soma += avaliacao.getNota();
        }
        return soma/avaliacoes.size();
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "item=" + item + '\'' +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
