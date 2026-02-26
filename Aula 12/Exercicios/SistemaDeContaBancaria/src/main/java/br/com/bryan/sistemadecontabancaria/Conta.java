
package br.com.bryan.sistemadecontabancaria;

public abstract class Conta {
    protected int numeroConta;
    protected String titular;
    protected double saldo;
    
    public void sacar(double valor){
        if(valor > 0){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saldo atual: " + this.getSaldo());
            } else{
                System.out.println("Saldo Insuficiente!");
            }
        } else{
            System.out.println("Valor Inválido!");
            System.out.println("Valor válido maior que 0");
        }
    }
    
    public void depositar(double valor){
        if(valor > 0){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Saldo atual: " + this.getSaldo());
        } else{
            System.out.println("Valor Inválido!");
            System.out.println("Valor válido maior que 0");
        }
    }
    
    public abstract double calcularTaxa();
    
    public void pagarTaxa(){
        if(this.getSaldo() >= this.calcularTaxa()){
            this.setSaldo(this.getSaldo() - this.calcularTaxa());
        }
    }
    
    public void exibirdados(){
        System.out.println("Número da conta: " + this.getNumeroConta());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
