
package br.com.bryan.sistemadepagamentos;

public class CartaoCredito extends Pagamento{

    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return this.valor + (double) (5 * this.valor) / 100;
    }
    
}
