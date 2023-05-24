/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraimc;
import javax.swing.JOptionPane;

/**
 *
 * @author Cetecom
 */
public class CalculadoraIMC {
    
    
    
    public static void main(String[] args) {
        Persona persona = new Persona( );
        
        persona.nombre = JOptionPane.showInputDialog("Nombre: ");
        persona.edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        persona.peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        persona.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
      
        Double imc = persona.peso / (persona.altura*persona.altura);
        String categoria="";
        if (imc <= 16.00){
            categoria = "Infrapeso: Delgadez severa";
        }else if ( imc >= 16.00 && imc <= 16.99){
            categoria = "Infrapeso: Delgadez moderada";
        }else if(imc >= 17.00 && imc <= 18.49){
            categoria = "Infrapeso: Delgadez aceptale";
        }else if (imc >= 18.50 && imc <= 24.99){
            categoria = "Peso normal";
        }else if (imc >= 25.00 && imc <= 29.99){
            categoria = "Sobrepeso";
        }else if (imc >= 30.00 && imc <= 34.99){
            categoria = "Obesidad I";
        }else if (imc >= 35 && imc <= 40.00){
            categoria ="Obesidad II";
        }else {
            categoria = "No exsiste";
        }
        
        JOptionPane.showMessageDialog(null, "La categoria para la persona es: " + categoria);
        
    }
    
}
