package br.com.bryan.aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Big", "Vermelho", 0.7f);
        
        //c1.setModelo("Bic Green");
        //c1.modelo = "Bic";
        
        //c1.setPonta(1.0f);
        //c1.ponta = 0.5f;
        
        c1.status();
        
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}
