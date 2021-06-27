package usuario;

import java.io.*;

public class SaveUsuarioSerializado {
    
    public static void execute(Usuario usuario) throws IOException {
        String current = new java.io.File( "." ).getCanonicalPath();        
               
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "//src//usuario_serializado.ser");                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        outputSerializado.writeObject(usuario);
        outputSerializado.close();
        
        System.out.println("Usuario Salvo");        
        System.out.println("Arquivo gerado em: " + current + 
                "//src//usuario_serializado.ser");
    }
}

   
