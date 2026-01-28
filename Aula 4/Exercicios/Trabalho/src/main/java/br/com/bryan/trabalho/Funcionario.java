
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
    
    public void reajusteSalario(float valor){
        float reajusteSalario = valor;
        if (reajusteSalario > getSalario()){
            this.salario = reajusteSalario;
            System.out.printf("Novo salário: %.3f", getSalario());
        } else {
            System.out.println("Salário Inválido!");
            System.out.println("Reajuste menor ou igual do salário!");
        }
    }
    
    public void dadosFuncionario(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.printf("Salário: %.3f\n", getSalario());
    }
}
