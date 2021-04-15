/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.pkg1;
import java.util.Scanner;
/**
 *
 * @author pc08
 */
public class Clase71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int a=tec.nextInt();
        int b=tec.nextInt();
        while (a==b){
            a=tec.nextInt();
        b=tec.nextInt();
        }
         if(a<b){
             System.out.println("El numero " +a+ "es menor");
         }else{
          System.out.println("El numero " +b+ "es menor");
        
       
    }
    
}
