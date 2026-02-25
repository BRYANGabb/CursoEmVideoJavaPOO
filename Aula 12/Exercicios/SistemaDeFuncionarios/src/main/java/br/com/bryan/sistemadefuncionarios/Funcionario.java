
package br.com.bryan.sistemadefuncionarios;

public abstract class Funcionario {
    protected String nome;
    protected float salario;

    public abstract float calcularBonus();
    
    public void exibirDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.printf("Valor do bônus: " + this.calcularBonus() + "\n");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
