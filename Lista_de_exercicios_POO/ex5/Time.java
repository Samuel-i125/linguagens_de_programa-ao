import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private List<Jogador> jogadores;
    private EquipeTecnica equipeTecnica;

    public Time(String nome, String cidade, EquipeTecnica equipeTecnica) {
        this.nome = nome;
        this.cidade = cidade;
        this.equipeTecnica = equipeTecnica;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public EquipeTecnica getEquipeTecnica() {
        return equipeTecnica;
    }

    public void setEquipeTecnica(EquipeTecnica equipeTecnica) {
        this.equipeTecnica = equipeTecnica;
    }
}
