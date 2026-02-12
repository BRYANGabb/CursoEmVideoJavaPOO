
package br.com.bryan.sistemadebiblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private Leitor leitor;
    private Livro livro;
    private LocalDate data = LocalDate.now();
    
    public void fazerEmprestimo(Leitor leitor, Livro livro){
        this.leitor = leitor;
        this.livro = livro;
        
        if (!livro.getAberto()){
            livro.setAberto(true);
            System.out.println("Emprestimo: " + this.getLivro().getTitulo() + " para " + this.getLeitor().getNome());
        }
    }
    
    public void devolverLivro(){
        if (livro.getAberto()){
            livro.setAberto(false);
            leitor.setPontuacao(leitor.getPontuacao() + 1);
        }
    }

    public Leitor getLeitor() {
        return leitor;
    }

    private void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    private void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getData() {
        return data;
    }

    private void setData(LocalDate data) {
        this.data = data;
    }
    
    
}
