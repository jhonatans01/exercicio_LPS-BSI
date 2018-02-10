package Questao3;

import Questao2.Data;

public class Voo implements Cloneable{
    private Data dataVoo;
    private String numVoo;
    private int vagas = 100;
    private int ultOcupado;
    private int[][] assentos = null;

    public Voo(String numVoo, Data dataVoo) {
        this.dataVoo = dataVoo;
        this.numVoo = numVoo;
        this.vagas--;
        if (assentos == null) {
            this.assentos = new int[2][100];
            for (int i = 0; i < 100; i++) {
//                0 livre
//                1 ocupado
                this.assentos[0][i] = 0;
                this.assentos[1][i] = i;
            }
        }
    }

    public int vagas() {
        return vagas;
    }

    public boolean verifica(int num) {
        if (this.assentos[0][num] == 1){
            return false;
        } else {
            return true;
        }
    }

    public boolean ocupa(int num) {
        if (verifica(num)){
            this.assentos[0][num] = 1;
            return true;
        } else {
            return false;
        }
    }

    public int proximoLivre() {
        for (int i = 0; i < this.assentos.length; i++) {
            if (this.assentos[0][i] == 0) {
                return i;
            }
        }
        return 0;
    }

    public Data getData() {
        return this.dataVoo;
    }

    public String getVoo() {

        return this.numVoo;
    }

    @Override
    public Voo clone(){
        try {
            return (Voo) super.clone();
        } catch (CloneNotSupportedException c) {
            System.out.println("Erro ao clonar: " + c);
        }
        return null;
    }

    public static void main(String[] args) {
        Voo voo1 = new Voo("A123", new Data("03/04/2017"));
        if (voo1.ocupa(0)) System.out.println("Assento 0 ocupado");
        System.out.println("Próximo assento livre: " + voo1.proximoLivre());
        System.out.println("Número de vagas restantes: " + voo1.vagas());
        System.out.println("Assento 0 livre? " + voo1.verifica(0));
        Data dataVoo = voo1.getData();
        Voo voo2 = voo1.clone();
    }
}
