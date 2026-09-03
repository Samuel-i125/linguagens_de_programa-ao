package exercicio_5_foreach;

public class Main {
     public static void main(String[] args) { 
     /*    String[] alunos = {"Miranata", "Savalo Horse", "Aeronauta"};

        alunos [0] = "Mariazinha";
        System.out.println("Qtd de Alunos " + alunos.length);
        
        for(String estudante : alunos ) {
            System.out.println(estudante);
        }
    } */ 
/* 
    String [] produto = {"Shampoo", "Sabonete", "Condicionador", "Pasta de dente", "Escova"};
    for (String Higiene : produto) {
    System.out.println (Higiene);
    } */

    /* String [] produto = {"Shampoo", "Sabonete", "Condicionador", "Pasta de dente", "Escova"};
    for (int i=0; i < produto.length; i++) {
        System.out.println (produto [i]);
    } */

    int[] numeros = {-1, 0, 3, 4, 5};
    
    for (int algarismo : numeros)

    if (algarismo > 0) {
        System.out.println ("Positivo " + algarismo);
    } else if (algarismo == 0 ) {
        System.out.println ("o numero " + algarismo);
    } else if (algarismo < 0) {
        System.out.println ( "Negativo " + algarismo);
    }
        }


    }



    


