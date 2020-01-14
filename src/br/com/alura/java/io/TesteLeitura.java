package br.com.alura.java.io;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo

        InputStream fis = new FileInputStream("lorem.txt"); //Estabelecemos a entrada
        Reader isr = new InputStreamReader(fis);//Melhorando os dados para caractéres
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while(linha != null) {

            System.out.println(linha);
            linha = br.readLine();

        }


        br.close();

    }

}
