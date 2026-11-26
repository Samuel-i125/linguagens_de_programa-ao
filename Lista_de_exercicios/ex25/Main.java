package Lista_de_exercicios.ex25;

public class Main {
    public static void main(String[] args) {
        String[] alunos = {"Ana", "Carlos", "Mariana", "João", "Pedro"};

double[] notas = {8.5, 5.0, 9.0, 3.5, 7.0};

int i = 0;

for (String aluno : alunos) {

    if (notas[i] > 7) {
        System.out.println(aluno + "  Aprovado");
    } else if (notas[i] < 5) {
        System.out.println(aluno + "  Reprovado");
    } else {
        System.out.println(aluno + "  Recuperacao");
    }

    i++;
}
    }
    
}
