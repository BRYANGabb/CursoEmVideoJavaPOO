
package br.com.bryan.sistemadecurso;

public class SistemaDeCurso {

    public static void main(String[] args) {
        Aluno aluno[] = new Aluno[10];
        
        Curso curso = new Curso();
        
        aluno[0] = new Aluno("Bryan", 20, 1);
        aluno[1] = new Aluno("Gabriel", 16, 5478);
        aluno[2] = new Aluno("Mirella", 20, 6757);
        aluno[3] = new Aluno("Goku", 40, 2);
        aluno[4] = new Aluno("Kirito", 18, 98);
        aluno[5] = new Aluno("Midoriya", 14, 6425);
        
        curso.matricularAluno(aluno[0]);
        curso.matricularAluno(aluno[1]);
        curso.matricularAluno(aluno[2]);
        curso.matricularAluno(aluno[3]);
        curso.matricularAluno(aluno[4]);
        curso.matricularAluno(aluno[5]);
        
        curso.listarAlunos();
        curso.removerAluno(aluno[3]);
        System.out.println("---------------------");
        curso.listarAlunos();
    }
}
