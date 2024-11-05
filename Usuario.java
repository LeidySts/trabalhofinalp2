import java.util.ArrayList;
import java.util.List;


// Classe Usuario
public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private List<Endereco> enderecos;
    private List<Comentario> comentarios;


    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.enderecos = new ArrayList<>();
        this.comentarios = new ArrayList<>();

    }


    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Usuário: ").append(nome).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("Endereços:\n");
        for (Endereco endereco : enderecos) {
            sb.append(" - ").append(endereco).append("\n");
        }
        sb.append("Comentários:\n");
        for (Comentario comentario : comentarios) {
            sb.append(" - ").append(comentario).append("\n");

        }
        return sb.toString();

    }
}