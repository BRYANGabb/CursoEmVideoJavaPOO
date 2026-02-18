
package br.com.bryan.leitura;

public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int atualPagina;
    
    public Livro(String titulo, String autor, int totPaginas){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPaginas(totPaginas);
        pagina1();
    }
    
    public void setTitulo(String t){
        this.titulo = t;
    }
    
    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getAtualPagina() {
        return atualPagina;
    }

    public void setAtualPagina(int atualPagina) {
        this.atualPagina = atualPagina;
    }
    
    public void pagina1(){
        this.atualPagina = 1;
    }
    
    public void avancarPagina(){
        if (getAtualPagina() < getTotalPaginas()){
            this.atualPagina++;
            System.out.println("Página " + getAtualPagina());
        } else {
            System.out.println("Livro finalizado!");
        }
    }
    
    public void voltarPagina(){
        if (getAtualPagina() > 1){
            this.atualPagina--;
            System.out.println("Página " + getAtualPagina());
        } else{
            System.out.println("Livro na primeira página!");
        }
    }
    
    public void statusLeitura(){
        System.out.println("Página Atual: " + getAtualPagina());
        System.out.println("Total de páginas " + getTotalPaginas());
    }
}
