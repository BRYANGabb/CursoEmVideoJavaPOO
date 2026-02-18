
package br.com.bryan.leitura;

public class Leitura {

    public static void main(String[] args) {
        Livro l = new Livro("Diario de banana", "Ruok", 127);
        
        l.statusLeitura();
        //l.voltarPagina();
        l.avancarPagina();
        l.avancarPagina();
        l.avancarPagina();
        l.avancarPagina();
        l.setAtualPagina(126);
        l.avancarPagina();
        l.avancarPagina();
        l.avancarPagina();
        l.statusLeitura();
    }
}
