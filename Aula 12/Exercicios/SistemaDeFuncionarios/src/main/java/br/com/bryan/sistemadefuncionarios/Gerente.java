
package br.com.bryan.sistemadefuncionarios;

public class Gerente extends Funcionario{

    @Override
    public float calcularBonus() {
        return (this.salario * 20) / 100;
    }

    @Override
    public void exibirDados() {
        System.out.println("Gargo: Gerente");
        super.exibirDados();
    }
    
}
