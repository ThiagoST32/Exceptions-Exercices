package Exercicio2;

import Exercicio2.Exceptions.DivisaoNaoExataException;

public class ExceptionPersonalizada2 {
    public static void main(String[] args) {

        final int[] numerador = {16, 32, 64, 191, 259};
        final int[] denominador = {1, 2, 7, 3, 4};
        int result;

        for (int i = 0; i < denominador.length; i++) {
            if (numerador[i] % 2 != 0) try {
                throw new DivisaoNaoExataException(numerador[i], denominador[i]);
            } catch (DivisaoNaoExataException e) {
                e.fillInStackTrace();
            }
            result = numerador[i] / denominador[i];
            System.out.println(result);
        }
    }
}
