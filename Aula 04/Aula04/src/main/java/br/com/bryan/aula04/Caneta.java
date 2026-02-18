/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.aula04;

/**
 *
 * @author bryan
 */
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){ //Método Construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampada(){
        this.tampada = false;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Cor: " + getCor());
        System.out.println("Tampada: " + getTampada());
    }
}
