package Lista_de_exercicios.ex4;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if (a>b && a>c) {
            System.out.println ("O nuemero maior eh: " + a);
        } else if (b>c && b>a) {
            System.out.println ("O numeros maior eh" + b);
        } else {
            System.out.println ("O numero maior eh " + c);
        }
    }
    
}
