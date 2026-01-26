/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.vesibilidadepessoa;

/**
 *
 * @author bryan
 */
public class VesibilidadePessoa {

    public static void main(String[] args) {
        Pessoa bryan = new Pessoa();
        
        
        bryan.status();
        //bryan.acordado = true;
        bryan.acordar();
        bryan.fazerAniversario();
        bryan.status();
    }
}
