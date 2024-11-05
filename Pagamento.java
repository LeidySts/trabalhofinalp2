public class Pagamento {
    private double valor;
    private String metodo; // Cartão, PayPal, etc.

    public Pagamento(double valor, String metodo) {
        this.valor = valor;
        this.metodo = metodo;
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    
    @Override
    public String toString() {
        return "Pagamento de R$ " + valor + " via " + metodo;
    }
}