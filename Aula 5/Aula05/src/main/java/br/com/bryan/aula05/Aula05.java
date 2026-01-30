
package br.com.bryan.aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco bryan = new ContaBanco(0f, false);
        
        bryan.setTipo("CP");
        bryan.abrirConta();
        bryan.pagarMensalidade();
        bryan.statusGeral();
    }
}
