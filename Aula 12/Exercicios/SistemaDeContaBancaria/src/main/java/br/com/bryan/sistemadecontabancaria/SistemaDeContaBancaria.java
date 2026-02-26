
package br.com.bryan.sistemadecontabancaria;

import java.util.ArrayList;

public class SistemaDeContaBancaria {

    public static void main(String[] args) {
        ArrayList <Conta> c = new ArrayList<>();
        
        ContaCorrente cc = new ContaCorrente();
        
        ContaPoupanca cp = new ContaPoupanca();
        
        c.add(cc);
        c.add(cp);
        
        cc.setNumeroConta(743);
        cc.setSaldo(2546.76);
        cc.setTitular("Bryan Gabriel");
        
        cp.setNumeroConta(546);
        cp.setSaldo(322);
        
        //cp.sacar(24.0);
        //cc.sacar(400);
        
        /*cp.exibirdados();
        System.out.println("---------------------");
        cc.exibirdados();
        System.out.println("-----------------------");
        cp.calcularTaxa();
        cc.calcularTaxa();*/
        
        for(Conta conta : c){
            conta.calcularTaxa();
            System.out.println("------------------");
        }
    }
}
