
package br.com.bryan.sistemadefuncionarios;

import java.util.ArrayList;

public class SistemaDeFuncionarios {

    public static void main(String[] args) {
        ArrayList <Funcionario> f = new ArrayList<>();
        
        Gerente g = new Gerente();
        Desenvolvedor d = new Desenvolvedor();
        
        f.add(g);
        f.add(d);
        
        g.setNome("Bryan");
        g.setSalario(1356.45f);
        
        d.setNome("Mirella");
        d.setSalario(3446.65f);
        
        for(Funcionario funcionario : f){
            funcionario.exibirDados();
        }
    }
}
