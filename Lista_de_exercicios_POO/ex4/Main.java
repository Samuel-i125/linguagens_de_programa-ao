package Lista_de_exercicios_POO.ex4;

public class Main {

    public static void main(String[] args) {

        Motor motor = new Motor();
        motor.setModelo("V8");
        motor.setPotencia(450);

        Acessorio multimidia = new Acessorio();
        multimidia.setNome("Central Multimídia");
        multimidia.setPreco(1500);

        Acessorio camera = new Acessorio();
        camera.setNome("Câmera de Ré");
        camera.setPreco(500);

        Carro carro = new Carro();
        carro.setModelo("Mustang");
        carro.setAno(2025);
        carro.setMotor(motor);

        carro.setAcessorios(new Acessorio[] {
            multimidia,
            camera
        });

        carro.exibirDados();
    }
}
