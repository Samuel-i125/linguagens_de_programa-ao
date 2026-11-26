import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private String data;
    private List<Produtos> produtos;

    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
}