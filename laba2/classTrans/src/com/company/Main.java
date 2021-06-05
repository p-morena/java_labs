package com.company;
import javax.swing.*;
///приятно работать в идее


class Transport{

   protected int places;
    protected double cost;

       public Transport() {
    }

    public Transport(int pl, double ct) {
           this.places=pl;
           this.cost=ct;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void Ticket( ){

        JOptionPane.showMessageDialog(null, "Введите кол-во мест");
        String string_places = JOptionPane.showInputDialog("Введите число:");
        places= Integer.parseInt(string_places);

        JOptionPane.showMessageDialog(null, "Введите стоимость");
        String string_cost = JOptionPane.showInputDialog("Введите число:");
        cost = Double.parseDouble(string_cost);

        var v = places * cost;
        JOptionPane.showMessageDialog(null, "Билет: "+v);
    }

}

class Bus extends Transport {
    int places;
    double cost;

    public Bus(int places, double cost) {
       super(places, cost);
    }

    void Ticket_b(){

        super.Ticket();
    }

}

class Train extends Transport {
    int places;
    double cost;
    public Train(int places, double cost){super(places, cost);}
    void Ticket_tr(){

        super.Ticket();
    }

}

class Taxi extends Transport {
    int places;
    double cost;
    public Taxi(int places, double cost){super(places, cost);}
    void Ticket_t(){

        super.Ticket();
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        int choose, pl=0;
        double ct=0;
      Bus b=new Bus(pl, ct);
        b.Ticket_b();
       Train tr=new Train(pl,ct);
        tr.Ticket_tr();
        Taxi t=new Taxi(pl,ct);
        t.Ticket_t();



    }
}
