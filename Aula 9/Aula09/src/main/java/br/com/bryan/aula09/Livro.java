
package br.com.bryan.aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.pagAtual = pagAtual;
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    public void detalhes(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotalPaginas());
        System.out.println("Página Atual: " + this.getPagAtual());
        if(this.getAberto()){
            System.out.println("Livro aberto");
        } else{
            System.out.println("Livro fechado");
        }
        System.out.println("Leitor: " + this.getLeitor().getNome());
    }
    
    public void verificarProgresso(){
        int progresso = (this.getPagAtual() * 100) / this.getTotalPaginas();
        System.out.println("Você já leu " + progresso +"% do livro");
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPadinas) {
        this.totalPaginas = totalPadinas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
        public void abrir() {
            if (!this.getAberto()){
                this.setAberto(true);
                System.out.println("Livro aberto");
                this.setPagAtual(1);
            } else{
                System.out.println("Livro já está aberto");
            }
    }

    @Override
    public void fechar() {
        if(this.getAberto()){
            this.setAberto(false);
            System.out.println("Livro fechado");
            this.setPagAtual(0);
        } else{
            System.out.println("Livro já está fechado");
        }
    }

    @Override
    public void folhear(int pagina) {
        if (this.getAberto()){
            if (pagina <= this.getTotalPaginas() || pagina > 0){
                this.setPagAtual(pagina);
                System.out.println("Página atual: " + this.getPagAtual());
            } else {
                System.out.println("Número de páginas inválido.");
                System.out.println("Total de páginas: " + this.getTotalPaginas());
            }
        } else{
            System.out.println("Livro está fechado");
        }
        
    }

    @Override
    public void avancarPagina() {
        if (this.getPagAtual() < this.getTotalPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Página atual: " + this.getPagAtual());
        }
    }

    @Override
    public void voltarPagina() {
        if(this.getPagAtual() > 1){
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Página atual: " + this.getPagAtual());
        }
    }
}
