
package br.com.bryan.aula12;

public class Gato extends Mamifero{
    
    public Gato(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
   
    public void arranhar(){
        System.out.println("Arranhou");
    }
    
}
