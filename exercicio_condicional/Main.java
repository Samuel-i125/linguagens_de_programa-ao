
public class Main {
    public static void main(String[] args) {
        boolean luz = true;
        if (luz) {
            System.out.println("Luz Acesa!");
        } else {
            System.out.println("Luz apagada");
        }

        luz = false;
        if (luz) {
            System.out.println("Luz Acesa!");
        } else {
            System.out.println("Luz apagada");
        }

        luz = true;
        String Mensagem = (luz) ? "luz acesa!" : "luz apagada";
        System.out.println(Mensagem); 

        int idade = 50;
        if (idade<12) {
            System.out.println ("Criança");
        } else if (idade >= 12 && idade<18) {
            System.out.println("Adolescente"); 
        } else if (idade >= 12 && idade<18) {
        System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
        


        
    }
    
}
