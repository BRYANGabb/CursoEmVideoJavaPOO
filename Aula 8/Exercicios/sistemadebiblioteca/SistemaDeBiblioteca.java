
package br.com.bryan.sistemadebiblioteca;

public class SistemaDeBiblioteca {

    public static void main(String[] args) {
        
        Livro livro[] = new Livro[5];
        Leitor leitor[] = new Leitor[5];
        
        livro[0] = new Livro("Hunter X Hunter", "Yoshihiro Togashi");
        livro[1] = new Livro("Invencivel", "Robert Kirkman");
        
        leitor[0] =  new Leitor("Bryan", 20);
        leitor[1] =  new Leitor("Gabriel", 16);
        
        livro[0].detalhes();
        livro[1].detalhes();
        System.out.println(leitor[0].getPontuacao());
        
        Emprestimo emprestimo = new Emprestimo();
        
        emprestimo.fazerEmprestimo(leitor[0], livro[1]);
        livro[0].detalhes();
        livro[1].detalhes();
        emprestimo.devolverLivro();
        livro[0].detalhes();
        System.out.println(leitor[0].getPontuacao());
    }
}
