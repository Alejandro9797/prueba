/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Arrays;

/**
 *
 * @author alex
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        String [] nombres = new String [5];
        int [] edades =  new int  [5];
        String nombre;
        int edad;
        
        for (int i=0; i<nombres.length;i++){
            System.out.println("introduce un nombre; ");
            nombre= Teclat.llegirString();
            System.out.println("introduce una edad: ");
            edad=Teclat.llegirInt();
            nombres[i] = nombre ; 
        }
        
        System.out.println("introduce un nombre de los introducidos: ");
        
        for(int j=0;j<nombres.length;j++){
            System.out.println(nombres[j]+ edades[j] +" ");
        }
    }
}
