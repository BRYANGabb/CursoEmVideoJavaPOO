
package br.com.bryan.sistemadepagamentos;

import java.util.ArrayList;

public class SistemaDePagamentos {

    public static void main(String[] args) {
        ArrayList <Pagamento> p = new ArrayList<>();
        

        
        p.add(new CartaoCredito(450));
        p.add(new CartaoCredito(80));
        p.add(new Boleto(450));
        p.add(new Boleto(450));
        
        for(Pagamento pagamento : p){
            pagamento.exibirValorFinal();
        }
        
    }
}
