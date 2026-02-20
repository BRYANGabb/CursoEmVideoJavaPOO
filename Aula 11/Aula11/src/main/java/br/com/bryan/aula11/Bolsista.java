
package br.com.bryan.aula11;


public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa(){
        System.out.println("Renovada a bolsa do(a) " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade do(a) bolsista " + this.getNome() + " paga");
    }
    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados{");
        sb.append("nome=").append(this.getNome());
        sb.append(", idade=").append(this.getIdade());
        sb.append(", sexo=").append(this.getSexo());
        sb.append(", bolsa=").append(bolsa);
        sb.append('}');
        return sb.toString();
    }

    
    
}
