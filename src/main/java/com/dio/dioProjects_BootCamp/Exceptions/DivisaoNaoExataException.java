package com.dio.dioProjects_BootCamp.Exceptions;

public class DivisaoNaoExataException extends Exception {
    protected int numerador;
    protected int denomniador;
    protected String message;

    public DivisaoNaoExataException() {
    }

    public DivisaoNaoExataException(int numerador, int denomniador) {
        super("Divisão não exata " + numerador + " " + denomniador);
        this.numerador = numerador;
        this.denomniador = denomniador;
    }

    public ArithmeticException DivisaoNaoExataExceptionZero(int denomniador) {
        this.message = "Não é possível se dividir por " + denomniador;
        return new ArithmeticException(message.toUpperCase());
    }

}
