import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;
    private Usuario usuario;
    
    public Carrinho(Usuario usuario) {
        this.usuario = usuario;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;

    }

    // Getters e Setters
    public List<Produto> getProdutos() {
        return produtos;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrinho de ").append(usuario.getNome()).append(":\n");
        for (Produto produto : produtos) {
            sb.append(" - ").append(produto).append("\n");
        }
        return sb .toString();
    }
}