package com.company;
import javax.swing.*;
///приятно работать в идее


class Transport{

    protected double weight;
    protected int count;
    protected double cost;

    public Transport() {
    }



    public Transport(double wh, int cn, double ct) {
        this.weight=wh;
        this.count=cn;
        this.cost=ct;

    }

    public double getPlaces() {
        return weight;
    }

    public void setPlaces(int places) {
        this.weight = places;
    }

    public int getCount() { return count;}

    public void setCount(int count) { this.count = count;}

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void Ticket( ){


        String string_count = JOptionPane.showInputDialog("Введите кол-во багажа:");
        count = Integer.parseInt(string_count);

        String string_weight = JOptionPane.showInputDialog("Введите вес:");
        weight= Double.parseDouble(string_weight);

        String string_cost = JOptionPane.showInputDialog("Введите стоимость:");
        cost = Double.parseDouble(string_cost);

        var v = weight *count* cost;
        JOptionPane.showMessageDialog(null, "Стоимость багажа: "+v);
    }

}

class Airplane extends Transport {
    double weight;
    int count;
    double cost;

    public Airplane(double weight, int count, double cost) {
        super(weight, count,cost);
    }

    void Ticket_b(){

        super.Ticket();
    }

}

class Train extends Transport {
    double weight;
    int count;
    double cost;
    public Train(double weight, int count, double cost){super(weight,count, cost);}
    void Ticket_tr(){

        super.Ticket();
    }

}

class Auto extends Transport {
    double weight;
    int count;
    public Auto(double weight, int count, double cost){super(weight,count, cost);}
    void Ticket_t(){

        super.Ticket();
    }
}



public class Main {

    public static void main(String[] args) {
        // write your code here

        double  wh=0, ct=0;
        int cn=0;
        Airplane a=new Airplane (wh, cn,ct);
        a.Ticket_b();
        Train tr=new Train(wh, cn,ct);
        tr.Ticket_tr();
        Auto t=new Auto(wh, cn,ct);
        t.Ticket_t();



    }
}
