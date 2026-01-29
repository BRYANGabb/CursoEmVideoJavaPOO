
package br.com.bryan.banco;

public class Banco {

    public static void main(String[] args) {
        ContaBancaria bryan = new ContaBancaria(0001, "Bryan Gabriel", 0);
        
        bryan.statusAtualConta();
        //bryan.depositarSaldo(0.550);
        //bryan.depositarSaldo(0);
        //bryan.sacarSaldo(0.550);
        bryan.sacarSaldo(3.000);
        bryan.fecharConta();
        bryan.statusAtualConta();
    }
}
