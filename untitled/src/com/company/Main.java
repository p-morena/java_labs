package com.company;


import javax.swing.*;
import java.awt.*;
import static com.company.Main.Ex.fact;


public class Main {

    public static class Ex {
        public Ex() {
        }

        public static long fact(int n) {
            return n <= 1 ? 1L : (long)n * fact(n - 1);
        }
    }


    public static void main(String[] args) {

        String string_c = JOptionPane.showInputDialog("Введите кол-во итераций");
        int itr = Integer.parseInt(string_c);

        try {
            if ( itr < 0) {
                throw new ArithmeticException("Error");
            }

            for(int i = 1; i <= itr; ++i) {
                JOptionPane.showMessageDialog((Component)null, fact(i));
            }

        } catch (ArithmeticException var6) {
            JOptionPane.showMessageDialog((Component)null, "Неосуществимая математическая операция");
        }

    }
    }

