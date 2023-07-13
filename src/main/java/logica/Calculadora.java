/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Eduard Paez
 */
public interface Calculadora {
    
    public static double calcularIMC (double masaCorporal, double altura){
        return masaCorporal / Math.pow(altura / 100 , 2);
    }
    
    public static String calcularEstado(char genero, double IMC){

          if (genero == 'M') {
            if (IMC < 18.5) {
                return ("Bajo de Peso");
            } else if (IMC >= 18.5 && IMC < 25) {
                return ("Peso Normal");
            } else if (IMC >= 25 && IMC < 30) {
                return ("Sobrepeso");
            } else if (IMC >= 30) {
                return ("Obeso");
            }
        }  else {
            if (IMC < 18.5) {
                return ("Baja de Peso");
            } else if (IMC >= 18.5 && IMC < 24) {
                return ("Peso Normal");
            } else if (IMC >= 24 && IMC < 29) {
                return ("Sobrepeso");
            } else if (IMC >= 29) {
                return ("Obesa");
            }
        }
          return "";
    }
    
     public static String calcularPesoIdeal(char genero, double altura){
        
        final double limiteInferior = 18.5*Math.pow(altura / 100 , 2);
        final double limiteSuperior = (genero == 'M') ? 25*Math.pow(altura / 100 , 2): 24*Math.pow(altura / 100 , 2);
        
        return ("su peso debe estar entre: " + limiteInferior + " y " + limiteSuperior);
    } 
}
