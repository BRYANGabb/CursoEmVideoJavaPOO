
package br.com.bryan.sistemadecontabancaria;

public class ContaPoupanca extends Conta{

    @Override
    public double calcularTaxa() {
        return (this.getSaldo() * 20) / 100;
    }
    
}
