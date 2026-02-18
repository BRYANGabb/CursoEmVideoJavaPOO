
package br.com.bryan.sistemadegestaodecinema;

public class Ingresso {
    private boolean ingresso;
    private Filme filme;
    private Espectador espectador;
    private int assento;

    public void venderIngresso(){
        if(this.getEspectador().getIdade() >= this.getFilme().getClassificacaoEtaria()){
            System.out.println("Ingresso vendido");
            this.setIngresso(true);
        } else {
            System.out.println("Espectador não tem idade suficiente");
        }
    }
    
    public void exibirRecibo(){
        if (this.getIngresso()){
            System.out.println("====== Recibo ======");
            System.out.printf(this.toString());
            System.out.println("==================");
        }
    }

    @Override
    public String toString() {
        return "Ingresso:\n" + " filme=" + this.filme.getTitulo() + "\n genero=" + this.filme.getGenero() +
                "\n duração=" + this.filme.getDuracaoMinutos() + "\n Faixa Etária=" + this.filme.getClassificacaoEtaria()+
                "\n espectador=" + this.espectador.getNome() + "\n assento=" + this.assento + '\n';
    }
    
    public Ingresso(Filme filme, Espectador espectador, int assento) {
        this.filme = filme;
        this.espectador = espectador;
        this.assento = assento;
        this.setIngresso(false);
    }

    public Filme getFilme() {
        return filme;
    }

    private void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    private void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public int getAssento() {
        return assento;
    }

    private void setAssento(int assento) {
        this.assento = assento;
    }

    public boolean getIngresso() {
        return ingresso;
    }

    private void setIngresso(boolean ingresso) {
        this.ingresso = ingresso;
    }
    
    
}
