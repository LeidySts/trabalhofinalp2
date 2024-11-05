public class Pedido {
    private Carrinho carrinho;
    private String status;
    private Pagamento pagamento;

    public Pedido(Carrinho carrinho, Pagamento pagamento) {
        this.carrinho = carrinho;
        this.pagamento = pagamento;
        this.status = "Pendente";
    }

    public void processarPedido() {
        // Lógica para processar o pedido
        this.status = "Processado";
    }

    // Getters e Setters
    public Carrinho getCarrinho() {
        return carrinho;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
    
    @Override
    public String toString() {
        return "Pedido " + status + ":\n" + carrinho + "\n" + pagamento;
    }
}
