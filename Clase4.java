/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;
import java.util.Scanner;
/**
 *
 * @author pc08
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int i=1;
        System.out.println("Elegi el numero maximo a alcanzar");
        int a=tec.nextInt();
        System.out.println("Numeros del 1 al 100");
        while (i<=a){
        System.out.println(i);
            i++;
    }
    }
}
