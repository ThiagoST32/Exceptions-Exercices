package com.dio.dioProjects_BootCamp;

import com.dio.dioProjects_BootCamp.Exceptions.ImpossivelAberturaDeArquivoException;
import javax.swing.*;
import java.io.*;

public class ExceptionPersonalizada {
    public static void main(String[] args) {
        String nomeDoArquivo = "teste.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException fileNotFoundException) {
            JOptionPane.showMessageDialog(null, "Arquivo não encotrado! " + fileNotFoundException.getCause());
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! Entre em contato com o suporte!");
            e.printStackTrace();
        } finally {
            System.out.println("\nAbalbalbalbalblabla");
        }

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        try {
            BufferedReader br = leArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();

        } catch (ImpossivelAberturaDeArquivoException impossivelAberturaDeArquivoException) {
            JOptionPane.showMessageDialog(null, impossivelAberturaDeArquivoException.getMessage());
            impossivelAberturaDeArquivoException.fillInStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro!!");
            ex.fillInStackTrace();
        } finally {
            System.out.println("Finalização do try/catch");
        }
    }

    public static BufferedReader leArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);

        try {
            return new BufferedReader(new FileReader(file.getName()));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}
