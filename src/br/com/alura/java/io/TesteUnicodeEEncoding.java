package br.com.alura.java.io;

import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws Exception {

        String s = "C";

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("windows-1252");
        System.out.println(bytes.length + ", windows-1252");
        String sNovo = new String(bytes);
        System.out.println(sNovo);

        bytes = s.getBytes("UTF-16");
        System.out.println(bytes.length + ", UTF-16");

        bytes = s.getBytes("UTF-8");
        System.out.println(bytes.length + ", UTF-8");

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", US_ASCII");

    }



}
