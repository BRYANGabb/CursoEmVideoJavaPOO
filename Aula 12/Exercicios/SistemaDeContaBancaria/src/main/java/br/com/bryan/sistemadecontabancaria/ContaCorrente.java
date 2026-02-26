
package br.com.bryan.sistemadecontabancaria;

public class ContaCorrente extends Conta{

    @Override
    public double calcularTaxa() {
        if (this.getSaldo() >= 15){
            return 15f;
        }
        return 0;
    } 
    
}
