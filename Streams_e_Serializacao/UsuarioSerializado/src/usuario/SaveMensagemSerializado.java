/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author lvsena
 */
public class SaveMensagemSerializado {

    public static void execute(Mensagem mensagem) throws IOException {

        String current = new java.io.File(".").getCanonicalPath();

        FileOutputStream fileSerializado = new FileOutputStream(
                current + "//src//mensagem_serializada.ser");
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);
        outputSerializado.writeObject(mensagem);
        outputSerializado.close();

        System.out.println("Mensagem Salva");
        System.out.println("Arquivo gerado em: " + current
                + "//src//mensagem_serializada.ser");
    }
}
