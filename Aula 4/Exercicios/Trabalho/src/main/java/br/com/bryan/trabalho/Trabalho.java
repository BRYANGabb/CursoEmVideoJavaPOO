
package br.com.bryan.trabalho;

public class Trabalho {

    public static void main(String[] args) {
        Funcionario bryan = new Funcionario("Bryan Gabriel", "Engenheiro de Software", 4.000f);
        
        bryan.dadosFuncionario();
        bryan.reajusteSalario(-20);
        bryan.dadosFuncionario();
    }
}
