
package br.com.bryan.sistemadebiblioteca;

public class Leitor {
    private String nome;
    private int idade;
    private int pontuacao;

    public Leitor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.setPontuacao(0);
    }
    
     public void fazerAniversario(){
         this.setIdade(this.idade += 1);
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
     
     
}
