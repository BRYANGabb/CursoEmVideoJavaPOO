
package br.com.bryan.projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        Aluno p2 = new Aluno();
        
        Professor p3 = new Professor();
        
        Funcionario p4 = new Funcionario();
        
        p1.setIdade(20);
        p1.setNome("Bryan");
        p1.setSexo("Masc");
        
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getSexo());
        System.out.println("-------------------------------------------");
        
        p2.setIdade(10);
        p2.setNome("Gabriel");
        p2.setSexo("Masc");
        p2.fazerAniversario();
        p2.setCurso("Eng de Software");
        p2.setMatricula(9884);
        p2.cancelarMatricula();
        
        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getSexo());
        System.out.println(p2.getCurso());
        System.out.println(p2.getMatricula());
        System.out.println("-------------------------------------------");
        
        p3.setIdade(30);
        p3.setNome("Lima");
        p3.setSexo("Masc");
        p3.fazerAniversario();
        p3.setEspecialidade("Matemática");
        p3.setSalario(3058.23);
        p3.receberAumento(200);
        
        System.out.println(p3.getNome());
        System.out.println(p3.getIdade());
        System.out.println(p3.getSexo());
        System.out.println(p3.getEspecialidade());
        System.out.println(p3.getSalario());
        System.out.println("-------------------------------------------");

        p4.setIdade(25);
        p4.setNome("Queiroz");
        p4.setSexo("Feminino");
        p4.fazerAniversario();
        p4.setTrabalhando(false);
        p4.setSetor("Limpeza");
        p4.mudarTrabalho();
        p4.mudarTrabalho();
        
        System.out.println(p4.getNome());
        System.out.println(p4.getIdade());
        System.out.println(p4.getSexo());
        System.out.println(p4.getSetor());
        System.out.println(p4.isTrabalhando());
    }
}
