/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.transporte;

/**
 *
 * @author bryan
 */
public class Transporte {

    public static void main(String[] args) {
        PasseEstudantil bryan = new PasseEstudantil();
        
        bryan.acessoMensal = 54;
        bryan.acessoDiario = 4;
        bryan.liberarPasse();
        bryan.passarCatraca();
        bryan.passarCatraca();
        bryan.passarCatraca();
        bryan.passarCatraca();
        bryan.passarCatraca();
        bryan.passarCatraca();
        bryan.statusGeral();
    }
}
