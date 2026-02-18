
package br.com.bryan.comercio;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private double valorTotalPerdido;
    private boolean statusPedido;

    public Pedido(int numeroPedido, String cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.valorTotalPerdido = 0;
        this.statusAberto();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorTotalPedido() {
        return valorTotalPerdido;
    }

    public boolean getStatusPedido() {
        return statusPedido;
    }
    
    public void statusAberto(){
        this.statusPedido = true;
    }
    
    public void statusFechado(){
        this.statusPedido = false;
    }
    
    public void adicionarValorPedido(double valor){
        if (this.getStatusPedido() == true){
            if(valor > 0){
                this.valorTotalPerdido += valor;
                System.out.println("APROVADO:   ");
                System.out.printf("Valor pedido: %.5f\n", this.getValorTotalPedido());
            } else{
                System.out.println("INVÁLIDO:!");
                System.out.println("Valor igual ou menor que zero!");
            }
        } else{
            System.out.println("Inválido!");
            System.out.println("Status do perdido: Fechado");
        }
    }
    
    public void finalizarPedido(){
        if (this.getStatusPedido() == true){
            if (this.getValorTotalPedido() > 0){
                this.statusFechado();
            } else{
                System.out.println("INVÁLIDO:");
                System.out.println("Pedido sem valor!");
            }
        } else{
            System.out.println("INVÁLIDO!");
            System.out.println("Status do pedido: Fechado");
        }
    }
    
    public void resumoPedido(){
        System.out.println("Cliente: " + this.getCliente());
        System.out.println("Número do pedido: " + this.getNumeroPedido());
        System.out.printf("Valor total do pedido: %.5f\n", this.getValorTotalPedido());
        if (this.getStatusPedido() == true){
            System.out.println("Status pedido: Aberto");
        } else{
            System.out.println("Status pedido: Fechado");
        } 
    }
}
