/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;
import java.util.Scanner;
/**
 *
 * @author pc08
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int i;
        System.out.println("Elegí el numero maximo a alcanzar");
        int a=tec.nextInt();
        System.out.println("Numeros del 1 al 100");
        for (i=0;i<=a;i++)
        System.out.println(i);
            
    }
    
}
