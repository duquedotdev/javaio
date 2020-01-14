package br.com.alura.java.io;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo

        OutputStream fos = new FileOutputStream("lorem2.txt"); //Estabelecemos a entrada
        Writer osw = new OutputStreamWriter(fos);//Melhorando os dados para caractéres
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Felipe Souza França Duque");
        bw.newLine();
        bw.newLine();
        bw.write("Developer");

        bw.close();

    }

}
