package Lista_de_exercicios.ex26;

public class Main {
    public static void main(String[] args) {
        String[] alunos = {"Ana", "Carlos", "Mariana", "João"};

double[] notas = {8.5, 5.0, 9.0, 3.5};

double soma = 0;
double maior = notas[0];
double menor = notas[0];

System.out.println("===== RELATORIO =====\n");

int i = 0;

for (String aluno : alunos) {

    double nota = notas[i];

    soma += nota;

    if (nota > maior) {
        maior = nota;
    }

    if (nota < menor) {
        menor = nota;
    }

    if (nota > 7) {
        System.out.println(aluno + "    " + nota + "  APROVADO");
    } else if (nota < 5) {
        System.out.println(aluno + "    " + nota + "  REPROVADO");
    } else {
        System.out.println(aluno + "    " + nota + "  RECUPERACAO");
    }

    i++;
}

double media = soma / notas.length;

System.out.println("\nMédia da turma: " + media);
System.out.println("Maior nota: " + maior);
System.out.println("Menor nota: " + menor);
    }
    
}
