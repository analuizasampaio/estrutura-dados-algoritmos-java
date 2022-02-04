package main.java.io.analu.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

        private String[] elementos;
        private int tamanho;

        public Vetor(int capacidade){

            this.elementos = new String[capacidade];
            this.tamanho = 0;
        }

//        public void adiciona(String elemento){
//            for (int i=0; i<this.elementos.length; i++){
//                if (this.elementos[i] == null){
//                    this.elementos[i] = elemento;
//                    break;
//                }
//            }
//        }
//        public void adiciona(String elemento) throws Exception{
//
//            if(this.tamanho < this.elementos.length){
//                this.elementos[this.tamanho] = elemento;
//                this.tamanho++;
//            } else{
//                throw new Exception("Vetor ja está cheio, impossivel adicionar mais");
//            }
//
//
//
//        }
        public boolean adiciona(String elemento) /*throws Exception*/ {

            if(this.tamanho < this.elementos.length){
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
                return true;
            }
            return false;
        }

//        public String getItem(int posicao){
//
//            if (!(posicao>=0 && posicao<tamanho)){
//                throw new IllegalArgumentException("Posição invalida");
//            }
//            return this.elementos[posicao];
//        }

        public int buscaSequencial(String elemento){

            for (int i=0; i<this.tamanho; i++){
                if (this.elementos[i].equals(elemento)){
                    return i;
                }
            }
            return -1;
        }

        public int getTamanho(){
            return this.tamanho;
        }

    @Override
    public String toString() {

//            String s = "[";
//
//            for (int i=0; i<this.tamanho-1; i++){
//                s += this.elementos[i];
//                s += ", ";
//            }
//
//            if (this.tamanho>0){
//                s+= this.elementos[this.tamanho-1]
//            }
//
//            s += "]";
//
//        return "Vetor{" +
//                "elementos=" + Arrays.toString(elementos) +
//                ", tamanho=" + tamanho +
//                '}';
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}


