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
      int digitosnum1;
      int digitosnum2;
      Scanner s = new Scanner(System.in);
      num1 =  s.nextLine(); /*pedir numero 1*/
      num2 =  s.nextLine(); /*pedir numero 2*/
      digitosnum1 =num1.length(); /*cantidad de digitos en numero 1*/
      digitosnum2 =num2.length(); /*cantidad de digitos en numero 2*/
      char [] A = num1.toCharArray();
      char [] B = num2.toCharArray();
    }
    
}
