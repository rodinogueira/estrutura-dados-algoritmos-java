package com.rodrigonogueira.estruturadados.vetor.teste;

import com.rodrigonogueira.estruturadados.vetor.Vetor;

public class Aula02 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        // Adiciona elementos ao vetor
        vetor.adiciona("elemento1");
        vetor.adiciona("elemento2");
        vetor.adiciona("elemento3");

        // Imprime o vetor
        System.out.println("Vetor: " + vetor);
    }
}

