
package br.com.bryan.banco;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;
    private boolean statusConta;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.abrirConta();
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean getStatusConta() {
        return this.statusConta;
    }
    
    public void abrirConta(){
        this.statusConta = true;
    }
    
    public void fecharConta(){
        this.statusConta = false;
    }
    
    public void sacarSaldo(double saque){
        if(this.getStatusConta() == true){
            if (saque <= this.getSaldo()){
                this.saldo -= saque;
                System.out.println("SAQUE APROVADO: ");
                System.out.printf("Saldo Atual: %.3f\n", this.saldo);
            }else{
                System.out.println("SAQUE INVÁLIDO: ");
                System.out.println("Saque maior que saldo! ");
            }
        } else{
            System.out.println("SAQUE INVÁLIDO: ");
            System.out.println("Status da conta: Inativa");
        }
    }
    
    public void depositarSaldo(double deposito){
        if(this.getStatusConta() == true){
            if(deposito > 0){
                this.saldo += deposito;
                System.out.println("DEPOSITO APROVADO: ");
                System.out.printf("Saldo Atual: %.3f\n", this.saldo);
            } else{
                System.out.println("DEPOSITO INVÁLIDO: ");
                System.out.println("Valor menor que zero!");
            }
        } else{
            System.out.println("DEPOSITO INVÁLIDO: ");
            System.out.println("Status da conta: Inativa");
        }
    }
    
    public void statusAtualConta(){
        System.out.println("Número da conta: " + getNumeroConta());
        System.out.println("Titular: " + this.getTitular());
        System.out.printf("Saldo: %.3f\n", this.getSaldo());
        if (this.getStatusConta() == true){
            System.out.println("Status da conta: Ativo");
        } else{
            System.out.println("Status da conta: Inativo");
        }
    }
}
