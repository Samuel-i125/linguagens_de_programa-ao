public class Main {
    public static void main(String[] args) {
        Carro car = new Carro ();
        car.marca = "Bugatti";
        car.modelo = "Cheron";
        car.combustivel = "Diesel";
        car.cor = "Preto";

        System.out.println(car.marca);
        System.out.println(car.modelo);
        System.out.println(car.combustivel);
        System.out.println(car.cor);
        car.LigarMotor();
        car.DesligarMotor();

        Moto mot = new Moto();
        mot.marca = "Honda";
        mot.modelo = "Fan";
        mot.combustivel = "Gasolina";
        mot.cilindradas = "160";

        System.out.println(mot.marca);
        System.out.println(mot.modelo);
        System.out.println(mot.combustivel);
        System.out.println(mot.cilindradas);
        mot.LigarMotor();
        mot.DesligarMotor();

        Balao bal = new Balao();
        bal.

        
    }
    
}
