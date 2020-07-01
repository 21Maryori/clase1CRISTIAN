/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasubir;

import java.util.Scanner; 
/**
 * import java.util.Scanner;
 *
 * @author USUARIO
 */
public class PracticaSUBIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int hola; 
        
        System.out.println("escribe un numero");
        hola = entrada.nextInt();
        
      
        
        if (hola == 1 ) {
            System.out.println("Hola");
        } else {
            System.out.println("Hola mundo");
        }
    }
    
}
