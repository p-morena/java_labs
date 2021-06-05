package com.company;
import javax.swing.*;
import java.awt.*;
import java.io.*;

///ДОПИСАТЬ НА СУЩЕСТВОВАНИЕ ФАЙЛА
public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        int a, b, c;

        String string_a = JOptionPane.showInputDialog("Введите начало промежутка");
        a = Integer.parseInt(string_a);

        String string_b = JOptionPane.showInputDialog("Введите конец промежутка");
        b = Integer.parseInt(string_b);

        String string_c = JOptionPane.showInputDialog("Введите размер массива");
        c = Integer.parseInt(string_c);

        int []array=new int[c];


        for(int i=0; i<array.length; i++){
            array[i] = (int) (Math.round(Math.random() * (b-a) + a);
           }

        String str = JOptionPane.showInputDialog("Введите имя файла");

        File fl = new File(str+".txt");
        if (fl.exists()){fl.delete();
}
else{
    FileWriter fw = new FileWriter (str+".txt", false);
        for(int i=0; i<array.length; i++){
            fw.write(Integer.toString(array[i])+"\n");}
        fw.close(); }


        BufferedReader br = new BufferedReader(new FileReader(str+".txt"));
        String st;
        while((st=br.readLine()) != null){
            System.out.println(st);
        }


    }
}
