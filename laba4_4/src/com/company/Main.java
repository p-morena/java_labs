package com.company;
import java.io.*;
import java.util.ArrayList;



public class Main {


    public static void main(String[] args) throws IOException {
        // write your code here

        String filename = "people.dat";
        // создадим список объектов, которые будем записывать
        ArrayList<Books> b = new ArrayList<Books>();
        b.add(new Books("Tom", "fgfds", "2016", 175, false));
        b.add(new Books("Sam", "fgf", "33", 178, true));




        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(b);
            System.out.println("File has been written");
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        // десериализация в новый список
        ArrayList<Books> newBooks = new ArrayList<Books>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

            newBooks = ((ArrayList<Books>) ois.readObject());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }


        Books result1 = newBooks.stream()
                .filter(x ->"2016".equals(x.getYear()))
                .findAny()
                .orElse(null);

        System.out.println(result1);
    }


    static class Books implements Serializable {
        Books() {
        }

        private String name;
        private String author;
        private String year;
        private int volume;
        private boolean exs;

        Books(String n, String a, String y, int v, boolean e) {
            name = n;
            author = a;
            year = y;
            volume = v;
            exs = e;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public String getYear() {
            return year;
        }

        public int getVolume() {
            return volume;
        }

        public boolean isExs() {
            return exs;
        }


        public void setName(String name) {
            this.name = name;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public void setExs(boolean exs) {
            this.exs = exs;
        }

        @Override
        public String toString() {
            return "Book[" +
                    "name='" + name + '\'' +
                    ", author=" + author +
                    ", year='" + year + '\'' +
                    ", volume=" + volume + '\'' +
                    ",exist=" + exs +
                    "]";
        }
    }
}