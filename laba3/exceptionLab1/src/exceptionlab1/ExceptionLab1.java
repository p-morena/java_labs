/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionlab1;
import javax.swing.*;
/**
 *
 * @author student
 */
public class ExceptionLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c;
        
        String string_a = JOptionPane.showInputDialog("Введите a");
          a = Double.parseDouble(string_a);
        
          String string_b = JOptionPane.showInputDialog("Введите b");
          b= Double.parseDouble(string_b);
         
          String string_c = JOptionPane.showInputDialog("Введите c");
          c = Double.parseDouble(string_c);
        
        try{         
          double result = Math.pow((a-b), (1/2))/c;
          if (Double.isInfinite(result)) throw new ArithmeticException("Error");
          JOptionPane.showMessageDialog(null, "Результат"+result); 
            
        }
        
        catch (ArithmeticException e){
         JOptionPane.showMessageDialog(null, "Недопустимая матматическая операция"); }
         
   
         
        
       
        
    }
}
    
