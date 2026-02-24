
package br.com.bryan.aula12;

public class Canguru  extends Mamifero{
    
    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    
    @Override
    public void locomover() {
        System.out.println("Pulando");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Canguru{");
        sb.append('}');
        return sb.toString();
    }
    
}
