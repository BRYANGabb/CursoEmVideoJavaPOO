package br.com.bryan.curso;

public class Aluno {
    private String nome;
    private int matricula;
    private int idade;
    private boolean situacao;
    
    public Aluno(String n, int mat, int i, boolean sit){
        this.nome = n;
        this.matricula = mat;
        this.setIdade(i);
        this.setSituacao(sit);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setSituacao(boolean sit){
        this.situacao = sit;
    }
    
    public boolean getSituacao(){
        return this.situacao;
    }
    
    public void status(){
        System.out.println("Nome:" + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Idade: " + getIdade());
        System.out.println("Situação: " + getSituacao());
    }
}
