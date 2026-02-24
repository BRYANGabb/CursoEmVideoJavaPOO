
package br.com.bryan.aula12;

public class Ave extends Animal{
    protected String corPena;

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ave{");
        sb.append("peso=").append(peso);
        sb.append(", idade=").append(idade);
        sb.append(", membros=").append(membros);
        sb.append(", corPena=").append(corPena);
        sb.append('}');
        return sb.toString();
    }
    
}
