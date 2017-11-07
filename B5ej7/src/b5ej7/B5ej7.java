/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b5ej7;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class B5ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Figuras obj = new Figuras();

        System.out.println("Introduce los valores para la base, la altura y el radio:");
        obj.setValores(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        obj.calcularValores();
        System.out.println("**** MENU **** \n1- Cuadrado\n2- Circulo\n3- Triangulo\nIntroduce una opcion:");
        int op = sc.nextInt();
        obj.elegirOpcion(op);
        
        
        
    }
    
}
