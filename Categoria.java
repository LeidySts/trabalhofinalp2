import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    private List<Produto> produtos;

    public Categoria(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();

    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }


    // Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    
    @Override
    public String toString() {
        return nome;
    }

}