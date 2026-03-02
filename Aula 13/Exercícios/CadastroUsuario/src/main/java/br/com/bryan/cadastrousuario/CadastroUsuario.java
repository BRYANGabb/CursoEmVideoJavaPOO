
package br.com.bryan.cadastrousuario;

public class CadastroUsuario {

    public static void main(String[] args) {
        Usuario u = new Usuario();
        
        u.cadastrar("Bryan", "bbbbb@gmail.com", 20);
        
        System.out.println(u.getNome());
        System.out.println(u.getEmail());
    }
}
