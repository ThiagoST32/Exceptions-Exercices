package com.dio.dioProjects_BootCamp;

import javax.annotation.processing.FilerException;
import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "teste.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException fileNotFoundException){
            JOptionPane.showMessageDialog(null , "Arquivo não encotrado! " + fileNotFoundException.getCause());
            fileNotFoundException.printStackTrace();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null , "Ocorreu um erro inesperado! Entre em contato com o suporte!");
            e.printStackTrace();
        } finally {
            System.out.println("\nAbalbalbalbalblabla");
        }

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException{
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
