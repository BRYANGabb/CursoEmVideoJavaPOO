/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.trabalho;

/**
 *
 * @author bryan
 */
public class Salario {
    float valorBase;
    boolean comissao = false;
    boolean gratificacao = false;
    
    void status(){
        System.out.println("Salario base: " + this.valorBase);
        System.out.println("Recebeu comissão: " + this.comissao);
        System.out.println("Recebeu gratificação: " + this.gratificacao);
    }
   
    void recebeuComissao(){
        this.comissao = true;
    }
    
    void recebeuGratificacao(){
        this.gratificacao = true;
    }
}
