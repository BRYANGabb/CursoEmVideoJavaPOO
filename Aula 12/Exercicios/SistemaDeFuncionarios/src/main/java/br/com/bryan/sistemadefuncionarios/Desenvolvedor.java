
package br.com.bryan.sistemadefuncionarios;

public class Desenvolvedor extends Funcionario{

    @Override
    public float calcularBonus() {
        return (this.salario * 10) / 100;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cargo: Desenvolvedor");
        super.exibirDados(); 
    }
    
    
}
