
package br.com.bryan.ufl;

public class UFL {

    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[6];
         
        lutadores[0] = new Lutador("Pretty Boy", "França", 31, (float) 1.75, (float) 68.9, 11, 3 , 1);
          
        lutadores[1] = new Lutador("PutsScrip", "Brasil", 29, (float) 1.68, (float) 57.8, 14, 2, 3);
        
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        lutadores[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        
        /*for (int i =0; i < lutadores.length; i++){
            lutadores[i].apresentar();
            System.out.println("---------------------------");
        }*/
        
        Luta ufl = new Luta();
        
        ufl.marcarLuta(lutadores[0], lutadores[1]);
        
        ufl.luta();
    }
}
