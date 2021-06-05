/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class Ex {

    /**
     * @param args the command line arguments
     */
    
    public static long fact(int n){
       if (n<=1) return 1;
       else return n*fact(n-1);       
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here

         
          String string_c = JOptionPane.showInputDialog("Введите кол-во итераций");
         int  itr = Integer.parseInt(string_c);
        
        
         try{         
           if ( itr>0)
               throw new ArithmeticException("Error");         
           for(int int i =0; i<=itr; i++)
            JOptionPane.showMessageDialog(null,fact(i));
        
            
        }
        
        catch (ArithmeticException e){
         JOptionPane.showMessageDialog(null, "Неосуществимая математическая операция"); }
        
    }
    
}

