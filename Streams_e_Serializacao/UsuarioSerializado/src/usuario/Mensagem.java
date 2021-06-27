/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.io.Serializable;

/**
 *
 * @author lvsena
 */
public class Mensagem implements Serializable {
    private final String texto;
    private final Usuario to;
    private final Usuario from;
    
    public Mensagem(Usuario to, Usuario from,String texto) {
        this.texto = texto;
        this.to = to;
        this.from = from;
    }
    
    public String getTexto() {
        return this.texto;
    }
    
    public String getFrom() {
        return this.from.getNome();
    }
    
    public String getTo() {
        return this.to.getNome();
    }
}
