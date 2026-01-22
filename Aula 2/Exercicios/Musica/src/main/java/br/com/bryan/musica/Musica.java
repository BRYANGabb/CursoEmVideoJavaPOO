/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.musica;

/**
 *
 * @author bryan
 */
public class Musica {

    public static void main(String[] args) {
        InstrumentoMusical baixo = new InstrumentoMusical();
        
        baixo.cor = "Preto";
        baixo.afinar();
        baixo.status();
        baixo.tocar();
        
        InstrumentoMusical guitarra = new InstrumentoMusical();
        
        baixo.cor = "Vermelho";
        baixo.conectar();
        baixo.status();
        baixo.tocar();
    }
}
