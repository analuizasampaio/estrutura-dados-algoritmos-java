package test.java.io.analu.estruturadados.vetor;

import main.java.io.analu.estruturadados.vetor.Vetor;

public class testaAumentoCapacidade_aula8 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);
    }
}
