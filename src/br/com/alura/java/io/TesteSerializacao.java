package br.com.alura.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws Exception{

        String nome = "Felipe Souza França Duque";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));

        oos.writeObject(nome);

        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));

        String saida = (String) ois.readObject();

        ois.close();

        System.out.println(saida);

    }

}
