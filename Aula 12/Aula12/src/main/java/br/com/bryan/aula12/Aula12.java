
package br.com.bryan.aula12;

public class Aula12 {

    public static void main(String[] args) {
        /*Mamifero m = new Mamifero(14.5f, 8, 4, "Preto");
        Reptil r = new Reptil(1.45f, 21, 4, "Verde");
        Peixe p = new Peixe(5f, 10, 0, "Azul");
        Ave a = new Ave(3f, 4, 2, "Amarelo");
        
        System.out.println(m.toString());
        m.emitirSom();
        System.out.println("-----------------");
        System.out.println(r.toString());
        r.alimentar();
        System.out.println("-----------------");
        System.out.println(p.toString());
        p.locomover();
        p.soltarBolha();
        System.out.println("-----------------");
        System.out.println(a.toString());
        System.out.println("-----------------");*/
        
        Canguru m = new Canguru(14.5f, 8, 4, "Preto");
        Tartaruga r = new Tartaruga(1.45f, 21, 4, "Verde");
        Cachorro c = new Cachorro(13.4f, 3, 4, "Caramelo");
        System.out.println(m.toString());
        m.locomover();
        m.usarBolsa();
        System.out.println("-----------------");
        System.out.println(r.toString());
        r.locomover();
        System.out.println("-----------------");
        System.out.println(c.toString());
        c.abanarRabo();
        c.enterrarOsso();
        System.out.println("-----------------");

        
    }
}
