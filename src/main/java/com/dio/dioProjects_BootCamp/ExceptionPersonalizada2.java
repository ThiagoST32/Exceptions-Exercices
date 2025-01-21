package com.dio.dioProjects_BootCamp;

import com.dio.dioProjects_BootCamp.Exceptions.DivisaoNaoExataException;

import javax.swing.*;

public class ExceptionPersonalizada2{
    public static void main(String[] args) {
        DivisaoNaoExataException exception = new DivisaoNaoExataException();

        final int[] numerador = {16, 31, 64, 191, 259};
        final int[] denominador = {2, 4, 0, 8, 10};

        for (int i = 0; i < denominador.length; i++) {
            if (numerador[i] % 2 != 0) try {
                throw new DivisaoNaoExataException(numerador[i], denominador[i]);
            } catch (DivisaoNaoExataException e) {
                e.fillInStackTrace();
            }
            else if (denominador[i] == 0 ) {
                JOptionPane.showMessageDialog(null, exception.DivisaoNaoExataExceptionZero(denominador[i]).getMessage());
            }
            int result = numerador[i] / denominador[i];
            System.out.println(result);
        }
    }
}
