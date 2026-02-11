
package br.com.bryan.sistemadebiblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private boolean aberto;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
    }

    public void detalhes(){
        System.out.println("====== LIVRO ======");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        if (this.getAberto()){
            System.out.println("Livro sendo lido");
        } else{
            System.out.println("Livro na estante");
        }
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    
}
