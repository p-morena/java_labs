package com.company;
import java.lang.*;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

int n, m;

        String string_n = JOptionPane.showInputDialog("Введите кол-во столбцов");
        n = Integer.parseInt(string_n);

        String string_m = JOptionPane.showInputDialog("Введите кол-во строк");
        m = Integer.parseInt(string_m);

        double [][]mas1=new double [n][m];
        double [][]mas2=new double [n][m];

        for(int i=0; i<mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {

                mas1[i][j] = (double) (Math.round(Math.random() * 100));
                mas2[i][j] = (double) (Math.round(Math.random() * 100));
            }
        }
            mas1[0][0]=n;
            mas2[0][0]=n;

            FileWriter fw1 = new FileWriter ("afile.txt", false);
            FileWriter fw2 = new FileWriter ("bfile.txt", false);

            for(int i=0; i<mas1.length; i++){
                for(int j=0; j<mas1[i].length; j++){
                fw1.write(Double.toString(mas1[i][j])+" ");
                    fw2.write(Double.toString(mas2[i][j])+" ");}
                fw1.write("\n");
                fw2.write("\n");
            }
            fw1.close();
            fw2.close();

    FileWriter fw3 = new FileWriter ("сfile.txt", false);

    double [][]mas3=new double [n][m];

     for(int i=0; i<mas1.length; i++){
        for(int j=0; j<mas1[i].length; j++){
            mas3[i][j]=mas1[i][j]+mas2[i][j];
            fw3.write(Double.toString(mas3[i][j])+" ");
        }
        fw3.write("\n");
     }
     fw3.close();
}
    }



