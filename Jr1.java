/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jr1;
import java.util.Scanner;
/**
 *
 * @author palon
 */
public class Jr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double v;
      Scanner tec=new Scanner(System.in);
      v=tec.nextDouble();
      v= v*0.277778;
        System.out.println("La velocidad en m/s es: " +v);
              
    }
    
}
