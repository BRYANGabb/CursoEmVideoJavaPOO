
package br.com.bryan.sistemadegestaodecinema;

public class Espectador {
    private String nome;
    private int idade;

    public Espectador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }
    
}
