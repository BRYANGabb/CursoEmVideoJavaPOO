
package br.com.bryan.projetoyoutube14;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int curtidas;
    private int views;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.views = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", curtidas=" + curtidas + ", views=" + views + ", reproduzindo=" + reproduzindo + '}';
    }

    @Override
    public void play() {
        if (!this.isReproduzindo()){
            this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if (this.isReproduzindo()){
            this.setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }
    
}
