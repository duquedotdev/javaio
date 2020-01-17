package br.com.alura.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TesteSerializacaoCliente {

public static void main(String[]args) throws Exception{

        /*Cliente cliente = new Cliente();
        cliente.setNome("Felipe Duque");*/

        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));

        oos.writeObject(cliente);

        oos.close();
*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));

        Cliente cliente = (Cliente) ois.readObject();

        ois.close();

        System.out.println(cliente.getNome());

        }


}
