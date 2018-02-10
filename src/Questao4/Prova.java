package Questao4;

public class Prova {

    private Gabarito gabarito;
    private int count = 0;
    private int numAcertos = 0;
    private float notaAluno = 0;
    private char[] respostas = new char[15];

    public Prova(Gabarito gabarito) {
        this.gabarito = gabarito;
    }

    public void respostaAluno(char resp) {
        if (count < respostas.length) {
            this.respostas[count] = resp;
            count++;
        }
    }

    public int acertos() {
        for (int i = 0; i < respostas.length; i++) {
            if (respostas[i] == gabarito.respostaQuestao(i)) {
                this.numAcertos++;
            }
        }
        return this.numAcertos;
    }

    public float nota() {
        for (int i = 0; i < 10; i++) {
            if (respostas[i] == gabarito.respostaQuestao(i)) {
                this.notaAluno = this.notaAluno + (float) 0.5;
            }
        }

        for (int i = 9; i < 15; i++) {
            if (respostas[i] == gabarito.respostaQuestao(i)) {
                this.notaAluno = this.notaAluno + (float) 1.0;
            }
        }

        return this.notaAluno;
    }

    public Float maior(Prova prova) {
        if (prova.numAcertos > this.numAcertos) {
            return prova.notaAluno;
        } else if (prova.numAcertos < this.numAcertos) {
            return this.notaAluno;
        } else if (prova.numAcertos == this.numAcertos) {
            if (prova.notaAluno > this.notaAluno) {
                return prova.notaAluno;
            } else if (prova.notaAluno < this.notaAluno) {
                return this.notaAluno;
            } else {
                return prova.notaAluno;
            }
        }
        return null;
    }
}
