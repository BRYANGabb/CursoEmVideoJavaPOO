
package br.com.bryan.trabalho;

public class Trabalho {

    public static void main(String[] args) {
        Funcionario bryan = new Funcionario("Bryan Gabriel", "Engenheiro de Software", 4.546f);
        
        bryan.dadosFuncionario();
        bryan.reajusteSalario(5.000f);
        bryan.dadosFuncionario();
    }
}
