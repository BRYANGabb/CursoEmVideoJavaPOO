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
        
        guitarra.cor = "Vermelho";
        guitarra.conectar();
        guitarra.status();
        guitarra.tocar();
    }
}
