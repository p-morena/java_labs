package com.company;
import javax.swing.*;

import static java.lang.Integer.parseInt;
///приятно работать в идее


class Worker{


    protected int count;
    protected double cost;

    public Worker() {
    }



    public Worker( int cn, double ct) {

        this.count=cn;
        this.cost=ct;

    }



    public int getCount() { return count;}

    public void setCount(int count) { this.count = count;}

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void Salary( ){


        String string_count = JOptionPane.showInputDialog("Введите кол-во отработаных часов:");
        count = parseInt(string_count);


        String string_cost = JOptionPane.showInputDialog("Введите ставку за час:");
        cost = Double.parseDouble(string_cost);

        var v =count* cost;
        JOptionPane.showMessageDialog(null, "Зарплата: "+v);
    }

}

class Maneger extends Worker {

    int count;
    double cost;

    public Maneger( int count, double cost) {
        super(count,cost);
    }

    void Salary_b(){

        super.Salary();
    }

}

class Analyst extends Worker {

    int count;
    double cost;
    public Analyst( int count, double cost){super(count, cost);}
    void Salary_tr(){

        super.Salary();
    }

}

class Programmer extends Worker {
    double cost;
    int count;
    public Programmer( int count, double cost){super(count, cost);}
    void Salary_t(){

        super.Salary();
    }
}


class QA extends Worker {
    double weight;
    int count;
    public QA( int count, double cost){super(count, cost);}
    void Salary_t(){

        super.Salary();
    }
}


class Designer extends Worker {
    double weight;
    int count;
    public Designer( int count, double cost){super(count, cost);}
    void Salary_t(){

        super.Salary();
    }
}












public class Main {

    public static void main(String[] args) {
        // write your code here

        double  ct=0;
        int cn=0;
        Maneger a=new Maneger ( cn,ct);
        a.Salary_b();

        Analyst tr=new Analyst( cn,ct);
        tr.Salary_tr();

        Programmer t=new Programmer( cn,ct);
        t.Salary_t();

        QA q=new QA( cn,ct);
        q.Salary_t();

        Designer d=new Designer( cn,ct);
        d.Salary_t();


    }
}
