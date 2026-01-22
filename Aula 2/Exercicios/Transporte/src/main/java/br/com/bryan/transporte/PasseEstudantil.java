/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.transporte;

/**
 *
 * @author bryan
 */
public class PasseEstudantil {
    int acessoMensal;
    int acessoDiario;
    boolean estado = false;
    String situacao = "Invalido";
    
    void statusPasse(){
        System.out.println("Acessos Mensais disponiveis: " + this.acessoMensal);
        System.out.println("Acessos diarios disponiveis: " + this.acessoDiario);
    }
    
    void statusGeral(){
        System.out.println("Acessos Mensais disponiveis: " + this.acessoMensal);
        System.out.println("Acessos diarios disponiveis: " + this.acessoDiario);
        System.out.println("Situação passe: " + this.situacao);
    }
    
    void liberarPasse(){
        this.estado = true;
        this.situacao = "Ativo";
    }
    
    void passarCatraca(){
        if (this.estado == true){
            if (this.acessoMensal > 0){
                if(this.acessoDiario > 0){
                    System.out.println("Acesso liberado!");
                    this.acessoMensal--;
                    this.acessoDiario--;
                } else{
                    System.out.println("Acessos diarios excedidos!");
                }
            } else{
                System.out.println("Acessos mensais excedidos!");
            }
        } else{
            System.out.println("Passe Invalido!");
        }
    }
}
