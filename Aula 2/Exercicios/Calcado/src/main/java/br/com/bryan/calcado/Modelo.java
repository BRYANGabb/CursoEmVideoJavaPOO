/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.calcado;

/**
 *
 * @author bryan
 */
public class Modelo {
    String marca;
    String cor;
    boolean estaCalcado;
    String estado;
    int tamanho;
    
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Estado do calçado: " + estado);
        System.out.println("Esta calçado? " + this.estaCalcado);
    }
    
    void calcar(){
        this.estaCalcado = true;
    }
    
    void descalcar(){
        this.estaCalcado = false;
    }
    void estadoNovo(){
        this.estado = "Novo";
    }
    
    void estadoUsado(){
        this.estado = "Usado";
    }
}
