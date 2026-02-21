
package br.com.bryan.sistemadepagamentos;

public class Boleto extends Pagamento{

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return this.valor + (double) (2 * this.valor) / 100;
    }
    
}
