
package br.com.bryan.jogopersonagem;

import java.util.Scanner;

public class TestePersonagem {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Personagem personagem[] = new Personagem[2];
        
        /*for (int i = 0; i < personagem.length; i++){
            System.out.print("Nome do personagem: ");
            String nome = ler.nextLine();
            
            System.out.print("Vida do personagem: ");
            int vida = ler.nextInt();
            ler.nextLine();
                    
            personagem[i] = new Personagem(nome, vida);
            
        }*/
        
        personagem[0] = new Personagem("Brya", 100);
        personagem[1] = new Personagem("Gabriel", 230);
        
        
    }
}
