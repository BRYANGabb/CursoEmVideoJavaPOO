
package br.com.bryan.sistemadepagamentos;

public class SistemaDePagamentos {

    public static void main(String[] args) {
        Pagamento p = new Pagamento();
        
        p.setSaldo(2433.45);
        
        p.pagar(400f, 4, "DESCONTO10");
    }
}
