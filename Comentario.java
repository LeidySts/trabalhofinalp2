public class Comentario {
    private String texto;
    private Usuario autor;
    private Produto produto;

    public Comentario(String texto, Usuario autor, Produto produto) {
        this.texto = texto;
        this.autor = autor;
        this.produto = produto;
    }

    // Getters e Setters
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Usuario getAutor() {
        return autor;
    }
     public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    public Produto getProduto() {
        return produto;

    }
    public void setProduto(Produto produto) {
       this.produto = produto;
    }
    
    @Override
    public String toString() {
        return texto + " - por " + autor.getNome() + " sobre " + produto.getNome();
    }
}