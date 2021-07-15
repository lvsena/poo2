/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercliente.model;

import lib.ClienteExterno;

/**
 *
 * @author lvsena
 */
public class ClienteExternoAdapter implements ICliente {

    ClienteExterno clienteExterno = new ClienteExterno();
    
    @Override
    public String getNomeCompleto() {
        String nomeCompleto =  clienteExterno.getNome() + " " + clienteExterno.getSobreNome();
        return nomeCompleto;
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        String[] nomeCompletoSplited = nomeCompleto.split(" ", 2);

        clienteExterno.setNome(nomeCompletoSplited[0]);
        clienteExterno.setSobreNome(nomeCompletoSplited[1]);
    }

    @Override
    public String getTelefone() {
        return clienteExterno.getDddTelefone() + clienteExterno.getTelefone();
    }

    @Override
    public void setTelefone(String telefone) {
        clienteExterno.setDddTelefone(telefone.substring(0, 3));
        clienteExterno.setTelefone(telefone.substring(4, telefone.length()));
    }

    @Override
    public String getEmail() {
        return clienteExterno.getEmail();
    }

    @Override
    public void setEmail(String email) {
        clienteExterno.setEmail(email);
    }

    @Override
    public String getCelular() {
        return clienteExterno.getDddCelular() + clienteExterno.getCelular();
    }

    @Override
    public void setCelular(String celular) {
        clienteExterno.setDddCelular(celular.substring(0, 3));
        clienteExterno.setCelular(celular.substring(4, celular.length()));
    }
    
}
