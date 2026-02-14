
package br.com.bryan.sistemadegestaodecinema;

public class SistemaDeGestaoDeCinema {

    public static void main(String[] args) {
        Espectador p[] = new Espectador[3];
        
        p[0] = new Espectador("Bryan", 20);
        p[1] = new Espectador("Mirella", 15);
        p[2] = new Espectador("Rickeson", 12);
        
        Filme f[] = new Filme[5];
        
        f[0] = new Filme("Divertida Mente 2", "Animação", 96, 0);
        f[1] = new Filme("Spider-Man", "Ação", 140, 10);
        f[2] = new Filme("Oppenheimer", "Drama/Histórico", 180, 16);
        f[3] = new Filme("Deadpool & Wolverine", "Ação/Comédia", 127, 18);
        f[4] = new Filme("Interestelar", "Ficção Científica", 169, 10);
        
        Ingresso i[] = new Ingresso[3];
        
        i[0] = new Ingresso(f[3], p[1], 1);
        i[1] = new Ingresso(f[4], p[0], 10);
        i[2] = new Ingresso(f[1], p[2], 8);
        
        i[0].venderIngresso();
        i[0].exibirRecibo();
        i[1].venderIngresso();
        i[1].exibirRecibo();
        i[2].venderIngresso();
        i[2].exibirRecibo();
    }
}
