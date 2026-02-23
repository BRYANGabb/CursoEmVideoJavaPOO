
package br.com.bryan.sistemadeveiculos;

public class Moto extends Veiculo{

    public Moto(String modelo) {
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
