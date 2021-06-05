package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {


    private static class Input {
        int num;

        public Input(int num) {
            this.num = num;
        }

        public int getNum() {
            return this.num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        void consInput() {

            try{
                String string_b = JOptionPane.showInputDialog("Введите число");
                int num = Integer.parseInt(string_b);
                JOptionPane.showMessageDialog((Component)null, "Число " + num);
            }

            catch (NumberFormatException | NullPointerException e){
                JOptionPane.showMessageDialog(null, "Не является целым числом или вообще числом"); }

        }
    }




    public static void main(String[] args) {
        int num=0;
	Input i = new Input(num);
	i.consInput();
    }
}
