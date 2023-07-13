/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

/**
 *
 * @author Eduard Paez
 */
public class Main {

    public static void main(String[] args) {
        
        final double masaCorporal = 85; // en Kg
        final double altura = 182; // en centimetros
        final char genero = 'M'; // M: masculino F: femenino
        
        final double IMC = calcularIMC(masaCorporal, altura);
        
        System.out.println("su IMC es: " + IMC);
        mostrarEstado(genero, IMC);
        mostrarPesoIdeal(genero, altura);
        
    }
    
    private static void mostrarEstado(char genero, double IMC){
        System.out.print("Tienes ");

        
          if (genero == 'M') {
            if (IMC < 18.5) {
                System.out.println("Bajo de Peso");
            } else if (IMC >= 18.5 && IMC < 25) {
                System.out.println("Peso Normal");
            } else if (IMC >= 25 && IMC < 30) {
                System.out.println("Sobrepeso");
            } else if (IMC >= 30) {
                System.out.println("Obeso");
            }
        }  else {
            if (IMC < 18.5) {
                System.out.println("Baja de Peso");
            } else if (IMC >= 18.5 && IMC < 24) {
                System.out.println("Peso Normal");
            } else if (IMC >= 24 && IMC < 29) {
                System.out.println("Sobrepeso");
            } else if (IMC >= 29) {
                System.out.println("Obesa");
            }
        }
          
       
    }
        
    
    private static double calcularIMC (double masaCorporal, double altura){
        return masaCorporal / Math.pow(altura / 100 , 2);
    }
    
    private static void mostrarPesoIdeal(char genero, double altura){
        
        final double limiteInferior = 18.5*Math.pow(altura / 100 , 2);
        final double limiteSuperior = (genero == 'M') ? 25*Math.pow(altura / 100 , 2): 24*Math.pow(altura / 100 , 2);
        
        System.out.println("su peso debe estar entre: " + limiteInferior + " y " + limiteSuperior);
    } 
    
    
}
