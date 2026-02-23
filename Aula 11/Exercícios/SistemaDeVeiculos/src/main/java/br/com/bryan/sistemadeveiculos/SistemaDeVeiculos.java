
package br.com.bryan.sistemadeveiculos;

import java.util.ArrayList;

public class SistemaDeVeiculos {

    public static void main(String[] args) {
        ArrayList <Veiculo> veiculo = new ArrayList<>();
        
        Veiculo c = new Carro("Civic");
        Veiculo m = new Moto("R15");
        c.setLigado(true);
        
        veiculo.add(m);
        veiculo.add(c);
        
        for(Veiculo v : veiculo){
            v.exibirInformacao();
        }
    }
}
