package test.java.io.analu.estruturadados.vetor;

import main.java.io.analu.estruturadados.vetor.VetorObjetos;

public class testaVetorObjetos_aula10 {
    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "12344567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "23456789", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "34567890", "contato3@email.com");
        Contato c4 = new Contato("Contato 1", "12344567", "contato1@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        vetor.adiciona(1);
        vetor.adiciona(2);
        vetor.adiciona(3);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c4);
        if (pos > -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }
}
