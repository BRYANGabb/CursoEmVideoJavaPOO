
package br.com.bryan.projetoyoutube14;

public class ProjetoYouTube{

    public static void main(String[] args) {
       Video v[] = new Video[2]; 
       
       v[0] = new Video ("MInecraft PE");
       v[1] = new Video ("MInecraft Java");
       
       v[0].play();
       v[0].like();
       v[0].like();
       v[0].like();
       v[0].pause();
       
       System.out.println(v[0].toString());
       
       Gafanhoto g[] = new Gafanhoto[2];
       
       g[0] = new Gafanhoto("Bryan", 20, "M", "bryangabb");
       
        System.out.println(g[0].toString());
    }
}
