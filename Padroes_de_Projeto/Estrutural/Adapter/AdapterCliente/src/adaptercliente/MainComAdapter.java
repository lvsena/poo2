
package adaptercliente;

import adaptercliente.model.ClienteExternoAdapter;
import adaptercliente.model.ICliente;
import adaptercliente.visao.VisaoCliente;
import lib.ClienteExterno;

public class MainComAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ICliente ce = new ClienteExternoAdapter();
        ce.setCelular("0279997777");
        ce.setTelefone("0273333");
        ce.setEmail("jose.silva@email.com");
        ce.setNomeCompleto("Jose Silva");
        VisaoCliente visao = new VisaoCliente();
        visao.setInformacoesCliente(ce);//espera um Cliente
        visao.setVisible(true); 
        
        
    }
    
}
