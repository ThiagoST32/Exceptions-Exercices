package com.dio.dioProjects_BootCamp.Exceptions;

import java.util.concurrent.ExecutionException;

public class ImpossivelAberturaDeArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorioDoArquivo;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorioDoArquivo) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretorio " + diretorioDoArquivo);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorioDoArquivo = diretorioDoArquivo;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorioDoArquivo='" + diretorioDoArquivo + '\'' +
                '}';
    }
}
