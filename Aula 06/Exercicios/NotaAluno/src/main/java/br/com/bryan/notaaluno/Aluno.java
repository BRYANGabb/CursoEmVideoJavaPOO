
package br.com.bryan.notaaluno;

public class Aluno extends AlunoBase {
    private String nome;
    private int idade;
    private float nota1;
    private float nota2;
    private boolean matriculado;
    
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.nota1 = 0;
        this.nota2 = 0;
        this.matriculado = true;
    }

    public float getNota1() {
        return nota1;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNota1(float nota1) {
        if (this.getMatriculado() == true){
            if (nota1 >= 0 && nota1 <= 10){
                this.nota1 = nota1;
            } else {
                System.out.println("Nota Inválida!");
                System.out.println("Nota entre 0 à 10");
            }
        } else{
            System.out.println("Matricula: Inativa");
        }
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        if (this.getMatriculado() == true){
            if (nota2 >= 0 && nota2 <= 10){
                this.nota2 = nota2;
            } else {
                System.out.println("Nota Inválida!");
                System.out.println("Nota entre 0 à 10");
            }
        } else{
            System.out.println("Matricula: Inativa");
        }
    }

    private void setMatriculado(boolean matricula){
        this.matriculado = matricula;
    }
    
    public boolean getMatriculado(){
        return this.matriculado;
    }
    
    @Override
    public String verificarSituacao() {
        if (this.calcularMedia() >= 7){
            return "Aprovado";
        } else if(this.calcularMedia() >= 5){
            return "Recuperação";
        } else{
            return "Reprovado";
        }
    }

    @Override
    public float calcularMedia() {
        return (this.getNota1() + this.getNota2()) / 2;
    }

    @Override
    public void trancarMatricula() {
        if (this.getMatriculado() == true){
            if (this.calcularMedia() < 7){
                this.setMatriculado(false);
                System.out.println("Matricula: Tracada");
            }
        } else{
            System.out.println("Matricula: Inativa");
        }
    }

    @Override
    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("1° nota: " + this.getNota1());
        System.out.println("2° nota: " + this.getNota2());
        System.out.println("Média: " + this.calcularMedia());
        System.out.println("Situação: " + this.verificarSituacao());
        if (this.getMatriculado() == true){
            System.out.println("Matricula: Ativa");
        } else {
            System.out.println("Matricula: Inativa");
        }
    }
    
}
