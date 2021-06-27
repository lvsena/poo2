/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

/**
 *
 * @author lvsena
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Usuario usuario1 = new Usuario();
        usuario1.setEmail("joao@email.com");
        usuario1.setNome("joao");
        usuario1.setSenha("password");

        Usuario usuario2 = new Usuario();
        usuario2.setEmail("carlos@email.com");
        usuario2.setNome("carlos");
        usuario2.setSenha("password");

        Mensagem mensagem = new Mensagem(usuario1, usuario2, "Olá joao");
        usuario2.envia(usuario1, mensagem);

        SaveUsuarioSerializado.execute(usuario2);
        SaveMensagemSerializado.execute(mensagem);

        RecuperarUsuarioSerializado.execute();
        RecuperarMensagemSerializado.execute();
    }
}
