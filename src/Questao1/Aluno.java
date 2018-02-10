package Questao1;

public class Aluno {

    private String nome, mat;
    private Float notaprova1, notaprova2, notatrab;

    public Aluno(String nome, String mat) {
        this.nome = nome;
        this.mat = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public Float getNotaprova1() {
        return notaprova1;
    }

    public void setNotaprova1(Float notaprova1) {
        this.notaprova1 = notaprova1;
    }

    public Float getNotaprova2() {
        return notaprova2;
    }

    public void setNotaprova2(Float notaprova2) {
        this.notaprova2 = notaprova2;
    }

    public Float getNotatrab() {
        return notatrab;
    }

    public void setNotatrab(Float notatrab) {
        this.notatrab = notatrab;
    }


    public Float media() {
        return new Float((notaprova1 * 2.5 + notaprova2 * 2.5 + notatrab * 2) / (2.5 + 2.5 + 2));
    }

    public Float mfinal() {
        if (media() < 4.5) {
            return new Float(0.0);
        } else {
            return (50 - media() * 7) / 3;
        }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("Aluno 1", "M356");
        a.setNotaprova1(new Float(7.0));
        a.setNotaprova2(new Float(7.0));
        a.setNotatrab(new Float(5.0));
        System.out.printf("\nMédia: %.2f", a.media());
        System.out.printf("\nNota necessária na prova final: %.2f", a.mfinal());
    }
}
