import java.util.ArrayList;
import java.util.List;

public class EquipeTecnica {
    private String nome;
    private String departamento;
    private List<Membro> membros;
    private Tecnico tecnico;

    public EquipeTecnica(String nome, String departamento, Tecnico tecnico) {
        this.nome = nome;
        this.departamento = departamento;
        this.tecnico = tecnico;
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public void setMembros(List<Membro> membros) {
        this.membros = membros;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}