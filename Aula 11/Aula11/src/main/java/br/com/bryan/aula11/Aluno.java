
package br.com.bryan.aula11;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga" + this.getNome());
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados{");
        sb.append("nome=").append(this.getNome());
        sb.append(", idade=").append(this.getIdade());
        sb.append(", sexo=").append(this.getSexo());
        sb.append(", matricula=").append(matricula);
        sb.append(", curso=").append(curso);
        sb.append('}');
        return sb.toString();
    }

    
    
}
