
package br.com.bryan.aula12;

public class Mamifero extends Animal{
    protected String corPelo;
    
    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mamifero{");
        sb.append("peso=").append(peso);
        sb.append(", idade=").append(idade);
        sb.append(", membros=").append(membros);
        sb.append(", corPelo=").append(corPelo);
        sb.append('}');
        return sb.toString();
    }
}
