package Questao4;

public class Main {
    public static void main(String[] args) {
        Gabarito gabarito = new Gabarito();
        Prova p1 = new Prova(gabarito);
        p1.respostaAluno('B');
        p1.respostaAluno('A');
        p1.respostaAluno('E');
        p1.respostaAluno('C');
        p1.respostaAluno('A');
        p1.respostaAluno('D');
        p1.respostaAluno('D');
        p1.respostaAluno('E');
        p1.respostaAluno('A');
        p1.respostaAluno('B');
        p1.respostaAluno('C');
        p1.respostaAluno('E');
        p1.respostaAluno('E');
        p1.respostaAluno('E');
        p1.respostaAluno('D');

        Prova p2 = new Prova(gabarito);
        p2.respostaAluno('A');
        p2.respostaAluno('C');
        p2.respostaAluno('E');
        p2.respostaAluno('C');
        p2.respostaAluno('D');
        p2.respostaAluno('A');
        p2.respostaAluno('E');
        p2.respostaAluno('B');
        p2.respostaAluno('D');
        p2.respostaAluno('D');
        p2.respostaAluno('B');
        p2.respostaAluno('C');
        p2.respostaAluno('E');
        p2.respostaAluno('E');
        p2.respostaAluno('C');

        System.out.println("Acertos prova 1: " + p1.acertos());
        System.out.println("Acertos prova 2: " + p2.acertos());

        System.out.println("Nota prova 1: " + p1.nota());
        System.out.println("Nota prova 2: " + p2.nota());

        System.out.println("Maior nota: " + p1.maior(p2));
    }
}
