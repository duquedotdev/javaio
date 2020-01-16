package br.com.alura.java.io;

import java.io.*;

public class TesteEscrita3 {

    public static void main(String[] args) throws IOException {


        //PrintStream ps = new PrintStream(new File("lorem2.txt"));
        PrintWriter ps = new PrintWriter(new File("lorem2.txt"));

        ps.println("Felipe Souza França Duque");
        ps.println();
        ps.println("Developer - Chief");

        ps.close();

    }

}
