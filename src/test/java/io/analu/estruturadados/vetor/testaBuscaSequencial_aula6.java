package test.java.io.analu.estruturadados.vetor;

import main.java.io.analu.estruturadados.vetor.Vetor;

public class testaBuscaSequencial_aula6 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.buscaSequencial("elemento 1"));
    }
}
