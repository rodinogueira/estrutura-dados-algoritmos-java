package com.rodrigonogueira.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
    private final String[] elementos;
    private int tamanho; // para rastrear o tamanho atual do vetor

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0; // começa com tamanho 0, pois ainda não tem nenhum elemento
    }

    // Método para adicionar um elemento ao vetor
    public void adiciona(String elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++; // incrementa o tamanho após adicionar o elemento
        } else {
            throw new IllegalStateException("Capacidade máxima do vetor atingida");
        }
    }

    // Método para retornar uma representação em string dos elementos do vetor
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Vetor: [");
        for (int i = 0; i < tamanho; i++) {
            if (i > 0) {
                builder.append(", ");
            }
            builder.append(elementos[i]);
        }
        builder.append("]");
        return builder.toString();
    }
}
