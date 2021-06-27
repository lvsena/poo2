/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author lvsena
 */
public class RecuperarMensagemSerializado {

    public static void execute() throws IOException, ClassNotFoundException {
        Mensagem mensagem = null;
        String current = new java.io.File(".").getCanonicalPath();
        FileInputStream fileIn = new FileInputStream(current
                + "//src//mensagem_serializada.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        mensagem = (Mensagem) in.readObject();
        in.close();

        System.out.println("Deserializando Mensagem...");
        System.out.println("De: " + mensagem.getTo());
        System.out.println("Para: " + mensagem.getFrom());
        System.out.println("Texto: " + mensagem.getTexto());

    }
}
