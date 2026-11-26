package Lista_de_exercicios_POO.ex4;

public class Carro {

    private String modelo;
    private int ano;
    private Motor motor;
    private Acessorio[] acessorios;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Acessorio[] getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(Acessorio[] acessorios) {
        this.acessorios = acessorios;
    }

    public void exibirDados() {

        System.out.println("===== DADOS DO CARRO =====");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);

        System.out.println("\n===== MOTOR =====");
        System.out.println("Modelo: " + motor.getModelo());
        System.out.println("Potência: " + motor.getPotencia());

        System.out.println("\n===== ACESSÓRIOS =====");

        for (Acessorio acessorio : acessorios) {
            System.out.println(acessorio.getNome() + " - R$ " + acessorio.getPreco());
        }
    }
}
