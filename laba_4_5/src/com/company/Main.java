package com.company;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        String str = "4";
        FileWriter fw1 = new FileWriter("F1.txt", false);
        fw1.write("aghdks djskhdfskf jhj\n 4kjfkjfksd;f\naskddjskfk\n4lgljhfkhf jghg\n 4kjfkjfksd;f\naskddjskfk\n4lgljhfkhf jghg");
        fw1.close();

        List<String> line = new ArrayList<>();
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("F1.txt"), StandardCharsets.UTF_8)) {
            {
                line = reader.lines()
                        .skip(3)
                        .collect(Collectors.toList());
            }
        }
        /*    List<String> lines = Files.readAllLines(Paths.get("F1.txt"));*/

            for (String s : line) {
                /*  if (s.startsWith(str)) {*/
                result.add(s);
            }

            FileWriter fw2 = new FileWriter("F2.txt");
            for (String s : result) {
                // System.out.println(s);
                fw2.write(s + "\n");
                System.out.println(s.replaceFirst(".+\\s", "").length());
            }
        fw2.close();  }
    }

