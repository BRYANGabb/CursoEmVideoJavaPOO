
package br.com.bryan.aula13;

public class Aula13 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        
        Lobo l = new Lobo();
        
        Cachorro c = new Cachorro();
        
        /*m.emitirSom();
        l.emitirSom();
        c.emitirSom();*/
        
        c.reagir(true);
        c.reagir(6, 6.6f);
        c.reagir("pulguento");
        c.reagir(14, 50);
    }
}
