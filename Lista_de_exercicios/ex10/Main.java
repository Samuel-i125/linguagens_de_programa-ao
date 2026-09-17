package Lista_de_exercicios.ex10;

public class Main {
    public static void main(String[] args) {
        
        int soma = 0;

        for (int j = 2; j<101; j = j + 2) {
            System.out.print (j + "+");
            soma += j;
        }
        
        System.out.println ("Resultado: " + soma);
    }
    }
    
