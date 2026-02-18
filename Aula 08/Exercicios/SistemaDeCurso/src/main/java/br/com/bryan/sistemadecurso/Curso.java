
package br.com.bryan.sistemadecurso;

import java.util.ArrayList;

public class Curso {
    private String nomeCurso;
    ArrayList <Aluno> alunos = new ArrayList<>();

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void matricularAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }
    
    public void listarAlunos(){
        for (Aluno aluno : this.alunos){
            System.out.println(aluno.getNome());
        }
    }
    
}
