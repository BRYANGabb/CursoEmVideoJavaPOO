
package br.com.bryan.ufl;

import java.util.Random;

public class Luta {
    private Lutador desafiante; //Instância da classe Lutador
    private Lutador desafiado; // Outra instÂncia da classe Lutador
    private int rounds;
    private boolean aprovado;
   
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equalsIgnoreCase(l2.getCategoria())
                && l1 != l2){
            
            this.setDesafiante(l1);
            this.setDesafiado(l2);
            this.setAprovado(true);
        } else{
            this.setDesafiante(null);
            this.setDesafiado(null);
            this.setAprovado(false);
        }
    }
    
    public void luta(){
        if (this.getAprovado()){
            System.out.println("======= DESAFIANTE ========");
            this.getDesafiante().apresentar();
            System.out.println("======= DESAFIADO ========");
            this.getDesafiado().apresentar();
            
            Random aleatorio = new Random(); // Serve para números aletórios
          
            int vencedor = aleatorio.nextInt(3); // 0, 1, 2
            
            switch(vencedor){ 
                case 0: // Empate
                    System.out.println("======= RESULTADO ========");
                    System.out.println("Empate");
                    this.getDesafiante().empatarLuta();
                    this.getDesafiado().empatarLuta();
                    break;
                    
                case 1: // Vitória Desafiante
                    System.out.println("======= RESULTADO ========");
                    System.out.println("Vitória do " + this.getDesafiante().toString());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                    
                case 2: // Vitória Desafiado
                    System.out.println("======= RESULTADO ========");
                    System.out.println("Vitória do " + this.getDesafiado().toString());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                    
            }
            System.out.println("------------------------------------");
            this.getDesafiante().status();
            this.getDesafiado().status();
        } else{
            System.out.println("Luta não pode acontencer!");
        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    private void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
}
