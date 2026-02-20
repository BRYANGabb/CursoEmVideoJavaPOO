
package br.com.bryan.aula11;

public class Professor extends Pessoa{
    private float salario;
    private String especialidade;

    public void receberAumento(float aumento){
        this.setSalario(this.getSalario() + aumento);
    }
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados{");
        sb.append("nome=").append(this.getNome());
        sb.append(", idade=").append(this.getIdade());
        sb.append(", sexo=").append(this.getSexo());
        sb.append("salario=").append(salario);
        sb.append(", especialidade=").append(especialidade);
        sb.append('}');
        return sb.toString();
    }
    
}
