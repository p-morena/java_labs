package com.company;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//ввод текста с клавы
    public static void main(String[] args) throws IOException {

        String str = "a";
        FileWriter fw1 = new FileWriter("F1.txt", false);
        fw1.write("aghdks djskhdfskf jhj\n kjfkjfksd;f\naskddjskfk\n kjfkjfksd;f\naskddjskfk\n kjfkjfksd;f\naskddjskfk\n kjfkjfksd;f\naskddjskfk");
        fw1.close();

        List<String> lines = Files.readAllLines(Paths.get("F1.txt"));

        List<String> result = new ArrayList<>();

        for (String s: lines) {
            if (s.startsWith(str)) {
                result.add(s);
            }
        }
        FileWriter fw2 = new FileWriter("F2.txt");
        for (String s: result) {
            System.out.println(s);
            fw2.write(s+"\n");
        }
        fw2.close();


     int count=0;
        FileReader fr2 = new FileReader("F2.txt");
        Scanner sc =new Scanner(fr2);
                while (sc.hasNext()) {
            sc.next();
            count++;}
         sc.close();
        fr2.close();
        System.out.println("Number of words: " + count);
    }
}



