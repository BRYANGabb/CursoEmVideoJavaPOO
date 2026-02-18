
package br.com.bryan.notaaluno;

import java.util.Scanner;

class NotaAluno {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float n1 = 0; 
        float n2 = 0;
        
        System.out.println("Digite o nome do Aluno: ");
        String nome = ler.nextLine();
        
        
        System.out.println("Digite a idade de " + nome + ": ");
        int idade = ler.nextInt();
        
        
        Aluno aluno = new Aluno(nome, idade);
        
        do{
            System.out.println("Digite 1° nota: ");
             n1 = ler.nextFloat();
            aluno.setNota1(n1);
        }while(n1 < 0 || n1 > 10);
        
        do{
            System.out.println("Digite 2° nota: ");
            n2 = ler.nextFloat();
            aluno.setNota2(n2);
        }while(n2 < 0 || n2 >10);
        
        aluno.calcularMedia();
        aluno.verificarSituacao();
        aluno.status();
        aluno.trancarMatricula();
    }
}
