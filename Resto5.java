/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto;

import java.util.Scanner;

/**
 *
 * @author pc08
 */
public class Resto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec=new Scanner (System.in);
        System.out.println("Ingrese un número y le mostrare los multiplos de 5 hasta ese numero");
        int num=tec.nextInt();
        int i=0;
       // while (num!=5 || num!=10){
         //////   num=tec.nextInt();
            
        while (i!=num){
            i++;
            if(i%5==0){
                System.out.println(i);
            }
            }
    }    
}
