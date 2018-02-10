package Questao4;

public class Gabarito {

    private char[] questoes = {
            'A',
            'A',
            'E',
            'B',
            'C',
            'A',
            'E',
            'B',
            'D',
            'D',
            'B',
            'D',
            'E',
            'A',
            'C',
    };

    public char respostaQuestao(int numeroQuestao) {
        return questoes[numeroQuestao];
    }
}
