
package br.com.bryan.aula11;

public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p = new Pessoa();
        
        Visitante v = new Visitante();
        v.setNome("Alice");
        v.setIdade(77);
        v.setSexo("F");
        System.out.println(v.toString());
        
        Aluno a = new Aluno();
        a.setNome("Bryan");
        a.setIdade(20);
        a.setSexo("M");
        a.setCurso("Engenharia");
        a.setMatricula(20984);
        System.out.println(a.toString());
        a.pagarMensalidade();
        
        Bolsista b = new Bolsista();
        b.setNome("Mirella");
        b.setIdade(20);
        b.setSexo("F");
        b.setCurso("ADM");
        b.setMatricula(7454);
        b.setBolsa(1);
        System.out.println(b.toString());
        b.pagarMensalidade();
        b.renovarBolsa();
        
    }
}
