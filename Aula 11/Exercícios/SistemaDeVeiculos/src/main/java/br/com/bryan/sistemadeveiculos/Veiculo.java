
package br.com.bryan.sistemadeveiculos;

public class Veiculo {
    protected String modelo;
    protected boolean ligado;

    public Veiculo(String modelo) {
        this.modelo = modelo;
        this.setLigado(false);
    }

  
    public void ligar(){
        if(this.isLigado()){
            System.out.println("Veículo ligado");
        } else{
            System.out.println("Veículo desligado");
        }
    }
    
    public void exibirInformacao(){
        System.out.println("Modelo: " + this.getModelo() );
        
    }
    
    public final void getTipo(){
        System.out.println("Veículo genérico");
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
