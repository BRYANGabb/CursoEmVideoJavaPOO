
package br.com.bryan.jogopersonagem;

public class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida){
        this.setNome(nome);
        this.setVida(vida);
    }
    
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    private void setVida(int vida) {
        this.vida = vida;
    }
    
    public void status(){
        System.out.println("Nome: " + getNome());
        if (this.getVida() > 0){
            System.out.println("Vida: " + getVida());
        } else{
            System.out.println("Morreu");
        }
        
    }
    
    public void sofrerDano(int dano){
         this.vida -= dano;
         
         if(this.getVida() < 0){
             this.vida = 0;
         }
         
         this.status();
    }
    
}
