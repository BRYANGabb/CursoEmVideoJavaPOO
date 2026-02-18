/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.musica;

/**
 *
 * @author bryan
 */
public class InstrumentoMusical {
    String cor;
    boolean afinamento = false;
    boolean conectadoAmp = false;
    
    void status(){
        System.out.println("Cor do instrumento: " + this.cor);
        System.out.println("Instrumento esta afinado: " + this.afinamento);
        System.out.println("Instrumento esta conectado? " + this.conectadoAmp);
    }
    
    void afinar(){
        this.afinamento = true;
    }
    
    void conectar(){
        this.conectadoAmp = true;
    }
    
    void desconectar(){
        this.conectadoAmp = false;
    }
    
    void tocar(){
        if (this.conectadoAmp == true){
            System.out.println("Pode tocar!");
        } else {
            System.out.println("ERRO! Instrumento não estar conectado no amplificador!");
        }
    }
}
