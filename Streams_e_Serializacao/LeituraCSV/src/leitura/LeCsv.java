
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
         LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "//src//arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        BufferedReader csv = new BufferedReader(in);
        String line = csv.readLine();

        while((line = csv.readLine()) != null) {
           String[] clienteData = line.split(";");
           
           Cliente newCliente = new Cliente();
           newCliente.setId(clienteData[0]);
           newCliente.setNome(clienteData[1]);
           newCliente.setEmail(clienteData[2]);
           newCliente.setTelefone(clienteData[4]);
           newCliente.setTotalCompras(Double.parseDouble(clienteData[5]));
           
           clientes.add(newCliente);
        }
        
        csv.close(); 
    
        return clientes;
     }
}
