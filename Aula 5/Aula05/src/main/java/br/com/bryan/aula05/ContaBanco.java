
package br.com.bryan.aula05;

public class ContaBanco {
    public int numeroConta;
    protected String tipo;
    private String titular;
    private double saldo;
    private boolean status;

    public ContaBanco(double saldo, boolean status) {
        this.saldo = saldo;
        this.status = status;
    }

    public void abrirConta(){
        if (tipo.equalsIgnoreCase("cc")){
            this.saldo = 50f;
            this.status = true;
        }
        if (tipo.equalsIgnoreCase("CP")){
            this.saldo = 150f;
            this.status = true;
        }
    }
    
    public void fecharConta(){
        if (this.getStatus() == true){
            if (this.getSaldo() == 0){
                this.status = false;
            }
        }
    }
    
    public void depositar(double valor){
        if (getStatus() == true){
            if (valor > 0){
                this.saldo += valor;
            }
        }
    }
    
    public void sacar(double valor){
        if (getStatus() == true){
            if (getSaldo() >= valor){
                this.saldo -= valor;
            }
        }
    }        
            
    public void pagarMensalidade(){
        if (this.getStatus() == true){
            if(this.getTipo().equalsIgnoreCase("cc")){
                if (this.getSaldo() >= 20){
                    this.saldo -= 20f;
                }
            }
            if(this.getTipo().equalsIgnoreCase("cp")){
                if (this.getSaldo() >= 20){
                    this.saldo -= 20f;
                }
            }
        }
    } 
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void statusGeral(){
        System.out.println(tipo);
        System.out.println(getSaldo());
    }
}
