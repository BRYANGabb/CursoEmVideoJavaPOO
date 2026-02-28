
package br.com.bryan.sistemadepagamentos;

public class Pagamento {
    private double saldo;
    
    public void pagar(double valor){
        if(this.getSaldo() >= valor){
            System.out.println("Pagamento de " + valor + "R$ realizado!");
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    
    public void pagar(double valor, int parcelas){
        if (parcelas > 0){
            if (this.getSaldo() >= valor){
                double parcela = valor / parcelas;
                System.out.println("Pagamento de " + valor + "R$ realizado com " + parcelas + " parcelas!");
                System.out.println("Valor da parcela de " + parcela + "R$");
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Parcelamento Inválido");
        }
        
    }
    
    public void pagar(double valor, String cupom){
        double desconto = valor - ((valor * 10) / 100);
        if (this.getSaldo() >= desconto){
            System.out.println("Pagamento de " + desconto + "R$ realizado com 10% de desconto");
            this.setSaldo(this.getSaldo() - desconto);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    
    public void pagar(double valor, int parcelas, String cupom){
        if(parcelas > 0){
            double desconto = valor - ((valor * 10) / 100);
            if (this.getSaldo() >= desconto){
                double parcela = desconto / parcelas;
                System.out.println("Pagamento de " + desconto + "R$ realizado com 10% de desconto e " + parcelas + " parcelas!");
                System.out.println("Valor da parcela de " + parcela + "R$");
                this.setSaldo(this.getSaldo() - desconto);
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Parcelamento Inválido");
        }
       
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
