
package br.com.bryan.cadastrousuario;

public class Usuario {
    private String nome;
    private String email;
    private String telefone;
    private int idade;

    public void cadastrar(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    
    public void cadastrar(String nome, String email, int idade){
        cadastrar(nome, email);
        this.idade = idade;
    }
    
    public void cadastrar(String nome, String email, String telefone){
        cadastrar(nome, email);
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
