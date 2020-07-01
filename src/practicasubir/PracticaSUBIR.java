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
        
        String  hola; 
        
        System.out.println("escribe tu nombre");
        hola = entrada.nextLine();
        
        
        System.out.println("hola " + hola);
        
    }
    
}
