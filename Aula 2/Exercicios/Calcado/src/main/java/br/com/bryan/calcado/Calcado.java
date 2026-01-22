/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.calcado;

public class Calcado {

    public static void main(String[] args) {
        Modelo tenis = new Modelo();
        
        tenis.marca = "Adidas";
        tenis.cor = "Branco";
        tenis.tamanho = 40;
        tenis.estadoNovo();
        tenis.descalcar();
        tenis.status();
    }
}
