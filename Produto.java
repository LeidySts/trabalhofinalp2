import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;
    private Categoria categoria;
    private List<Comentario> comentarios;


    public Produto(String nome, double preco, String descricao, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
        this.comentarios = new ArrayList<>();

    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
    
    @Override
    public String toString() {
        return nome + " - " + descricao + " (R$ " + preco + ")";
    }
}