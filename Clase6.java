/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;
import java.util.Scanner;
/**
 *
 * @author pc08
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1;
        Scanner tec=new Scanner(System.in);
        System.out.println("Elegi el numero maximo a alcanzar");
        int a=tec.nextInt();
        System.out.println("Numeros del 1 al 100");
        do{
        System.out.println(i);
            i++;}
        while (i<=a);
    }
    }
        
