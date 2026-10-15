public class Personagem {
    String nome = "";
    int vida = 0;
    List<Tipo> tipo;
    List<Poder> poder;

    public Personagem(String nome, int vida, String tipo, String poder) {
        this.nome = nome;
        this.vida = vida;
        Tipo tipo1 = new Tipo (tipo);
        this.tipo.add(tipo1);
        Poder poder1 = new Poder(poder);
        this.poder.add(poder1);
    }

    public void setNome (String nome ) {
        this.nome = nome;
    }

    public String getNome () {
        return this.nome;
    }

    public void setVida(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return this.vida;
    }

    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Spyderman", 10, "Alienigena", "Voar");
        Personagem personagem2 = new Personagem("Ben 10", 10, "Mutante", "Transformar");

        System.out.println(personagem1.getNome());
        System.out.println(personagem2.getNome());
    }

}
