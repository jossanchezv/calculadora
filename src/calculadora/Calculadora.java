/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
      String num1;
      String num2;
      int i;
      int j;
  
      Scanner s = new Scanner(System.in);
      System.out.println("En que base numerica esta su numero?"); /*pedir base del numero*/
      System.out.println("Digite el numero 1");  
      num1 =  s.nextLine(); /*pedir numero 1*/
      System.out.println("DIgite el numero 2");
      num2 =  s.nextLine(); /*pedir numero 2*/

      char [] A = num1.toCharArray(); //poner numeros 1 y 2 en matrices (A y B)*/
      char [] B = num2.toCharArray();
      
    }
    
}
