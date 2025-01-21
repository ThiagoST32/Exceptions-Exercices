package Exercicio2.Exceptions;

public class DivisaoNaoExataException extends Exception {
    protected int numerador;
    protected int denomniador;


    public DivisaoNaoExataException(int denomniador) {
        super("Não é possível se dividir por " + denomniador);
        this.denomniador = denomniador;
    }

    public DivisaoNaoExataException(int numerador, int denomniador) {
        super("Divisão não exata " + numerador + " " + denomniador);
        this.numerador = numerador;
        this.denomniador = denomniador;
    }

}
