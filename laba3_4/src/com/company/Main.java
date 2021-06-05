package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double a, b, x;

        String string_a = JOptionPane.showInputDialog("Введите начало промежутка");
        a = Integer.parseInt(string_a);

        String string_b = JOptionPane.showInputDialog("Введите конец промежутка");
        b = Integer.parseInt(string_b);

        String string_x = JOptionPane.showInputDialog("Введите число");
        x = Double.parseDouble(string_x);
        if ((a < x) && (x < b)) {
            try {
                for (a = x; a <= b; a++) {
                    double y = Math.log(a - 1);
                    if (Double.isInfinite(y)) throw new ArithmeticException("Error");
                    JOptionPane.showMessageDialog(null, "y= " + y);
                }
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Не является целым числом или вообще числом");
            }
        }
        else {
                JOptionPane.showMessageDialog(null, "Невозможно совершить операцию");
            }
        }
    }
