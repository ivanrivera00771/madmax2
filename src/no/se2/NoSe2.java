/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.se2;

import javax.swing.JOptionPane;

/**
 *
 * @author IVAN RIVERA
 */
public class NoSe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una Cadena");
        //System.out.println(cadena);
        
        // no podemos guardar un string en una variable entero
        //Integer es una clase 
        
        entero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero"));
        
        // no se puede guardar un string dentro de un char o caracter
        letra = JOptionPane.showInputDialog("INTRODUCE EL CARACTER").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("INTRODUCI EL DECIMAL"));
        
        
        // ya no se utiliza input porque no es entrada de datos sino se utiliza salida de datos
        
        JOptionPane.showMessageDialog(null, "LA CADENA ES " +cadena);
        JOptionPane.showMessageDialog(null,"EL NUMERO ENTERO ES " + entero);
        JOptionPane.showMessageDialog(null, "EL CARACTER ES  " +letra);
        JOptionPane.showMessageDialog(null, "EL DECIMAL ES  " +decimal );
        
        
                
        
     
        
       
    }
    
    
}
