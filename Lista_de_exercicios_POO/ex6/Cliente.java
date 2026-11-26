import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;

    private List<Endereco> enderecos;
    private List<Telefone> telefones;
    private List<Email> emails;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

        this.enderecos = new ArrayList<>();
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }
}
