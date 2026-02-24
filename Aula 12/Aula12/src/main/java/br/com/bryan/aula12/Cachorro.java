
package br.com.bryan.aula12;

public class Cachorro extends Mamifero{
    
    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    public void enterrarOsso(){
        System.out.println("Osso enterrado");
    }
    
    public void abanarRabo(){
        System.out.println("Rabo abanado");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au");
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cachorro{");
        sb.append('}');
        return sb.toString();
    }
    
}
