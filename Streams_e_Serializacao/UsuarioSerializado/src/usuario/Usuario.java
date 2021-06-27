package usuario;

import java.io.Serializable;


public class Usuario implements Serializable {

    String nome;
    private String email;
    private String senha;   
   

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
   
    public void envia(Usuario usuario, Mensagem mensagem) {
        usuario.recebe(mensagem);
    }
    
    public void recebe(Mensagem mensagem) {
        System.out.println("Usuário " + this.nome + " recebeu uma mensagem de " + mensagem.getFrom());
        System.out.println("Mensagem: " + mensagem.getTexto());
    }
}
