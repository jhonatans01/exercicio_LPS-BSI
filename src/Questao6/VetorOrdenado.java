package Questao6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VetorOrdenado {

    private List vetor;

    public List getVetor() {
        return vetor;
    }

    public void setVetor(List vetor) {
        this.vetor = vetor;
    }

    public VetorOrdenado(int tamVetor) {
        vetor = new ArrayList<String>(tamVetor);
    }

    public void insert(String valor) {
        this.vetor.add(valor);
        Collections.sort(this.vetor);
    }

    public VetorOrdenado merge(VetorOrdenado vo) {
        vo.getVetor().addAll(this.vetor);
        Collections.sort(vo.getVetor());
        return vo;
    }

    public static void main(String[] args) {
        VetorOrdenado v1 = new VetorOrdenado(2);
        VetorOrdenado v2 = new VetorOrdenado(2);
        v1.insert("G");
        v1.insert("B");
        v1.insert("A");
        v2.insert("X");
        v2.insert("C");

        VetorOrdenado v3 = v1.merge(v2);
        for (int i = 0; i < v3.getVetor().size(); i++) {
            System.out.println(v3.getVetor().get(i));
        }
    }
}
