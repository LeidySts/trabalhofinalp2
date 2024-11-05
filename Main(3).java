public class Main {

    public static void main(String[] args) {

        // Exemplo de uso

        Usuario usuario = new Usuario("João", "joao@example.com", "senha123");

        Endereco endereco = new Endereco("Rua A", "Cidade B", "Estado C", "12345-678");

        usuario.adicionarEndereco(endereco);

        Categoria categoria = new Categoria("Roupas");

        // Primeiro produto
        Produto produto1 = new Produto("Camiseta", 29.99, "Camiseta de algodão", categoria);
        categoria.adicionarProduto(produto1);

        Comentario comentario1 = new Comentario("Ótima camiseta!", usuario, produto1);
        produto1.adicionarComentario(comentario1);

        // Segundo produto
        Produto produto2 = new Produto("Calça", 49.99, "Calça jeans", categoria);
        categoria.adicionarProduto(produto2);

        Comentario comentario2 = new Comentario("Muito confortável!", usuario, produto2);
        produto2.adicionarComentario(comentario2);

        Carrinho carrinho = new Carrinho(usuario);

        // Adicionando os produtos ao carrinho
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2); // Adicionando o segundo produto

        Pagamento pagamento = new Pagamento(79.98, "Cartão de Crédito"); // Atualize o valor total

        Pedido pedido = new Pedido(carrinho, pagamento);

        pedido.processarPedido();

        System.out.println(usuario);
        System.out.println(pedido);
        System.out.println(comentario1);
        System.out.println(comentario2);
        System.out.println("Pedido processado com sucesso!");

    }

}