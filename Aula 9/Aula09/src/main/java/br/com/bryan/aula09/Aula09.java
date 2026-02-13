
package br.com.bryan.aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa pessoa[] = new Pessoa[2];
        
        pessoa[0] = new Pessoa("Bryan Gabriel", 20, "Masc");
        pessoa[1] = new Pessoa("Mirella", 20, "Feminino");
        
        Livro livro = new Livro("Solo Leveling", "Alguem", 230, pessoa[0]);
        
        livro.detalhes();
        livro.abrir();
        livro.folhear(150);
        livro.detalhes();
        livro.verificarProgresso();
        
    }
}
