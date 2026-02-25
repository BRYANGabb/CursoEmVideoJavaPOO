
package br.com.bryan.aula12;

public class Aula12 {

    public static void main(String[] args) {

        Animal a1 = new Gato(13.4f, 3, 4, "Caramelo");
        Animal a2 = new Cachorro(6.7f, 8, 4, "Branco");
        Animal a3 = new Tartaruga(1.45f, 21, 4, "Verde");
        
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        a3.locomover();
        
        
    }
}
