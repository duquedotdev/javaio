package br.com.alura.java.io;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket();

        InputStream fis = s.getInputStream();//System.in; //new FileInputStream("lorem.txt"); //Estabelecemos a entrada
        Reader isr = new InputStreamReader(fis);//Melhorando os dados para caractéres
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = s.getOutputStream();//System.out; //new FileOutputStream("lorem4.txt"); //Estabelecemos a entrada
        Writer osw = new OutputStreamWriter(fos);//Melhorando os dados para caractéres
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null && linha.isEmpty()) {

            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();

        }

        br.close();
        bw.close();



    }

}
