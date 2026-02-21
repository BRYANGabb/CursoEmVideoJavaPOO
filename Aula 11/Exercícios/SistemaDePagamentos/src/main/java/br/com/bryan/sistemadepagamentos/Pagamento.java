
package br.com.bryan.sistemadepagamentos;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }
  
    public abstract double calcularTaxa();
    
    public void exibirValorFinal(){
        System.out.println("Valor final: " + this.calcularTaxa());
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
