
package br.com.bryan.sistemadeveiculos;

public class Carro extends Veiculo{

    public Carro(String modelo) {
        super(modelo);
    }
    
    @Override
    public void exibirInformacao() {
        super.exibirInformacao(); 
        this.ligar();
    }

    @Override
    public void ligar() {
        if(this.isLigado()){
            System.out.println(this.getModelo() + " ligado");
        } else{
            System.out.println(this.getModelo() + " desligado");
        }
    }

}
