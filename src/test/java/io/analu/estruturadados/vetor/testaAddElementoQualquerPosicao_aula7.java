package test.java.io.analu.estruturadados.vetor;

import main.java.io.analu.estruturadados.vetor.Vetor;

public class testaAddElementoQualquerPosicao_aula7 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.adicionaAtAnyPosition(0,"A");

        System.out.println(vetor);

        vetor.adicionaAtAnyPosition(3,"D");

        System.out.println(vetor);
    }
}
