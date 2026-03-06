
package br.com.bryan.projetoyoutube15;

class Visualizacao {
    private Gafanhoto user;
    private Video video;

    public Visualizacao(Gafanhoto user, Video video) {
        this.user = user;
        this.video = video;
        this.user.setTotAssistido(this.user.getTotAssistido() + 1);
        this.video.setViews(this.video.getViews() + 1);
    }
    
    public void avaliar(){
        this.video.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.video.setAvaliacao(5);
    }

    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.video.setAvaliacao(tot);
    }

    public Gafanhoto getUser() {
        return user;
    }

    public void setUser(Gafanhoto user) {
        this.user = user;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "user=" + user + "\nvideo=" + video + '}';
    }
    
}
