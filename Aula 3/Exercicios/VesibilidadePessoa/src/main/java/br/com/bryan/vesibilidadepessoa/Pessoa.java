/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.vesibilidadepessoa;

/**
 *
 * @author bryan
 */
public class Pessoa {
    private String nome;
    private int idade;
    private boolean acordado;
    
    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Estar acordado: " + this.acordado);
    }
    
    public void acordar(){
        if (this.acordado == false){
            this.acordado = true;
        } else {
            System.out.println(nome + " já estar acordado! ");
        }
    }
    
    public void dormir(){
        if (this.acordado == true){
            this.acordado = false;
        } else {
            System.out.println(this.nome + " já estar dormindo! ");
        }
    }
    
    public void fazerAniversario(){
        this.idade++;
    }
}
