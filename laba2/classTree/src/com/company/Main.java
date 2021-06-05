package com.company;
import javax.swing.*;
///приятно работать в идее


class Trees{


    protected double age;

    public Trees() {
    }

    public Trees( double a) {
        this.age=a;

    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }


    public void Remove( ){


        String string_age = JOptionPane.showInputDialog("Введите возраст дерева :");
        age= Double.parseDouble(string_age);
        if (age>=20){JOptionPane.showMessageDialog(null, "Дерево следует пересадить");}
        else {JOptionPane.showMessageDialog(null, "Дерево не нуждаеться в пересадке");}

    }

}

class Apple extends Trees {
    double age;

    public Apple(double age) {
        super( age);
    }

    void Ticket_b(){

        super.Remove();
    }

}

class Cherry extends Trees {

    double age;
    public Cherry(  double age){super(age);}
    void Ticket_tr(){

        super.Remove();
    }

}

class Peach extends Trees {

    double age;
    public Peach( double age){super(age);}
    void Ticket_t(){

        super.Remove();
    }
}



public class Main {

    public static void main(String[] args) {
        // write your code here

        double a=0;
        Apple b=new Apple(a);
        b.Ticket_b();
        Cherry tr=new Cherry(a);
        tr.Ticket_tr();
        Peach t=new Peach(a);
        t.Ticket_t();



    }
}
