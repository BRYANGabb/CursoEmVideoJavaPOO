
package br.com.bryan.ufl;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Métodos Especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
            int vit, int derrota, int empate) {
        
        
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vit;
        this.derrotas = derrota;
        this.empates = empate;
        this.setCategoria();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        } else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        } else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        } else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else{
           this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    // Métodos Públicos
    public void apresentar(){
        
            System.out.println("Nome: " + this.getNome());
            System.out.println("Nacionalidade: " + this.getNacionalidade());
            System.out.println(this.getIdade() + " anos");
            System.out.println(this.getAltura() + " m de altura");
            System.out.println("Pesando " + this.getPeso() +"kg ");
            System.out.println("Ganhou: " + this.getVitorias());
            System.out.println("Perdeu: " + this.getDerrotas());
            System.out.println("Empatou: " + this.getEmpates());
            
           
    }
    
    public void ganharLuta(){
       
            this.setVitorias(this.getVitorias() + 1);
        
    }
    
    public void perderLuta(){
        
            this.setDerrotas(this.getDerrotas() + 1);
        
    }
    
    public void empatarLuta(){
       
            this.setVitorias(this.getEmpates() + 1);
        
    }
    
    public void status(){
        
            System.out.println("Nome: " + this.getNome());
            System.out.println("Peso: " + this.getCategoria());
            System.out.println(this.getVitorias() + " vitórias");
            System.out.println(this.getDerrotas() + " derrotas");
            System.out.println(this.getEmpates() + " empates");
        
    }
    
}

