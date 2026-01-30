
package br.com.bryan.comercio;

public class Comercio {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(4573, "Bryan Gabriel");
        
        pedido.resumoPedido();
        pedido.AdicionarValorPedido(500);
        pedido.finalizarPedido();
        pedido.resumoPedido();
    }
}
