/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata;

/**
 *
 * @author lvsena
 */
public class CobrancaClaro implements Cobranca {

    @Override
    public void cobrar(int telefone) {
        System.out.println("Cobrar via claro");
    }
    
}
