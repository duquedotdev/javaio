package br.com.alura.java.io;


import java.io.*;
import java.util.*;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

        long in = System.currentTimeMillis();

        Scanner scanner = new Scanner(new File("contas.csv"));

        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            /*System.out.println(linha);*/

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int conta = linhaScanner.nextInt();
            String nomeCliente = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format(new Locale("pt","BR"),"%s - %04d %06d %s R$%.2f", tipoConta , agencia , conta , nomeCliente , saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();

            /*String[] valores = linha.split(",");
            System.out.println(valores[1]);*/
        }
        scanner.close();

        long out = System.currentTimeMillis();

        System.out.println("Timer: " + (out - in) + " ms");

    }
}
