
package br.com.bryan.projetoyoutube15;

public class ProjetoYouTube {

    public static void main(String[] args) {
       Video v[] = new Video[2]; 
       
       v[0] = new Video ("MInecraft PE");
       v[1] = new Video ("MInecraft Java");
       
       Gafanhoto g[] = new Gafanhoto[2];
       
       g[0] = new Gafanhoto("Bryan", 20, "M", "bryangabb");
       g[1] = new Gafanhoto("Mirella", 20, "F", "MX");
       
       /*v[0].play();
       v[0].like();
       v[0].like();
       v[0].like();
       v[0].pause();
       
       System.out.println(v[0].toString());
       
       System.out.println(g[1].toString());*/
       
       Visualizacao vs[] = new Visualizacao[4];
       vs[0] = new Visualizacao(g[0], v[1]);
       vs[0].avaliar();
       
       System.out.println(vs[0].toString());
       
       vs[1] = new Visualizacao(g[0], v[1]);
       vs[1].avaliar(5);
       
        System.out.println("------------------------");
        System.out.println(vs[1].toString());
        
    }
}
