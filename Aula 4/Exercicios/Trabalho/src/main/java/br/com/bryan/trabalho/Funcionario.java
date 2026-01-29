
package br.com.bryan.trabalho;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
    
    public void reajusteSalario(int valor){
        float reajuste = (float) (salario * valor) / 100;
        if(valor >= 1){
            salario += reajuste;
            System.out.printf("Valor do salário com reajuste: %.3f\n", salario);
        } else{
            System.out.println("Reajuste Inválido! Reajuste com valor negativo!");
        }
    }
    
    public void dadosFuncionario(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.printf("Salário: %.3f\n", getSalario());
    }
}
