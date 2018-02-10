package Questao5;

import java.util.ArrayList;
import java.util.List;

public class Vetor {

    private List vetor;

    public Vetor(int tamVetor) {
        vetor = new ArrayList<String>(tamVetor);
    }

    public void insert(String valor) {
        vetor.add(valor);
    }

    public String get(int pos) {
        try {
            return vetor.get(pos).toString();
        } catch (IndexOutOfBoundsException i) {
            return null;
        }
    }

    public int size() {
        return vetor.size();
    }

    public static void main(String[] args) {
        Vetor v = new Vetor(2);
        v.insert("A");
        v.insert("B");
        v.insert("C");
        v.insert("D");
        System.out.println("Valor: " + v.get(10));
        System.out.println("Valor: " + v.get(2));
        System.out.println("Tamanho: " + v.size());
    }
}
