/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provacase;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ProvaCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       
        int opcio; 
    
        System.out.println("Introduix una opció");
        System.out.println("1.Calcular...");
        System.out.println("2.Imprimir...");
        System.out.println("3.Sortir...");
        switch(opcio=entrada.nextInt()){
            case 1:
                System.out.println(opcio+1);
                break;
            case 2:
                System.out.println("Imprimir llistat");
                break; 
            default:
                System.out.println("Opció incorrecta!");
        }
    
    }
    
}
