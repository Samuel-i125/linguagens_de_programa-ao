package Lista_de_exercicios.ex20;

public class Main {
    public static void main(String[] args) {
        double[] notas = { 7.5, 4.0, 8.5, 5.5, 9.0, 3.5 };

for (double nota : notas) {
    if (nota > 7) {
        System.out.println(nota + "  Aprovado");
    } else if (nota < 5) {
        System.out.println(nota + "  Reprovado");
    } else {
        System.out.println(nota + "  Recuperacao");
    }
}
    }
    
}
