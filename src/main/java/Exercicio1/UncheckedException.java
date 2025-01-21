package Exercicio1;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Numeros invalidos!! " + numberFormatException.getMessage());
            } catch (ArithmeticException arithmeticException) {
                JOptionPane.showMessageDialog(null, "Impossivel se dividir com 0! " + arithmeticException.getMessage());
            } finally {
                System.out.println("sim;");
            }
        } while (continueLooping);
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}