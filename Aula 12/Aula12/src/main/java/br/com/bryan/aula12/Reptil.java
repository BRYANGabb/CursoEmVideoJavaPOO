
package br.com.bryan.aula12;

public class Reptil extends Animal{
    protected String corEscama;
    
    public Reptil(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reptil{");
        sb.append("peso=").append(peso);
        sb.append(", idade=").append(idade);
        sb.append(", membros=").append(membros);
        sb.append(", corEscama=").append(corEscama);
        sb.append('}');
        return sb.toString();
    }
    
}
