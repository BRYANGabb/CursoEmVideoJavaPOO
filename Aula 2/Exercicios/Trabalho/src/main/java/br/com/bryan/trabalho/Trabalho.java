/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.trabalho;

/**
 *
 * @author bryan
 */
public class Trabalho {

    public static void main(String[] args) {
        Salario bryan = new Salario();
        
        bryan.valorBase = (float) 1.500;
        bryan.recebeuComissao();
        bryan.status();
    }
}
